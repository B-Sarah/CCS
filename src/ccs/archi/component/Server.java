package ccs.archi.component;

import ccs.archi.configuration.ServerDetail;
import ccsM2.Configuration;
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

		this.configuration = new ServerDetail();
		
		Port receive_request = CCSFactoryImpl.eINSTANCE.createPort();
		Port serverRequestRedirectPort =  CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromDetailPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseToClientPort = CCSFactoryImpl.eINSTANCE.createPort();
		
		receive_request.setMode(Mode.REQUIRED);
		serverRequestRedirectPort.setMode(Mode.OFFERED);
		responseFromDetailPort.setMode(Mode.REQUIRED);
		responseToClientPort.setMode(Mode.OFFERED);
	
		
		this.icomponentelement.add(receive_request);
		this.icomponentelement.add(serverRequestRedirectPort);
		this.icomponentelement.add(responseFromDetailPort);
		this.icomponentelement.add(responseToClientPort);
	}
	
	public Port GetPortByName(PortName name) {
		switch(name) {
		case receive_request:
			return (Port)this.icomponentelement.get(0);
		case serverRequestRedirectPort:
			return (Port)this.icomponentelement.get(1);
		}
		return null;
	}

}
