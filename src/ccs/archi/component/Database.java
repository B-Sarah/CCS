package ccs.archi.component;

import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ComponentImpl;

public class Database extends ComponentImpl {

	public enum PortName{
		databaseToSecurityPort,
		databaseToConnectionPort,
		SecurityToDatabasePort,
		ConnectionToDatabasePort
	}
	
	public Database() {
		
		Port databaseToSecurityPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port databaseToConnectionPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port SecurityToDatabasePort = CCSFactoryImpl.eINSTANCE.createPort();
		Port ConnectionToDatabasePort = CCSFactoryImpl.eINSTANCE.createPort();
		
		databaseToSecurityPort.setMode(Mode.OFFERED);
		databaseToConnectionPort.setMode(Mode.OFFERED);
		SecurityToDatabasePort.setMode(Mode.REQUIRED);
		ConnectionToDatabasePort.setMode(Mode.REQUIRED);
		
		this.icomponentelement.add(databaseToSecurityPort);
		this.icomponentelement.add(databaseToConnectionPort);

		this.icomponentelement.add(SecurityToDatabasePort);
		this.icomponentelement.add(ConnectionToDatabasePort);
	}

}
