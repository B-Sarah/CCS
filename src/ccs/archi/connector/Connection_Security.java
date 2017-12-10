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

public class Connection_Security extends ConnectorImpl implements ICommonElement, IObservable{

	private IObserver observer;

	public enum RoleName {
		fromConnection, toSecurity, fromSecurity, toConnection
	}

	public Connection_Security() {
		name = "Connection_Security";
		this.role = new BasicEList<Role>();
		initElements();
	}

	@Override
	public void SetRoleValue(Role element, Object value) {
		super.SetRoleValue(element, value);
		if (element.getMode() == Mode.OFFERED)
			NotifyObserver(element);
		else
			Work(element);
	}

	public Role GetRoleByName(RoleName name) {
		switch (name) {
		case fromConnection:
			return (Role) this.role.get(0);
		case toSecurity:
			return (Role) this.role.get(1);
		case fromSecurity:
			return (Role) this.role.get(2);
		case toConnection:
			return (Role) this.role.get(3);
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
		
		if (changedInput == GetRoleByName(RoleName.fromConnection))
			SetRoleValue(GetRoleByName(RoleName.toSecurity), changedInput.getContainedValue());
		if (changedInput == GetRoleByName(RoleName.fromSecurity))
			SetRoleValue(GetRoleByName(RoleName.toConnection), changedInput.getContainedValue());
		
	}

	@Override
	public void initElements() {
		// From client to server communication
		Role fromConnection = CCSFactoryImpl.eINSTANCE.createRole();
		Role toSecurity = CCSFactoryImpl.eINSTANCE.createRole();
		Role fromSecurity = CCSFactoryImpl.eINSTANCE.createRole();
		Role toConnection = CCSFactoryImpl.eINSTANCE.createRole();

		fromConnection.setMode(Mode.REQUIRED);
		fromConnection.SetName("fromConnection");
		toSecurity.setMode(Mode.OFFERED);
		toSecurity.SetName("toSecurity");
		fromSecurity.setMode(Mode.REQUIRED);
		fromSecurity.SetName("fromSecurity");
		toConnection.setMode(Mode.OFFERED);
		toConnection.SetName("toConnection");

		this.role.add(fromConnection);
		this.role.add(toSecurity);
		this.role.add(fromSecurity);
		this.role.add(toConnection);
	}

}
