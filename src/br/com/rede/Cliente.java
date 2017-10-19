package br.com.rede;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("localhost", 5000);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println(s.nextLine());
		s.close();

	}

}
