package Serveur;

import Structures.UpdateInterval;
import Structures.Utils;
import Client.Client;
import Serveur.SocketTCP;
import Serveur.SocketUDP;

public class Main {

	public static boolean arret_Serveur = false;

	// Ports (défaut dans Utils, sinon spécifiés par ligne de command
	public static void main(String[] args) throws Exception {
		// we start the server

		// Démarrage du thread UDP -
		System.out.println("Demarrage thread TCP...");
		// TCP est un singleton, d'ou le getInstance()
		SocketTCP.getInstance("tcpHost", 8001, 8000).start();

		// Démarrage du thread UDP
		System.out.println("Demarrage thread UDP...");
		new SocketUDP("udpHost", 8001, 8000).start();
	}

}
