package ccs.archi.component;

import ccsM2.CCSFactory;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.ComponentImpl;

public class SecurityManager extends ComponentImpl {
	public enum PortName {
		securityToDatabase, securityToConnection, responseFromSecurity, responseFromDatabase

	}

	
	public SecurityManager() {
		initPort();

	}


	private void initPort() {
		Port securityToDatabase = CCSFactory.eINSTANCE.createPort();
		Port securityToConnection = CCSFactory.eINSTANCE.createPort();
		Port responseFromSecurity = CCSFactory.eINSTANCE.createPort();
		Port responseFromDatabase = CCSFactory.eINSTANCE.createPort();

		securityToDatabase.setMode(Mode.REQUIRED);
		securityToConnection.setMode(Mode.OFFERED);
		responseFromSecurity.setMode(Mode.REQUIRED);
		responseFromDatabase.SetMode(Mode.REQUIRED);

		this.icomponentelement.add(securityToDatabase);
		this.icomponentelement.add(securityToConnection);
		this.icomponentelement.add(responseFromSecurity);
		this.icomponentelement.add(responseFromDatabase);
	}

}
