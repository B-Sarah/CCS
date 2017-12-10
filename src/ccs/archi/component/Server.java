package ccs.archi.component;
import org.eclipse.emf.common.util.BasicEList;
import ccs.archi.configuration.ServerDetail;
import ccs.archi.interfaces.ICommonElement;
import ccs.archi.interfaces.IObservable;
import ccs.archi.interfaces.IObserver;
import ccsM2.IComponentElement;
import ccsM2.InterfaceElement;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ComponentImpl;

public class Server extends ComponentImpl implements ICommonElement, IObservable {

	private IObserver observer;

	public enum PortName {
		receive_request, responseToClientPort, serverRequestRedirectPort, responseFromDetailPort
	}

	public Server() {
		this.icomponentelement = new BasicEList<IComponentElement>();
		this.configuration = new ServerDetail();
		initPort();

	}

	@Override
	public void SetComponentElementValue(IComponentElement element, Object value) {
		super.SetComponentElementValue(element, value);
		if (((InterfaceElement) element).getMode() == Mode.OFFERED)
			NotifyObserver((InterfaceElement) element);
		else
			Work(element);
	}

	public Port GetPortByName(PortName name) {
		switch (name) {
		case receive_request:
			return (Port) this.icomponentelement.get(0);
		case responseToClientPort:
			return (Port) this.icomponentelement.get(1);
		case serverRequestRedirectPort:
			return (Port) this.icomponentelement.get(2);
		case responseFromDetailPort:
			return (Port) this.icomponentelement.get(3);
		}
		return null;
	}

	@Override
	public void NotifyObserver(InterfaceElement elementChanged) {
		this.observer.ReceivedNotification(elementChanged);
	}

	@Override
	public void SetObserver(IObserver anObserver) {
		this.observer = anObserver;
		this.observer.AddObservable(this);
	}

	@Override
	public void initPort() {
		/* Ports setup for client communication */
		Port receive_request = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseToClientPort = CCSFactoryImpl.eINSTANCE.createPort();

		receive_request.setMode(Mode.REQUIRED);
		responseToClientPort.setMode(Mode.OFFERED);

		System.out.println(receive_request);

		this.icomponentelement.add(receive_request);
		this.icomponentelement.add(responseToClientPort);

		/* Ports setup for detail communication */
		Port serverRequestRedirectPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromDetailPort = CCSFactoryImpl.eINSTANCE.createPort();

		serverRequestRedirectPort.setMode(Mode.OFFERED);
		responseFromDetailPort.setMode(Mode.REQUIRED);

		this.icomponentelement.add(serverRequestRedirectPort);
		this.icomponentelement.add(responseFromDetailPort);
	}

	@Override
	protected void Work(IComponentElement changedInput) {
		super.Work(changedInput);

		SetComponentElementValue(GetPortByName(PortName.responseToClientPort),
				(Integer) ((InterfaceElement) changedInput).getContainedValue() * 2);
	}

}
