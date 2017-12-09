package ccs.archi.configuration;

import ccs.archi.component.Server;
import ccsM2.impl.ConfigurationImpl;

public class ClientServer extends ConfigurationImpl {
	
	

	public ClientServer() {
		Server server = new Server();
		this.component.add(server);
	}
	
	public Server GetServer() {
		//Server always at 0
		return (Server)this.component.get(0);
	}
	
	

}
