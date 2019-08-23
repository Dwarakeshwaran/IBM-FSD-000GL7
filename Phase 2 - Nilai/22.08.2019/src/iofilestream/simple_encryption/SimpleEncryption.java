package iofilestream.simple_encryption;

import java.io.*;

public class SimpleEncryption {

	void encrypt(String source, String dest, int shiftSize) throws IOException {
		BufferedReader reader;
		BufferedWriter writer;

		reader = new BufferedReader(new FileReader(source));
		writer = new BufferedWriter(new FileWriter(dest));

		String line = reader.readLine();

		int data;

		while (line != null) {
			for (int i = 0; i < line.length(); i++) {
				data = (int) line.charAt(i) + shiftSize;
				writer.write(data);
			}
			writer.write((int) '\n');
			line = reader.readLine();

		}

		reader.close();
		writer.close();
	}

	public void viewFileContent(String filename) throws IOException {
		BufferedReader reader;
		reader = new BufferedReader(new FileReader(filename));
		String line = reader.readLine();

		while (line != null) {
			System.out.println(line);
			line = reader.readLine();

		}

		reader.close();

	}

}
