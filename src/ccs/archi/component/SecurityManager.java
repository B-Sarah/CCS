package ccs.archi.component;

import org.eclipse.emf.common.util.BasicEList;

import ccs.archi.interfaces.ICommonElement;
import ccs.archi.interfaces.IObservable;
import ccs.archi.interfaces.IObserver;
import ccsM2.CCSFactory;
import ccsM2.IComponentElement;
import ccsM2.InterfaceElement;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.ComponentImpl;

public class SecurityManager extends ComponentImpl implements ICommonElement, IObservable {

	private IObserver observer;
	private String lastUserLogInfos = null;

	public enum PortName {
		securityToDatabase, securityToConnection, responseFromConnection, responseFromDatabase

	}

	public SecurityManager() {
		this.icomponentelement = new BasicEList<IComponentElement>();
		initPort();

	}

	public void initPort() {
		Port securityToDatabase = CCSFactory.eINSTANCE.createPort();
		Port securityToConnection = CCSFactory.eINSTANCE.createPort();
		Port responseFromConnection = CCSFactory.eINSTANCE.createPort();
		Port responseFromDatabase = CCSFactory.eINSTANCE.createPort();

		securityToDatabase.setMode(Mode.OFFERED);
		securityToConnection.setMode(Mode.OFFERED);
		responseFromConnection.setMode(Mode.REQUIRED);
		responseFromDatabase.SetMode(Mode.REQUIRED);

		this.icomponentelement.add(securityToDatabase);
		this.icomponentelement.add(securityToConnection);
		this.icomponentelement.add(responseFromConnection);
		this.icomponentelement.add(responseFromDatabase);
	}

	@Override
	public void SetObserver(IObserver anObserver) {
		this.observer = anObserver;
		observer.AddObservable(this);

	}

	@Override
	public void NotifyObserver(InterfaceElement elementChanged) {
		this.observer.ReceivedNotification(elementChanged);

	}

	@Override
	public void SetComponentElementValue(IComponentElement element, Object value) {
		super.SetComponentElementValue(element, value);
		if (((InterfaceElement) element).getMode() == Mode.OFFERED)
			NotifyObserver((InterfaceElement) element);
		else
			Work(element);
	}

	@Override
	protected void Work(IComponentElement changedInput) {
		super.Work(changedInput);
		Object response = ((InterfaceElement) changedInput).getContainedValue();

		if (changedInput == getPortByName(PortName.responseFromConnection)) {
			lastUserLogInfos = ((String) response).split(":")[1] + ":" + ((String) response).split(":")[1];
			SetComponentElementValue(getPortByName(PortName.securityToDatabase), response);
		}
		if (changedInput == getPortByName(PortName.responseFromDatabase)) {
			String idEntered = lastUserLogInfos.split(":")[0];
			String passwordEntered = lastUserLogInfos.split(":")[1];

			String correctPassword = ((String) response).split(":")[1];
			if (lastUserLogInfos != null && passwordEntered.equals(correctPassword)) {
				response = idEntered + ":" + "true";
			} else {
				lastUserLogInfos = null;
				response = idEntered + ":" + "false";
			}
		}
		SetComponentElementValue(getPortByName(PortName.securityToConnection), response);
	}

	
	/* return port by given name */
	public Port getPortByName(PortName name) {
		switch (name) {
		case securityToDatabase:
			return (Port) icomponentelement.get(0);
		case securityToConnection:
			return (Port) icomponentelement.get(1);
		case responseFromConnection:
			return (Port) icomponentelement.get(2);
		case responseFromDatabase:
			return (Port) icomponentelement.get(3);
		}
		return null;
	}

}
