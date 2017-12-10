package css.archi.tests;

import ccs.archi.component.Client;
import ccs.archi.component.Server;
import ccs.archi.configuration.ClientServer;

public class Tester {

	public static void main(String[] args) {
		ClientServer cs = new ClientServer();
		Client client1 = new Client();
		cs.addNewClient(client1);
		
		//client1.SetComponentElementValue(client1.getPortByName(Client.PortName.send_request), 3);
		cs.SendClientRequest(client1, 6);

	}

}
