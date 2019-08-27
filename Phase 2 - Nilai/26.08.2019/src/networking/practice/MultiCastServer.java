package networking.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastServer {

	public static void main(String[] args) throws IOException {
		//set Port Number
		int portNumber = 1000;
		
		//create a MultiCast Socket
		MulticastSocket server = new MulticastSocket(portNumber);
		System.out.println("Multicast Socket is created");
		
		InetAddress group = InetAddress.getByName("225.0.0.1");
		
		//create the group
		
		server.joinGroup(group);
		System.out.println("Group is created");
		
		
		while(true) {
			byte[] buf = new byte[1024];
			DatagramPacket data = new DatagramPacket(buf, buf.length);
			
			server.receive(data);
			
			String msg = new String(data.getData());
			String newMsg = "Hello " + msg;
			System.out.println("Message From Client : " + newMsg);
			
			DatagramPacket cdata = new DatagramPacket(msg.getBytes(), 0, msg.length(),group ,portNumber);
			server.send(cdata);
			server.close();
			
			
			
		}
	}

}
