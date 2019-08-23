package iofilestream.practice;

import java.io.*;

public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		File iFile = new File("chumma.txt");
		File oFile = new File("duplicate.txt");
		
		FileReader in = new FileReader(iFile);
		FileWriter out = new FileWriter(oFile);
		
		BufferedReader iStream = new BufferedReader(in);
		PrintWriter oStream = new PrintWriter(out);
		
		String l;
		
		int c;
		
		while((l = iStream.readLine()) != null)
		{
			System.out.println(l);
			out.write(l);
		}
		
		in.close();
		out.close();
	}

}
