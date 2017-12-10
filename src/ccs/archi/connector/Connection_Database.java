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

public class Connection_Database extends ConnectorImpl implements ICommonElement, IObservable {

	private IObserver observer;

	public enum RoleName {
		fromConnection, toDatabase, fromDatabase, toConnection
	}

	public Connection_Database() {
		name = "Connection_Database";
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
		case toDatabase:
			return (Role) this.role.get(1);
		case fromDatabase:
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
			SetRoleValue(GetRoleByName(RoleName.toDatabase), changedInput.getContainedValue());
		if (changedInput == GetRoleByName(RoleName.fromDatabase))
			SetRoleValue(GetRoleByName(RoleName.toConnection), changedInput.getContainedValue());
		
	}

	@Override
	public void initElements() {
		// From client to server communication
		Role fromConnection = CCSFactoryImpl.eINSTANCE.createRole();
		Role toDatabase = CCSFactoryImpl.eINSTANCE.createRole();
		Role fromDatabase = CCSFactoryImpl.eINSTANCE.createRole();
		Role toConnection = CCSFactoryImpl.eINSTANCE.createRole();

		fromConnection.setMode(Mode.REQUIRED);
		fromConnection.SetName("fromConnection");
		toDatabase.setMode(Mode.OFFERED);
		toDatabase.SetName("toDatabase");
		fromDatabase.setMode(Mode.REQUIRED);
		fromDatabase.SetName("fromDatabase");
		toConnection.setMode(Mode.OFFERED);
		toConnection.SetName("toConnection");

		this.role.add(fromConnection);
		this.role.add(toDatabase);
		this.role.add(fromDatabase);
		this.role.add(toConnection);
	}

}
