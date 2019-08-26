package networking.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) {
		// Create Server Socket
		ServerSocket server = null;
		Socket client = null;

		try {
			server = new ServerSocket(1234);
		} catch (IOException e) {

			System.out.println("Cannot able create the server socket " + e);
			System.exit(1);
		}

		while (true) {

			try {
				System.out.println("Waiting...");
				client = server.accept();

				System.out.println("Client Request Accepted!");

				// Get Client Host Info->String and Client Port Info->int

				String clientHost = client.getInetAddress().getHostAddress();
				int clientPort = client.getPort();

				System.out.println("Client Host : " + clientHost + "\nClient Port: " + clientPort);

				// Create InputStream for the getting values from the Client

				// It scans the values given in the client console
				InputStream clientFIn = client.getInputStream();
				// It creates the memory or stores the values read from the client console in an
				// object->read
				BufferedReader read = new BufferedReader(new InputStreamReader(clientFIn));
				String number = read.readLine();
				System.out.println("Number: " + number);
				// Create OutputStream which processes the values got from the client and
				// displays it
				
				OutputStream clientFOut = client.getOutputStream();
				PrintWriter write = new PrintWriter(clientFOut);
				Integer fact = 1;
				for(int i = Integer.parseInt(number) ; i > 0 ; i--) {
					fact = fact * i;
				}
				System.out.println(fact);
				
				write.println(fact.toString().trim());

				

					//String passMsg = "Hello " + msgFromClient;
					//write.println(passMsg);
					System.out.println("Msg Sent to Client");

				}

				// Close sockets
				
				
			 catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}