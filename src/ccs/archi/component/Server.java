package ccs.archi.component;

import ccs.archi.configuration.ServerDetail;
import ccsM2.Configuration;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.*;

public class Server extends ComponentImpl {
	
	public enum PortName{
		receive_request,
		responseToClientPort,
		serverRequestRedirectPort,
		responseFromDetailPort
		
	}
	
	public Server() {

		this.configuration = new ServerDetail();
		
		/* Ports setup for client communication */ 
		Port receive_request = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseToClientPort = CCSFactoryImpl.eINSTANCE.createPort();
		
		receive_request.setMode(Mode.REQUIRED);
		responseToClientPort.setMode(Mode.OFFERED);
	
		this.icomponentelement.add(receive_request);
		this.icomponentelement.add(responseToClientPort);
		
		/* Ports setup for detail communication */
		Port serverRequestRedirectPort =  CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromDetailPort = CCSFactoryImpl.eINSTANCE.createPort();
		
		serverRequestRedirectPort.setMode(Mode.OFFERED);
		responseFromDetailPort.setMode(Mode.REQUIRED);
		
		this.icomponentelement.add(serverRequestRedirectPort);
		this.icomponentelement.add(responseFromDetailPort);
	}
	
	public Port GetPortByName(PortName name) {
		switch(name) {
		case receive_request:
			return (Port)this.icomponentelement.get(0);
		case responseToClientPort:
			return (Port)this.icomponentelement.get(1);
		case serverRequestRedirectPort:
			return (Port)this.icomponentelement.get(2);
		case responseFromDetailPort:
			return (Port)this.icomponentelement.get(3);
		}
		return null;
	}

}
