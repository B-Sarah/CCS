package ccs.archi.component;

import ccs.archi.interfaces.ICommonElement;
import ccsM2.CCSFactory;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.ComponentImpl;

public class ConnectionManager extends ComponentImpl implements ICommonElement{

	public enum PortName {
		connectionRequestPort, connectionResponsePort, connectionToSecurity, connectionToDatabase, responseFromDatabasePort, responseFromSecurityPort

	}

	public ConnectionManager() {
		initPort();

	}

	 public void initPort() {
		Port connectionRequestPort = CCSFactory.eINSTANCE.createPort();
		Port connectionResponsePort = CCSFactory.eINSTANCE.createPort();
		Port connectionToSecurity = CCSFactory.eINSTANCE.createPort();
		Port connectionToDatabase = CCSFactory.eINSTANCE.createPort();
		Port responseFromDatabasePort = CCSFactory.eINSTANCE.createPort();
		Port responseFromSecurityPort = CCSFactory.eINSTANCE.createPort();

		connectionRequestPort.setMode(Mode.REQUIRED);
		connectionResponsePort.setMode(Mode.OFFERED);
		connectionToDatabase.setMode(Mode.OFFERED);
		connectionToSecurity.SetMode(Mode.OFFERED);
		responseFromDatabasePort.SetMode(Mode.REQUIRED);
		responseFromSecurityPort.setMode(Mode.REQUIRED);

		this.icomponentelement.add(connectionRequestPort);
		this.icomponentelement.add(connectionResponsePort);
		this.icomponentelement.add(connectionToDatabase);
		this.icomponentelement.add(connectionToSecurity);
		this.icomponentelement.add(responseFromSecurityPort);
		this.icomponentelement.add(responseFromDatabasePort);
	}

}
