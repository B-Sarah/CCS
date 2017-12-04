package ccs.archi.component;

import ccs.archi.configuration.ServerDetail;
import ccsM2.Configuration;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.*;

public class Server extends ComponentImpl {
	
	public enum PortName{
		receive_request,
		serverRequestRedirectPort 
	}
	
	public Server() {
		Port receive_request = CCSFactoryImpl.eINSTANCE.createPort();
		receive_request.setMode(Mode.REQUIRED);
		Port serverRequestRedirectPort =  CCSFactoryImpl.eINSTANCE.createPort();
		serverRequestRedirectPort.setMode(Mode.OFFERED);
		
		this.configuration = new ServerDetail();
		
		this.icomponentelement.add(receive_request);
		this.icomponentelement.add(serverRequestRedirectPort);
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
