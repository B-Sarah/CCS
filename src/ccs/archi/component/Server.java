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
	int maxClient = 0;
	
	//A simple hack to allow multiple client
	private IComponentElement portToRespond;

	public enum PortName {
		serverRequestRedirectPort, responseFromDetailPort
	}

	public Server() {
		name = "Server";
		this.icomponentelement = new BasicEList<IComponentElement>();
		this.configuration = new ServerDetail();
		initElements();

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
		case serverRequestRedirectPort:
			return (Port) this.icomponentelement.get(0);
		case responseFromDetailPort:
			return (Port) this.icomponentelement.get(1);
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
		((IObservable)this.configuration).SetObserver(observer);
	}

	@Override
	public void initElements() {
		/* Ports setup for client communication */
		/*Port receive_request = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseToClientPort = CCSFactoryImpl.eINSTANCE.createPort();

		receive_request.setMode(Mode.REQUIRED);
		receive_request.SetName("receive_request");
		responseToClientPort.setMode(Mode.OFFERED);
		responseToClientPort.SetName("responseToClientPort");

		this.icomponentelement.add(receive_request);
		this.icomponentelement.add(responseToClientPort);*/

		/* Ports setup for detail communication */
		Port serverRequestRedirectPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromDetailPort = CCSFactoryImpl.eINSTANCE.createPort();

		serverRequestRedirectPort.setMode(Mode.OFFERED);
		serverRequestRedirectPort.SetName("serverRequestRedirectPort");
		responseFromDetailPort.setMode(Mode.REQUIRED);
		responseFromDetailPort.SetName("responseFromDetailPort");

		this.icomponentelement.add(serverRequestRedirectPort);
		this.icomponentelement.add(responseFromDetailPort);
	}

	@Override
	protected void Work(IComponentElement changedInput) {
		super.Work(changedInput);

		if(((InterfaceElement)changedInput).GetName().contains("receive_request")) {
			portToRespond = this.icomponentelement.get(this.icomponentelement.indexOf(changedInput) + 1);
			SetComponentElementValue(GetPortByName(PortName.serverRequestRedirectPort),
					((InterfaceElement) changedInput).getContainedValue());
		}
		if(changedInput == GetPortByName(PortName.responseFromDetailPort)) {
			SetComponentElementValue(portToRespond,
					((InterfaceElement) changedInput).getContainedValue());
			portToRespond = null;
		}
		
	}
	
	public void ConnectNewClient(int clientId) {
		Port receive_request = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseToClientPort = CCSFactoryImpl.eINSTANCE.createPort();
		
		receive_request.setMode(Mode.REQUIRED);
		receive_request.SetName("receive_request_"+clientId);
		responseToClientPort.setMode(Mode.OFFERED);
		responseToClientPort.SetName("responseToClientPort_"+clientId);
		
		this.icomponentelement.add(receive_request);
		this.icomponentelement.add(responseToClientPort);
		
		maxClient++;
	}

}
