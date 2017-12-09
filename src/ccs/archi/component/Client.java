package ccs.archi.component;

import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ComponentImpl;

public class Client extends ComponentImpl {
	

	public enum PortName{
		send_request,
		request_response,
		ClientRequestPort,
		ClientResponsePort
		
	}
	

	public Client() {
		//init communication port (client->server) 
		Port send_request = CCSFactoryImpl.eINSTANCE.createPort();
		Port request_response = CCSFactoryImpl.eINSTANCE.createPort();
		
		send_request.setMode(Mode.OFFERED);
		request_response.setMode(Mode.REQUIRED);
		
		this.icomponentelement.add(send_request);
		this.icomponentelement.add(request_response);
		
		
		/* Ports setup for outside communication */
		//init request redirect port( clientServer->client)
		Port ClientRequestPort =  CCSFactoryImpl.eINSTANCE.createPort();
		//init communication port (client->clientServer) 
		Port ClientResponsePort = CCSFactoryImpl.eINSTANCE.createPort();
		
		ClientRequestPort.setMode(Mode.REQUIRED);
		ClientResponsePort.setMode(Mode.OFFERED);
		
		this.icomponentelement.add(ClientResponsePort);
		this.icomponentelement.add(ClientRequestPort);
	}

	/* return port by given name */
	public Port getPortByName(PortName name) {
		switch (name) {
		case send_request : return (Port) icomponentelement.get(0);
		case request_response : return (Port) icomponentelement.get(1);
		case ClientRequestPort : return (Port) icomponentelement.get(2);
		case ClientResponsePort : return (Port) icomponentelement.get(3);
		}
		return null;
	}
}
