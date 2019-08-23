package iofilestream.simple_encryption;

import java.io.IOException;

public class BufferedReaderWriter {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String a0, a1, a2, a3;
		
		if(args.length != 3) {
			a0 = "words.txt";
			a1 = "words1.txt";
			a2 = "1";
		}else {
			a0 = args[0];
			a1 = args[1];
			a2 = args[2];
		}
		
		SimpleEncryption se = new SimpleEncryption();
		se.encrypt(a0, a1, Integer.parseInt(a2));
		
		se.viewFileContent(a1);
	}

}
