package ccs.archi.component;

import org.eclipse.emf.common.util.BasicEList;

import ccs.archi.interfaces.ICommonElement;
import ccs.archi.interfaces.IObservable;
import ccs.archi.interfaces.IObserver;
import ccsM2.IComponentElement;
import ccsM2.InterfaceElement;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.ComponentImpl;
import ccsM2.impl.CCSFactoryImpl;

public class SecurityManager extends ComponentImpl implements ICommonElement, IObservable {

	private IObserver observer;
	private String lastUserLogInfos = null;

	public enum PortName {
		securityToDatabasePort, securityToConnectionPort, responseFromConnectionPort, responseFromDatabasePort

	}

	public SecurityManager() {
		this.name = "SecurityManager";
		this.icomponentelement = new BasicEList<IComponentElement>();
		initElements();

	}

	public void initElements() {
		Port securityToDatabasePort = CCSFactoryImpl.eINSTANCE.createPort();
		Port securityToConnectionPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromConnectionPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromDatabasePort = CCSFactoryImpl.eINSTANCE.createPort();

		securityToDatabasePort.setMode(Mode.OFFERED);
		securityToConnectionPort.setMode(Mode.OFFERED);
		responseFromConnectionPort.setMode(Mode.REQUIRED);
		responseFromDatabasePort.setMode(Mode.REQUIRED);
		
		securityToDatabasePort.SetName("securityToDatabasePort");
		securityToConnectionPort.SetName("securityToConnectionPort");
		responseFromConnectionPort.SetName("responseFromConnectionPort");
		responseFromDatabasePort.SetName("responseFromDatabasePort");

		this.icomponentelement.add(securityToDatabasePort);
		this.icomponentelement.add(securityToConnectionPort);
		this.icomponentelement.add(responseFromConnectionPort);
		this.icomponentelement.add(responseFromDatabasePort);
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

		if (changedInput == getPortByName(PortName.responseFromConnectionPort)) {
			lastUserLogInfos = ((String) response).split(":")[1] + ":" + ((String) response).split(":")[2];
			SetComponentElementValue(getPortByName(PortName.securityToDatabasePort), response);
		}
		if (changedInput == getPortByName(PortName.responseFromDatabasePort)) {
			String idEntered = lastUserLogInfos.split(":")[0];
			String passwordEntered = lastUserLogInfos.split(":")[1];
			
			if(response == "") {
				lastUserLogInfos = null;
				response = idEntered + ":" + "false";
				SetComponentElementValue(getPortByName(PortName.securityToConnectionPort), response);
				return;
			}

			String correctPassword = ((String) response).split(":")[1];
			if (lastUserLogInfos != null && passwordEntered.equals(correctPassword)) {
				response = idEntered + ":" + "true";
			} else {
				lastUserLogInfos = null;
				response = idEntered + ":" + "false";
			}
			SetComponentElementValue(getPortByName(PortName.securityToConnectionPort), response);
		}
		
	}

	
	/* return port by given name */
	public Port getPortByName(PortName name) {
		switch (name) {
		case securityToDatabasePort:
			return (Port) icomponentelement.get(0);
		case securityToConnectionPort:
			return (Port) icomponentelement.get(1);
		case responseFromConnectionPort:
			return (Port) icomponentelement.get(2);
		case responseFromDatabasePort:
			return (Port) icomponentelement.get(3);
		}
		return null;
	}

}
