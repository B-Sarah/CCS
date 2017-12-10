package ccs.archi.configuration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import ccs.archi.component.ConnectionManager;
import ccs.archi.component.Database;
import ccs.archi.component.SecurityManager;
import ccs.archi.connector.Connection_Database;
import ccs.archi.connector.Connection_Security;
import ccs.archi.connector.Database_Security;
import ccs.archi.interfaces.ICommonElement;
import ccs.archi.interfaces.IObservable;
import ccs.archi.interfaces.IObserver;
import ccsM2.Attachement;
import ccsM2.Binding;
import ccsM2.Component;
import ccsM2.Connector;
import ccsM2.ILink;
import ccsM2.InterfaceElement;
import ccsM2.PortConfiguration;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ConfigurationImpl;

public class ServerDetail extends ConfigurationImpl  implements ICommonElement, IObserver {

	private List<IObservable> observables = new ArrayList<IObservable>();

	public ServerDetail() {
		this.component = new BasicEList<Component>();
		this.connector = new BasicEList<Connector>();
		this.ilink = new BasicEList<ILink>();
		this.portconfiguration = new BasicEList<PortConfiguration>();

		initPort();
		
		
	}

	
	@Override
	public List<IObservable> AddObservable(IObservable anObservable) {
		if(!this.observables.contains(anObservable))
			this.observables.add(anObservable);
		return this.observables;
	}

	@Override
	public void ReceivedNotification(InterfaceElement notifier) {
		Attachement attachement;
		Binding binding;
		
		//retrieve attachement linked to notifier
		attachement = this.GetAttachementFromElement(notifier);
		//case we find an attachement, not a binding
		if(attachement != null) {
			//case we need to redirect to component 
			if(attachement.getRole() == notifier) { 		// == notifier instanceof Role
				GetComponentContainingElement(attachement.getIcomponentelement()).
					SetComponentElementValue(attachement.getIcomponentelement(), notifier.getContainedValue());
			} else { //case we need to redirect to port
				GetConnectorContainingRole(attachement.getRole()).SetRoleValue(attachement.getRole(), notifier.getContainedValue());
			}	
		//otherwise ths notification concerns a binding 
		} else { 
			//retrieve binding linked to notifier
			binding = GetBindingFromElement(notifier);
			if(binding != null){
				//case we have a portConfiguration and need to redirect to the element port
				if(binding.getPortconfiguration() == notifier) {
					GetComponentContainingElement(binding.getPort()).SetComponentElementValue(binding.getPort(), notifier.getContainedValue());
				} else { //case the configuration itself is receiver of the notification
					this.portconfiguration.get(this.portconfiguration.indexOf(binding.getPortconfiguration())).setContainedValue(notifier.getContainedValue());
					Work(binding.getPortconfiguration());
				}
			}
		}
		
		

	}
	
	@Override
	protected void Work(PortConfiguration inputChanged) {
		super.Work(inputChanged);
	}

	@Override
	public void initPort() {
		Component connectionManager = new ConnectionManager();
		Component securityManager = new SecurityManager();
		Component database = new Database();
		
		Connector connection_database = new Connection_Database();
		Connector connection_security = new Connection_Security();
		Connector database_security = new Database_Security();
		
		//Linking connection->database
		Attachement connectionToConnection_database = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement connection_databaseToDatabase = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		//Linking database->connection
		Attachement databaseToConnection_database = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement connection_databaseToConnection = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		//Linking connection->security
		Attachement connectionToConnection_Security = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement connection_SecurityToSecurity = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		//Linking security->connection
		Attachement SecurityToConnection_Security = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement connection_SecurityToConnection = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		//Linking database->security
		Attachement databaseToDatabase_Security = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement database_SecurityToSecurity = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		//Linking security->database
		Attachement securityToDatabase_Security = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement database_SecurityToDatabase = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		
		this.component.add(connectionManager);
		this.component.add(securityManager);
		this.component.add(database);
		
		this.connector.add(connection_database);
		this.connector.add(connection_security);
		this.connector.add(database_security);
		
		this.ilink.add(connectionToConnection_database);
		this.ilink.add(connection_databaseToDatabase);
		this.ilink.add(databaseToConnection_database);
		this.ilink.add(connection_databaseToConnection);
		this.ilink.add(connectionToConnection_Security);
		this.ilink.add(connection_SecurityToSecurity);
		this.ilink.add(SecurityToConnection_Security);
		this.ilink.add(connection_SecurityToConnection);
		this.ilink.add(databaseToDatabase_Security);
		this.ilink.add(database_SecurityToSecurity);
		this.ilink.add(securityToDatabase_Security);
		this.ilink.add(database_SecurityToDatabase);
	}
}
