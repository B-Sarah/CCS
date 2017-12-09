package ccs.archi.configuration;

import ccs.archi.component.Client;
import ccs.archi.component.Server;
import ccs.archi.connector.RPC;
import ccsM2.Attachement;
import ccsM2.ILink;
import ccsM2.Port;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ConfigurationImpl;

public class ClientServer extends ConfigurationImpl {
	
	

	public ClientServer() {
		Server server = new Server();
		this.component.add(server);
	}
	
	public Server GetServer() {
		//Server always at 0
		return (Server)this.component.get(0);
	}
	
	public Client CreateNewClient() {
		//Client that will be returned
		Client newClient = new Client();
		
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
		
		//Add created objects to the configuration's item list
		this.component.add(newClient);
		this.connector.add(rpc);
		this.ilink.add(clientToRpc);
		this.ilink.add(rpcToServer);
		this.ilink.add(serverToRpc);
		this.ilink.add(rpcToClient);
		
		return newClient;
	}
	
	

}
