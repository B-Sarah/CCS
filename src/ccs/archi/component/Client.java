package ccs.archi.component;

import org.eclipse.emf.common.util.BasicEList;

import ccs.archi.interfaces.ICommonElement;
import ccs.archi.interfaces.IObservable;
import ccs.archi.interfaces.IObserver;
import ccsM2.IComponentElement;
import ccsM2.InterfaceElement;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ComponentImpl;

public class Client extends ComponentImpl implements ICommonElement, IObservable{
	
	private IObserver observer;

	public enum PortName{
		send_request,
		request_response,
		ClientRequestPort,
		ClientResponsePort
	}
	

	public Client() {
		this.name = "Client";
		this.icomponentelement = new BasicEList<IComponentElement>();
		initElements();
		
	}

	/* return port by given name */
	public Port getPortByName(PortName name) {
		switch (name) {
		case send_request : return (Port) icomponentelement.get(0);
		case request_response : return (Port) icomponentelement.get(1);
		case ClientRequestPort : return (Port) icomponentelement.get(2);
		case ClientResponsePort : return (Port) icomponentelement.get(3);
		}
		return null;
	}
	
	@Override
	public void SetComponentElementValue(IComponentElement element, Object value) {
		super.SetComponentElementValue(element, value);
		if(((InterfaceElement)element).getMode() == Mode.OFFERED)
			NotifyObserver((InterfaceElement)element);
		else
			Work(element);
	}
	
	@Override
	protected void Work(IComponentElement changedInput) {
		super.Work(changedInput);
		if(changedInput == getPortByName(Client.PortName.ClientRequestPort)) {
			SetComponentElementValue(getPortByName(Client.PortName.send_request), ((InterfaceElement)changedInput).getContainedValue());
		}
		if(changedInput == getPortByName(Client.PortName.request_response)) {
			SetComponentElementValue(getPortByName(Client.PortName.ClientResponsePort), ((InterfaceElement)changedInput).getContainedValue());
		}
		
		
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
	public void initElements() {
		//init communication port (client->server) 
				Port send_request = CCSFactoryImpl.eINSTANCE.createPort();
				Port request_response = CCSFactoryImpl.eINSTANCE.createPort();
				
				send_request.setMode(Mode.OFFERED);
				send_request.SetName("send_request");
				request_response.setMode(Mode.REQUIRED);
				request_response.SetName("request_response");
				
				this.icomponentelement.add(send_request);
				this.icomponentelement.add(request_response);
				
				
				/* Ports setup for outside communication */
				//init request redirect port( clientServer->client)
				Port ClientRequestPort =  CCSFactoryImpl.eINSTANCE.createPort();
				//init communication port (client->clientServer) 
				Port ClientResponsePort = CCSFactoryImpl.eINSTANCE.createPort();
				
				ClientRequestPort.setMode(Mode.REQUIRED);
				ClientRequestPort.SetName("ClientRequestPort");
				ClientResponsePort.setMode(Mode.OFFERED);
				ClientResponsePort.SetName("ClientResponsePort");
				
				this.icomponentelement.add(ClientRequestPort);
				this.icomponentelement.add(ClientResponsePort);
		
	}
}
