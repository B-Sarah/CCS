package ccs.archi.component;

import java.util.ArrayList;
import java.util.List;
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
		this.icomponentelement = new BasicEList<IComponentElement>();
		initPort();
	}

	public Map<String, User> getUsersInformations() {
		return usersInformations;
	}

	public User getUserInformations(String id) {
		return usersInformations.get(id);
	}

	
	private boolean processRequestAuth(String id, String password) {
		if (!id.isEmpty() && !password.isEmpty())
			if (usersInformations.get(id).getPassword().equals(password))
				return true;

		return false;

	}

	private List<String> processRequestUserInfo(String id, boolean isAuth) {
		ArrayList<String> infoList = new ArrayList<String>();
		if (usersInformations.get(id) != null) {
			if (!isAuth)
				return null;
			infoList.add(usersInformations.get(id).getFname());
			infoList.add(usersInformations.get(id).getLname());
			infoList.add(usersInformations.get(id).getMeetings());

		}

		return infoList;

	}

	public enum PortName {
		databaseToSecurityPort, databaseToConnectionPort, responseFromSecurityPort, responseFromConnectionPort
	}

	public void initPort() {
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
		// SetComponentElementValue(GetPortByName(PortName.),
		// (Integer)((InterfaceElement)changedInput).getContainedValue() * 2);
	}

}
