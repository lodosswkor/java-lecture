import java.io.*;

public class SampleInputStream {

	// Byte Input Stream 
	public static void main(String[] args) throws Exception {
		//InputStream in = System.in; 
		//int a = in.read();
		//System.out.println(a);
		InputStream in = System.in;
		int data;
		while((data = in.read()) != -1) {
			System.out.print((char)data + "__" + data);
		}
		
	}
	
}
