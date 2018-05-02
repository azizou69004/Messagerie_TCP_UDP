package Client;

import Structures.UpdateInterval;
import Structures.Utils;
import Client.Client;
import Serveur.SocketTCP;
import Serveur.SocketUDP;

public class Main {

	public static boolean arret_Serveur = false;

	// Ports (défaut dans Utils, sinon spécifiés par ligne de command
	public static void main(String[] args) throws Exception {
		System.out.println("Démarrage client UDP. PortUDP (serveur):" + 8001);
		Client.getInstance(8001, 8000).start();
	}

}
