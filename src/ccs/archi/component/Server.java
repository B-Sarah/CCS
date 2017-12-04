package ccs.archi.component;

import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.ComponentImpl;

public class Server extends ComponentImpl {
	
	public enum PortName{
		receive_request = 0,
		serverRequestRedirectPort = 1
	}
	
	public Server() {
		Port receive_request = new Port();
		receive_request.setMode(Mode.REQUIRED);
		Port serverRequestRedirectPort = new Port();
		serverRequestRedirectPort.setMode(Mode.OFFERED);
		
		this.icomponentelement.add(receive_request);
		this.icomponentelement.add(serverRequestRedirectPort);
	}

}
