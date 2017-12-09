package ccs.archi.component;

import ccs.archi.interfaces.ICommonElement;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ComponentImpl;

public class Database extends ComponentImpl implements ICommonElement {

	public enum PortName {
		databaseToSecurityPort, databaseToConnectionPort,responseFromSecurityPort,responseFromConnectionPort
	}

	public Database() {

		initPort();
	}

	private void initPort() {
		Port databaseToSecurityPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port databaseToConnectionPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromSecurityPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromConnectionPort = CCSFactoryImpl.eINSTANCE.createPort();

		databaseToSecurityPort.setMode(Mode.OFFERED);
		databaseToConnectionPort.setMode(Mode.OFFERED);
		responseFromSecurityPort.setMode(Mode.REQUIRED);
		responseFromConnectionPort.setMode(Mode.REQUIRED);

		this.icomponentelement.add(databaseToSecurityPort);
		this.icomponentelement.add(databaseToConnectionPort);
		this.icomponentelement.add(responseFromSecurityPort);
		this.icomponentelement.add(responseFromConnectionPort);
	}

}
