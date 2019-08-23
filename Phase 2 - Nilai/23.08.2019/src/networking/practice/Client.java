package networking.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket client = null;

		for (int i = 0; i < 10; i++) {

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
				BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter your name. Type Bye to exit. ");

				// Read data from standard input device and write it
				// to the output stream of the client socket.
				String msg = stdIn.readLine().trim();
				write.println(msg);
				
				System.out.println("Message from the server: " + read.readLine());
				
//				write.close();
//				read.close();
//				client.close();
				
				 if (msg.equalsIgnoreCase("Bye")) {
	                    break;
				 }

			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
