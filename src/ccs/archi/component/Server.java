package ccs.archi.component;

import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.*;

public class Server extends ComponentImpl {
	
	public enum PortName{
		receive_request,
		serverRequestRedirectPort,
		responseFromDetailPort,
		responseToClientPort
	}
	
	public Server() {
		Port receive_request = CCSFactoryImpl.eINSTANCE.createPort();
		receive_request.setMode(Mode.REQUIRED);
		
		Port serverRequestRedirectPort =  CCSFactoryImpl.eINSTANCE.createPort();
		serverRequestRedirectPort.setMode(Mode.OFFERED);
		
		Port responseFromDetailPort = CCSFactoryImpl.eINSTANCE.createPort();
		responseFromDetailPort.setMode(Mode.REQUIRED);
		
		Port responseToClientPort = CCSFactoryImpl.eINSTANCE.createPort();
		responseToClientPort.setMode(Mode.OFFERED);
		
		
		this.icomponentelement.add(receive_request);
		this.icomponentelement.add(serverRequestRedirectPort);
	}

}
