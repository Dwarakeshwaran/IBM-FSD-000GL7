package networking.assignment;

import java.io.IOException;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Client2 c =  new Client2();
		ClientGui gui = new ClientGui(c);

	}

}
