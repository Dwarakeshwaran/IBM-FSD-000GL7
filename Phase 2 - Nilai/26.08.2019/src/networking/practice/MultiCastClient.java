package networking.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastClient {

	public static void main(String[] args) throws IOException {
		int portNumber = 1000;

		// create client Socket

		MulticastSocket client = new MulticastSocket(portNumber);

		InetAddress group = InetAddress.getByName("225.0.0.1");
		// Join group
		client.joinGroup(group);
		// Get Message from the console
		while (true) {
		String msg = "";
		System.out.println("Type a message for the server:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		msg = br.readLine();

		// send Message
		
		
		
			DatagramPacket data = new DatagramPacket(msg.getBytes(), 0, msg.length(), group, portNumber);
			client.send(data);
			
			client.receive(data);
			

			String NewMsg = new String(data.getData());
			String newMsg = "Hello " + msg;
			System.out.println("Message From Client : " + newMsg);
			
			if(msg == null || msg == "end")
				client.close();
		}
		
	}

}
