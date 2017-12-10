package ccs.archi.component;

import java.util.HashMap;
import java.util.Map;

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

public class ConnectionManager extends ComponentImpl implements ICommonElement, IObservable {

	private IObserver observer;
	private Map<String, Boolean> connectedUsers;

	public enum RequestType {
		Login, Logout, UserInfos, Failure
	}

	public enum PortName {
		connectionRequestPort, connectionResponsePort, connectionToSecurity, connectionToDatabase, responseFromDatabasePort, responseFromSecurityPort

	}

	public ConnectionManager() {
		this.icomponentelement = new BasicEList<IComponentElement>();
		connectedUsers = new HashMap<String, Boolean>();
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

	@Override
	public void SetObserver(IObserver anObserver) {
		this.observer = anObserver;
		this.observer.AddObservable(this);

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

	@SuppressWarnings("incomplete-switch")
	@Override
	protected void Work(IComponentElement changedInput) {
		super.Work(changedInput);
		Object changedElementValue = ((InterfaceElement) changedInput).getContainedValue();
		if (changedInput == getPortByName(PortName.connectionRequestPort)) {
			switch (checkRequestType((String) changedElementValue)) {
			case Login:
				SetComponentElementValue(getPortByName(PortName.connectionToSecurity), changedElementValue);
			case Failure:
				SetComponentElementValue(getPortByName(PortName.connectionResponsePort), "failure");
			case UserInfos:
				SetComponentElementValue(getPortByName(PortName.connectionToDatabase), changedElementValue);

			case Logout:
				if (connectedUsers.containsKey((String) changedElementValue)) {
					connectedUsers.put((String) changedElementValue, false);
				}
			}
			if (changedInput == getPortByName(PortName.responseFromDatabasePort)) {
				SetComponentElementValue(getPortByName(PortName.connectionResponsePort), changedElementValue);
			}
			if (changedInput == getPortByName(PortName.responseFromSecurityPort)) {
				String id = ((String) changedElementValue).split(":")[0];
				Boolean isConnnected = ((String) changedElementValue).split(":")[1].equals("true");

				if (!id.equals("") && connectedUsers.containsKey(id)) {
					if (isConnnected) {
						connectedUsers.put(id, isConnnected);
					}
				}

				SetComponentElementValue(getPortByName(PortName.connectionResponsePort), isConnnected);

			}
		}

	}

	public RequestType checkRequestType(String request) {
		String[] informations = request.split(":");
		if (informations[0].equals("login"))
			return RequestType.Login;
		
		else if (informations[0].equals("logout"))    {
			return RequestType.Logout;
		}
		else {
			if (connectedUsers.containsKey(informations[1]) && connectedUsers.get(informations[1])) {
				return RequestType.UserInfos;
			} else
				return RequestType.Failure;

		}
		
	}

	/* return port by given name */
	public Port getPortByName(PortName name) {
		switch (name) {
		case connectionRequestPort:
			return (Port) icomponentelement.get(0);
		case connectionResponsePort:
			return (Port) icomponentelement.get(1);
		case connectionToDatabase:
			return (Port) icomponentelement.get(2);
		case connectionToSecurity:
			return (Port) icomponentelement.get(3);
		case responseFromDatabasePort:
			return (Port) icomponentelement.get(4);
		case responseFromSecurityPort:
			return (Port) icomponentelement.get(5);

		}
		return null;
	}
}
