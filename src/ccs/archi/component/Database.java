package ccs.archi.component;

import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;

import ccs.archi.interfaces.ICommonElement;
import ccs.archi.interfaces.IObservable;
import ccs.archi.interfaces.IObserver;
import ccs.archi.repository.User;
import ccsM2.IComponentElement;
import ccsM2.InterfaceElement;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ComponentImpl;

public class Database extends ComponentImpl implements ICommonElement, IObservable {
	private IObserver observer;
	private Map<String, User> usersInformations;

	public Database() {
		this.name = "Database";
		this.icomponentelement = new BasicEList<IComponentElement>();
		initElements();
	}

	public Map<String, User> getUsersInformations() {
		return usersInformations;
	}

	public User getUserInformations(String id) {
		if (usersInformations.containsKey(id))
			return usersInformations.get(id);
		return null;
	}

	public enum PortName {
		databaseToSecurityPort, databaseToConnectionPort, responseFromSecurityPort, responseFromConnectionPort
	}

	public void initElements() {
		Port databaseToSecurityPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port databaseToConnectionPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromSecurityPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromConnectionPort = CCSFactoryImpl.eINSTANCE.createPort();

		databaseToSecurityPort.setMode(Mode.OFFERED);
		databaseToConnectionPort.setMode(Mode.OFFERED);
		responseFromSecurityPort.setMode(Mode.REQUIRED);
		responseFromConnectionPort.setMode(Mode.REQUIRED);
		
		databaseToSecurityPort.SetName("databaseToSecurityPort");
		databaseToConnectionPort.SetName("databaseToConnectionPort");
		responseFromSecurityPort.SetName("responseFromSecurityPort");
		responseFromConnectionPort.SetName("responseFromConnectionPort");

		this.icomponentelement.add(databaseToSecurityPort);
		this.icomponentelement.add(databaseToConnectionPort);
		this.icomponentelement.add(responseFromSecurityPort);
		this.icomponentelement.add(responseFromConnectionPort);
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
		String id = ((String) response).split(":")[1];

		if (changedInput == getPortByName(PortName.responseFromSecurityPort)) {
			if (getUserInformations(id) != null) {
				response = id + ":" + getUserInformations(id).getPassword();
			} else {
				response = "";
			}

			SetComponentElementValue(getPortByName(PortName.databaseToSecurityPort), response);
		}
		if (changedInput == getPortByName(PortName.responseFromConnectionPort)) {
			if (getUserInformations(id) != null)
				response = getUserInformations(id).toString();
			else {
				response = "";
			}

		}
		SetComponentElementValue(getPortByName(PortName.databaseToConnectionPort), response);
	}

	/* return port by given name */
	public Port getPortByName(PortName name) {
		switch (name) {
		case databaseToSecurityPort:
			return (Port) icomponentelement.get(0);
		case databaseToConnectionPort:
			return (Port) icomponentelement.get(1);
		case responseFromSecurityPort:
			return (Port) icomponentelement.get(2);
		case responseFromConnectionPort:
			return (Port) icomponentelement.get(3);
		}
		return null;
	}

}
