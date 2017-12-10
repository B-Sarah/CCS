package ccs.archi.configuration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import ccs.archi.component.Client;
import ccs.archi.component.Server;
import ccs.archi.connector.RPC;
import ccs.archi.interfaces.ICommonElement;
import ccs.archi.interfaces.IObservable;
import ccs.archi.interfaces.IObserver;
import ccsM2.Attachement;
import ccsM2.InterfaceElement;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ConfigurationImpl;
import ccsM2.Component;
import ccsM2.Connector;
import ccsM2.ILink;

public class ClientServer extends ConfigurationImpl implements ICommonElement, IObserver {
	
	private List<IObservable> observables = new ArrayList<IObservable>();

	public ClientServer() {
		Server server = new Server();
		server.SetObserver(this);
		this.component = new BasicEList<Component>();
		this.connector = new BasicEList<Connector>();
		this.ilink = new BasicEList<ILink>();
		this.component.add(server);
		initPort();
	}
	
	public Server GetServer() {
		//Server always at 0
		return (Server)this.component.get(0);
	}
	
	public Client addNewClient(Client newClient) {
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
		//retrieve attachement linked to notifier
		Attachement linker = this.GetAttachementFromElement(notifier);
		//case we need to redirect to component 
		if(linker.getRole() == notifier) { 		// == notifier instanceof Role
			GetComponentContainingElement(linker.getIcomponentelement()).
				SetComponentElementValue(linker.getIcomponentelement(), notifier.getContainedValue());
		} else {
			GetConnectorContainingRole(linker.getRole()).SetRoleValue(linker.getRole(), notifier.getContainedValue());
		}
	}

	@Override
	public void initPort() {

	}
	
	

}
