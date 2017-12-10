package ccs.archi.configuration;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;

import ccs.archi.component.Client;
import ccs.archi.component.Server;
import ccs.archi.connector.RPC;
import ccs.archi.interfaces.ICommonElement;
import ccs.archi.interfaces.IObservable;
import ccs.archi.interfaces.IObserver;
import ccsM2.Attachement;
import ccsM2.Binding;
import ccsM2.InterfaceElement;
import ccsM2.Port;
import ccsM2.PortConfiguration;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ConfigurationImpl;
import ccsM2.Component;
import ccsM2.Connector;
import ccsM2.ILink;

public class ClientServer extends ConfigurationImpl implements ICommonElement, IObserver {
	
	private List<IObservable> observables = new ArrayList<IObservable>();
	
	//hold a record of which port corresponds to which client
	Map<Client, PortConfiguration> mapClientToRequestPort;
	Map<Client, PortConfiguration> mapClientToResponsePort;


	public ClientServer() {
		Server server = new Server();
		server.SetObserver(this);
		this.component = new BasicEList<Component>();
		this.connector = new BasicEList<Connector>();
		this.ilink = new BasicEList<ILink>();
		this.portconfiguration = new BasicEList<PortConfiguration>();
		this.component.add(server);
		
		mapClientToRequestPort = new HashMap<Client, PortConfiguration>();
		mapClientToResponsePort = new HashMap<Client, PortConfiguration>();
		
		initPort();
		
	}
	
	public Server GetServer() {
		//Server always at 0
		return (Server)this.component.get(0);
	}
	
	public Client addNewClient(Client newClient) {
		newClient.SetName(newClient.GetName() + "_" + this.component.size());
		//First, create the RPC that will link to server
		RPC rpc = new RPC();
		
		//Then, create attachements for in/out communication
		//between RPC/Server
		Attachement rpcToServer = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement serverToRpc = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		//Then, create attachement for in/out, client side
		//with RPC
		Attachement rpcToClient = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement clientToRpc = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		//Link client->rpc
		clientToRpc.setIcomponentelement(newClient.getPortByName(Client.PortName.send_request));
		clientToRpc.setRole(rpc.GetRoleByName(RPC.RoleName.caller));
		//Link rpc->server
		rpcToServer.setRole(rpc.GetRoleByName(RPC.RoleName.called));
		rpcToServer.setIcomponentelement(GetServer().GetPortByName(Server.PortName.receive_request));
		//Link server->rpc
		serverToRpc.setIcomponentelement(GetServer().GetPortByName(Server.PortName.responseToClientPort));
		serverToRpc.setRole(rpc.GetRoleByName(RPC.RoleName.calledResponse));
		//Link rpc->client
		rpcToClient.setRole(rpc.GetRoleByName(RPC.RoleName.callerResponse));
		rpcToClient.setIcomponentelement(newClient.getPortByName(Client.PortName.request_response));
		
		newClient.SetObserver(this);
		rpc.SetObserver(this);
		
		//Add created objects to the configuration's item list
		this.component.add(newClient);
		this.connector.add(rpc);
		this.ilink.add(clientToRpc);
		this.ilink.add(rpcToServer);
		this.ilink.add(serverToRpc);
		this.ilink.add(rpcToClient);
		
		//ClientServer configuration needs to have a new port to link the outside for this client
		PortConfiguration cSResponsePort = CCSFactoryImpl.eINSTANCE.createPortConfiguration();
		PortConfiguration cSRequestPort = CCSFactoryImpl.eINSTANCE.createPortConfiguration();
		this.portconfiguration.add(cSResponsePort);
		this.portconfiguration.add(cSRequestPort);

		//add binding between client and configuration
		Binding clientToCS = CCSFactoryImpl.eINSTANCE.createBinding();
		Binding cSToClient = CCSFactoryImpl.eINSTANCE.createBinding();
		
		clientToCS.setPort(newClient.getPortByName(Client.PortName.ClientResponsePort));
		clientToCS.setPortconfiguration(cSResponsePort);
		
		cSToClient.setPortconfiguration(cSRequestPort);
		cSToClient.setPort(newClient.getPortByName(Client.PortName.ClientRequestPort));
		
		mapClientToRequestPort.put(newClient, cSRequestPort);
		mapClientToResponsePort.put(newClient, cSResponsePort);
		
		this.ilink.add(clientToCS);
		this.ilink.add(cSToClient);
		
		return newClient;
	}

	@Override
	public List<IObservable> AddObservable(IObservable anObservable) {
		if(!this.observables.contains(anObservable))
			this.observables.add(anObservable);
		return this.observables;
	}

	@Override
	public void ReceivedNotification(InterfaceElement notifier) {
		Attachement attachement;
		Binding binding;
		
		//retrieve attachement linked to notifier
		attachement = this.GetAttachementFromElement(notifier);
		//case we find an attachement, not a binding
		if(attachement != null) {
			//case we need to redirect to component 
			if(attachement.getRole() == notifier) { 		// == notifier instanceof Role
				GetComponentContainingElement(attachement.getIcomponentelement()).
					SetComponentElementValue(attachement.getIcomponentelement(), notifier.getContainedValue());
			} else { //case we need to redirect to port
				GetConnectorContainingRole(attachement.getRole()).SetRoleValue(attachement.getRole(), notifier.getContainedValue());
			}	
		//otherwise ths notification concerns a binding 
		} else { 
			//retrieve binding linked to notifier
			binding = GetBindingFromElement(notifier);
			if(binding != null){
				//case we have a portConfiguration and need to redirect to the element port
				if(binding.getPortconfiguration() == notifier) {
					GetComponentContainingElement(binding.getPort()).SetComponentElementValue(binding.getPort(), notifier.getContainedValue());
				} else { //case the configuration itself is receiver of the notification
					this.portconfiguration.get(this.portconfiguration.indexOf(binding.getPortconfiguration())).setContainedValue(notifier.getContainedValue());
					Work(binding.getPortconfiguration());
				}
			}
		}
		
		

	}
	
	@Override
	protected void Work(PortConfiguration inputChanged) {
		super.Work(inputChanged);
	}

	@Override
	public void initPort() {

	}
	
	
	
	public PortConfiguration GetResponsePortOf(Client aClient) {
		return mapClientToResponsePort.get(aClient);
	}
	
	public PortConfiguration GetRequestPortOf(Client aClient) {
		return mapClientToRequestPort.get(aClient);
	}
	
	public void SendClientRequest(Client aClient, Object request) {
		GetRequestPortOf(aClient).setContainedValue(request);
		ReceivedNotification(GetRequestPortOf(aClient));
	}

}
