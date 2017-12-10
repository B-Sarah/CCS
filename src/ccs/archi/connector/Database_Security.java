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

public class Database_Security extends ConnectorImpl implements ICommonElement, IObservable {
	

	private IObserver observer;

	public enum RoleName {
		fromDatabase, toSecurity, fromSecurity, toDatabase
	}

	public Database_Security() {
		name = "Database_Security";
		this.role = new BasicEList<Role>();
		initPort();
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
		case fromDatabase:
			return (Role) this.role.get(0);
		case toSecurity:
			return (Role) this.role.get(1);
		case fromSecurity:
			return (Role) this.role.get(2);
		case toDatabase:
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
		
		if (changedInput == GetRoleByName(RoleName.fromDatabase))
			SetRoleValue(GetRoleByName(RoleName.toSecurity), changedInput.getContainedValue());
		if (changedInput == GetRoleByName(RoleName.fromSecurity))
			SetRoleValue(GetRoleByName(RoleName.toDatabase), changedInput.getContainedValue());
		
	}

	@Override
	public void initPort() {
		// From client to server communication
		Role fromDatabase = CCSFactoryImpl.eINSTANCE.createRole();
		Role toSecurity = CCSFactoryImpl.eINSTANCE.createRole();
		Role fromSecurity = CCSFactoryImpl.eINSTANCE.createRole();
		Role toDatabase = CCSFactoryImpl.eINSTANCE.createRole();

		fromDatabase.setMode(Mode.REQUIRED);
		fromDatabase.SetName("fromDatabase");
		toSecurity.setMode(Mode.OFFERED);
		toSecurity.SetName("toSecurity");
		fromSecurity.setMode(Mode.REQUIRED);
		fromSecurity.SetName("fromSecurity");
		toDatabase.setMode(Mode.OFFERED);
		toDatabase.SetName("toDatabase");

		this.role.add(fromDatabase);
		this.role.add(toSecurity);
		this.role.add(fromSecurity);
		this.role.add(toDatabase);
	}

}
