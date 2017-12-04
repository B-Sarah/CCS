package ccs.archi.component;

import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ComponentImpl;

public class Client extends ComponentImpl {
	

	public enum PortName{
		send_request,
		ClientRequestPort 
	}
	

	public Client() {
		//init communication port (client<->server) 
		Port send_request = CCSFactoryImpl.eINSTANCE.createPort();
		send_request.setMode(Mode.OFFERED);
		
		//init request redirect port( client->clientServer)
		Port ClientRequestPort =  CCSFactoryImpl.eINSTANCE.createPort();
		ClientRequestPort.setMode(Mode.OFFERED);
		
		this.icomponentelement.add(send_request);
		this.icomponentelement.add(send_request);
	}

}
