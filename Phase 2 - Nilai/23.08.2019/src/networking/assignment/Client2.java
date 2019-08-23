package networking.assignment;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;

public class Client2 {
	String message;

	public void sendMessage(String str) {

		this.message = str;
		Socket client = null;

		try {
			// create client Socket
			client = new Socket(InetAddress.getLocalHost(), 1234);
			System.out.println("Created");

			// InputStream

			InputStream clientIn = client.getInputStream();
			BufferedReader read = new BufferedReader(new InputStreamReader(clientIn));

			// OutputStream

			OutputStream clientOut = client.getOutputStream();
			PrintWriter write = new PrintWriter(clientOut, true);

			// Create BufferedReader for a standard input
			ClientGui cg = new ClientGui();
			System.out.println("Enter your name. Type Bye to exit. ");

			// Read data from standard input device and write it
			// to the output stream of the client socket.

			write.println(message.trim());

			System.out.println("Message from the server: " + read.readLine());

			write.close();
			read.close();
			client.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public int factorial(int number) {
		int fact = 1;
		for (int i = number; i > 0; i--) {
			fact = fact * i;
		}

		return fact;

	}

}
