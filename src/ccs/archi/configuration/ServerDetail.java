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
import ccsM2.Mode;
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

		initElements();
		
		
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
	public void initElements() {
		Component connectionManager = new ConnectionManager();
		Component securityManager = new SecurityManager();
		Component database = new Database();
		
		Connector connection_database = new Connection_Database();
		Connector connection_security = new Connection_Security();
		Connector database_security = new Database_Security();
		
		//Linking connection->database
		Attachement connectionToConnection_database = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement connection_databaseToDatabase = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		connectionToConnection_database.setIcomponentelement(((ConnectionManager)connectionManager).
				getPortByName(ConnectionManager.PortName.connectionToDatabasePort));
		connectionToConnection_database.setRole(((Connection_Database)connection_database).
				GetRoleByName(Connection_Database.RoleName.fromConnection));
		
		connection_databaseToDatabase.setRole(((Connection_Database)connection_database).
				GetRoleByName(Connection_Database.RoleName.toDatabase));
		connection_databaseToDatabase.setIcomponentelement(((Database)database).
				getPortByName(Database.PortName.responseFromConnectionPort));
		
		//Linking database->connection
		Attachement databaseToConnection_database = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement connection_databaseToConnection = CCSFactoryImpl.eINSTANCE.createAttachement();

		databaseToConnection_database.setIcomponentelement(((Database)database).
				getPortByName(Database.PortName.databaseToConnectionPort));
		databaseToConnection_database.setRole(((Connection_Database)connection_database).
				GetRoleByName(Connection_Database.RoleName.fromDatabase));
		
		connection_databaseToConnection.setRole(((Connection_Database)connection_database).
				GetRoleByName(Connection_Database.RoleName.toConnection));
		connection_databaseToConnection.setIcomponentelement(((ConnectionManager)connectionManager).
				getPortByName(ConnectionManager.PortName.responseFromDatabasePort));
		
		//Linking connection->security
		Attachement connectionToConnection_Security = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement connection_SecurityToSecurity = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		connectionToConnection_Security.setIcomponentelement(((ConnectionManager)connectionManager).
				getPortByName(ConnectionManager.PortName.connectionToSecurityPort));
		connectionToConnection_Security.setRole(((Connection_Security)connection_security).
				GetRoleByName(Connection_Security.RoleName.fromConnection));
		
		connection_SecurityToSecurity.setRole(((Connection_Security)connection_security).
				GetRoleByName(Connection_Security.RoleName.toSecurity));
		connection_SecurityToSecurity.setIcomponentelement(((SecurityManager)securityManager).
				getPortByName(SecurityManager.PortName.responseFromConnectionPort));
		
		//Linking security->connection
		Attachement securityToConnection_Security = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement connection_SecurityToConnection = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		securityToConnection_Security.setIcomponentelement(((SecurityManager)securityManager).
				getPortByName(SecurityManager.PortName.securityToConnectionPort));
		securityToConnection_Security.setRole(((Connection_Security)connection_security).
				GetRoleByName(Connection_Security.RoleName.fromSecurity));
		
		connection_SecurityToConnection.setRole(((Connection_Security)connection_security).
				GetRoleByName(Connection_Security.RoleName.toConnection));
		connection_SecurityToConnection.setIcomponentelement(((ConnectionManager)connectionManager).
				getPortByName(ConnectionManager.PortName.responseFromSecurityPort));
		
		//Linking database->security
		Attachement databaseToDatabase_Security = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement database_SecurityToSecurity = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		databaseToDatabase_Security.setIcomponentelement(((Database)database).
				getPortByName(Database.PortName.databaseToSecurityPort));
		databaseToDatabase_Security.setRole(((Database_Security)database_security).
				GetRoleByName(Database_Security.RoleName.fromDatabase));
		
		database_SecurityToSecurity.setRole(((Database_Security)database_security).
				GetRoleByName(Database_Security.RoleName.toSecurity));
		database_SecurityToSecurity.setIcomponentelement(((SecurityManager)securityManager).
				getPortByName(SecurityManager.PortName.responseFromDatabasePort));
		
		//Linking security->database
		Attachement securityToDatabase_Security = CCSFactoryImpl.eINSTANCE.createAttachement();
		Attachement database_SecurityToDatabase = CCSFactoryImpl.eINSTANCE.createAttachement();
		
		securityToDatabase_Security.setIcomponentelement(((SecurityManager)securityManager).
				getPortByName(SecurityManager.PortName.securityToDatabasePort));
		securityToDatabase_Security.setRole(((Database_Security)database_security).
				GetRoleByName(Database_Security.RoleName.fromSecurity));
		
		database_SecurityToDatabase.setRole(((Database_Security)database_security).
				GetRoleByName(Database_Security.RoleName.toDatabase));
		database_SecurityToDatabase.setIcomponentelement(((Database)database).
				getPortByName(Database.PortName.responseFromSecurityPort));
		
		
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
		this.ilink.add(securityToConnection_Security);
		this.ilink.add(connection_SecurityToConnection);
		this.ilink.add(databaseToDatabase_Security);
		this.ilink.add(database_SecurityToSecurity);
		this.ilink.add(securityToDatabase_Security);
		this.ilink.add(database_SecurityToDatabase);
		
		//portconfiguration for binding with connectionManager
		PortConfiguration requestToConnectionManager = CCSFactoryImpl.eINSTANCE.createPortConfiguration();
		PortConfiguration responseFromConnectionManager = CCSFactoryImpl.eINSTANCE.createPortConfiguration();
		requestToConnectionManager.setMode(Mode.OFFERED);
		responseFromConnectionManager.setMode(Mode.REQUIRED);
		
		this.portconfiguration.add(requestToConnectionManager);
		this.portconfiguration.add(responseFromConnectionManager);
		
		//binding with connectionManager
		Binding bindServerDetailToConnectionManager = CCSFactoryImpl.eINSTANCE.createBinding();
		Binding bindConnectionManagerToServerDetail = CCSFactoryImpl.eINSTANCE.createBinding();
		
		bindServerDetailToConnectionManager.setPortconfiguration(requestToConnectionManager);
		bindServerDetailToConnectionManager.setPort(((ConnectionManager)connectionManager).getPortByName(ConnectionManager.PortName.connectionRequestPort));
		
		bindConnectionManagerToServerDetail.setPort(((ConnectionManager)connectionManager).getPortByName(ConnectionManager.PortName.connectionResponsePort));
		bindServerDetailToConnectionManager.setPortconfiguration(responseFromConnectionManager);
		
		this.ilink.add(bindServerDetailToConnectionManager);
		this.ilink.add(bindConnectionManagerToServerDetail);
		
		//PortConfiguration for binding with outside
		PortConfiguration detailRequest = CCSFactoryImpl.eINSTANCE.createPortConfiguration();
		PortConfiguration detailResponse = CCSFactoryImpl.eINSTANCE.createPortConfiguration();
		detailRequest.setMode(Mode.REQUIRED);
		detailResponse.setMode(Mode.OFFERED);
		
		this.portconfiguration.add(detailRequest);
		this.portconfiguration.add(detailResponse);
	}

}
