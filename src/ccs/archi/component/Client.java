package ccs.archi.component;

import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ComponentImpl;

public class Client extends ComponentImpl {
	

	public enum PortName{
		send_request,
		ClientRequestPort,
		ClientResponsePort
		
	}
	

	public Client() {
		//init communication port (client->server) 
		Port send_request = CCSFactoryImpl.eINSTANCE.createPort();
		send_request.setMode(Mode.OFFERED);
		this.icomponentelement.add(send_request);
		
		//init request redirect port( client->clientServer)
		Port ClientRequestPort =  CCSFactoryImpl.eINSTANCE.createPort();
		ClientRequestPort.setMode(Mode.REQUIRED);
		this.icomponentelement.add(ClientRequestPort);
		
		//init communication port (server->client) 
		Port ClientResponsePort = CCSFactoryImpl.eINSTANCE.createPort();
		ClientResponsePort.setMode(Mode.OFFERED);
		this.icomponentelement.add(ClientResponsePort);
				
	}

	/* return port by given name */
	@SuppressWarnings("incomplete-switch")
	public Port getPortByName(PortName name) {
		switch (name) {
		case send_request : return (Port) icomponentelement.get(0);
		case ClientRequestPort : return (Port) icomponentelement.get(1);
		case ClientResponsePort : return (Port) icomponentelement.get(2);
		}
		return null;
	}
}
