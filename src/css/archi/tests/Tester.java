package css.archi.tests;

import ccs.archi.component.Client;
import ccs.archi.component.Server;
import ccs.archi.configuration.ClientServer;
import ccs.archi.configuration.ServerDetail;
import ccsM2.InterfaceElement;

public class Tester {

	public static void main(String[] args) {
		ClientServer cs = new ClientServer();
		Client client1 = new Client();
		Client client2 = new Client();
		cs.addNewClient(client1);
		cs.addNewClient(client2);
		
		
		processClient(cs, client1, "lx.donn@gmail.com", "blabla");
		processClient(cs, client2, "sboutahlil@gmail.com","alma");

	}

	private static void processClient(ClientServer cs, Client c, String mail, String pwd) {
		System.out.println("\n*******************************\nStart "+c.GetName()+"  Process\n*******************************\n");
		// sending login request
		cs.SendClientRequest(c, "login:"+mail+":"+pwd);

		// if login succeed
		if ((Boolean) cs.ReceiveRequestOfClient(c)) {
			System.out.println("Login succeed, getting user infos...");
			// sending info request
			cs.SendClientRequest(c, "infos:"+mail);
			// if data could not be retrieved
			if (cs.ReceiveRequestOfClient(c).equals("failure")) {
				System.out.println("Failed to load user data");
			} else { // else print retrieved data
				System.out.println(cs.ReceiveRequestOfClient(c));

				// logging out...
				System.out.println("Logging out...");
				cs.SendClientRequest(c, "logout:"+mail);
			}
		} else { // else log failed
			System.out.println("Login failed!");
		}

		System.out.println("\n*******************************\nProcess "+c.GetName()+" finished\n*******************************"
				+ "\n");
	}

}
