package networking.assignment;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.io.*;

public class Client2 {
	String message;
	int fact;
	
	Socket client = null;
	
	public Client2() throws UnknownHostException, IOException {
		// create client Socket
		client = new Socket(InetAddress.getLocalHost(), 1234);
		System.out.println("Created");

	}

	public void sendMessage(String str) {

		this.message = str;

		try {
			
			// InputStream

			InputStream clientIn = client.getInputStream();
			BufferedReader read = new BufferedReader(new InputStreamReader(clientIn));

			// OutputStream

			OutputStream clientOut = client.getOutputStream();
			PrintWriter write = new PrintWriter(clientOut, true);

			// Create BufferedReader for a standard input
			
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

	public int factorial(Integer number) {
		
		Socket client = null;

		try {
			// create client Socket
			client = new Socket(InetAddress.getLocalHost(), 1234);
			System.out.println("Created2");

			// InputStream

			InputStream clientFIn = client.getInputStream();
			BufferedReader read = new BufferedReader(new InputStreamReader(clientFIn));

			// OutputStream

			OutputStream clientFOut = client.getOutputStream();
			PrintWriter write = new PrintWriter(clientFOut, true);

			// Read data from standard input device and write it
			// to the output stream of the client socket.
			InputStream inputStream = new ByteArrayInputStream(number.toString().getBytes(Charset.forName("UTF-8")));
			 
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

			write.println(number.toString().trim());

			System.out.println("Factorial: " + read.readLine());
			
			fact = Integer.parseInt(read.readLine());

			write.close();
			read.close();
			client.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	

	
		return fact;

	}

}
