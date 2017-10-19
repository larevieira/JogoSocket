package br.com.rede;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(5000);
		
		while(true) {
			
			Socket socket = server.accept();
			PrintWriter w = new PrintWriter(socket.getOutputStream());
			w.println("Conexão iniciada");
			w.close();
		}
	}

}
