package ccs.archi.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ccs.archi.interfaces.ICommonElement;
import ccs.archi.repository.User;
import ccsM2.Mode;
import ccsM2.Port;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ComponentImpl;

public class Database extends ComponentImpl implements ICommonElement {
	
	private Map<String,User> usersInformations;

	public Map<String, User> getUsersInformations() {
		return usersInformations;
	}
	
	public User getUserInformations(String id) {
		return usersInformations.get(id);
	}
	
	
	public Object processRequest(String request) {
		String [] informations = request.split(":");
		String requestType = informations[0];
		String  id = informations[1];
		String password = informations[2];
		
		Object result = null;
		
		switch(requestType) {
		
		case "auth" : result = processRequestAuth(id, password);
		case "getInfos" : result = processRequestUserInfo(id,true /*isAuth*/);
		
		}
		
		return result;
		
	}

	private boolean processRequestAuth(String id, String password) {
		if(!id.isEmpty() && !password.isEmpty())
			if(usersInformations.get(id).getPassword().equals(password))
				return true;
		
		return false;
		
	}
	
	private List<String> processRequestUserInfo(String id, boolean isAuth) {
		ArrayList<String> infoList = new ArrayList<String>();
		if(usersInformations.get(id) != null) {
			if(!isAuth) return null;
			infoList.add(usersInformations.get(id).getFname());
			infoList.add(usersInformations.get(id).getLname());
			infoList.add(usersInformations.get(id).getMeetings());
			
		}
		
		return infoList;
		
	}


	public enum PortName {
		databaseToSecurityPort, databaseToConnectionPort,responseFromSecurityPort,responseFromConnectionPort
	}

	public Database() {

		initPort();
	}

	 public void initPort() {
		Port databaseToSecurityPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port databaseToConnectionPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromSecurityPort = CCSFactoryImpl.eINSTANCE.createPort();
		Port responseFromConnectionPort = CCSFactoryImpl.eINSTANCE.createPort();

		databaseToSecurityPort.setMode(Mode.OFFERED);
		databaseToConnectionPort.setMode(Mode.OFFERED);
		responseFromSecurityPort.setMode(Mode.REQUIRED);
		responseFromConnectionPort.setMode(Mode.REQUIRED);

		this.icomponentelement.add(databaseToSecurityPort);
		this.icomponentelement.add(databaseToConnectionPort);
		this.icomponentelement.add(responseFromSecurityPort);
		this.icomponentelement.add(responseFromConnectionPort);
	}
	 
	 

}
