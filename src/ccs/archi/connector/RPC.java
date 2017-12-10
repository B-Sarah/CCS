package ccs.archi.connector;

import org.eclipse.emf.common.util.BasicEList;

import ccs.archi.interfaces.ICommonElement;
import ccs.archi.interfaces.IObservable;
import ccs.archi.interfaces.IObserver;
import ccsM2.InterfaceElement;
import ccsM2.Mode;
import ccsM2.Role;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ConnectorImpl;

public class RPC extends ConnectorImpl implements ICommonElement, IObservable {
	
	IObserver observer;
	
	public enum RoleName{
		caller,
		called,
		callerResponse,
		calledResponse
	}

	public RPC() {
		this.role = new BasicEList<Role>();
		initPort();
	}
	
	
	@Override
	public void SetRoleValue(Role element, Object value) {
		super.SetRoleValue(element, value);
		if(element.getMode() == Mode.OFFERED)
			NotifyObserver(element);
		else
			Work(element);
	}
	
	public Role GetRoleByName(RoleName name) {
		switch(name) {
		case caller:
			return (Role)this.role.get(0);
		case called:
			return (Role)this.role.get(1);
		case callerResponse:
			return (Role)this.role.get(2);
		case calledResponse:
			return (Role)this.role.get(3);
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
	protected void Work(Role changedInput) {
		super.Work(changedInput);
		if(changedInput == GetRoleByName(RoleName.caller))
			SetRoleValue(GetRoleByName(RoleName.called), changedInput.getContainedValue());
		if(changedInput == GetRoleByName(RoleName.calledResponse))
			SetRoleValue(GetRoleByName(RoleName.callerResponse), changedInput.getContainedValue());
			
	}


	@Override
	public void initPort() {
		//From client to server communication
				Role caller = CCSFactoryImpl.eINSTANCE.createRole();
				Role called = CCSFactoryImpl.eINSTANCE.createRole();
				Role callerResponse = CCSFactoryImpl.eINSTANCE.createRole();
				Role calledResponse = CCSFactoryImpl.eINSTANCE.createRole();
				
				calledResponse.setMode(Mode.REQUIRED);
				caller.setMode(Mode.REQUIRED);
				called.setMode(Mode.OFFERED);
				callerResponse.setMode(Mode.OFFERED);
				
				this.role.add(caller);
				this.role.add(called);
				this.role.add(callerResponse);
				this.role.add(calledResponse);
	}

}
