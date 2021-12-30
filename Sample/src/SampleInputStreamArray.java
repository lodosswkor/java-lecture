import java.io.InputStream;

public class SampleInputStreamArray {

	public static void main(String[] args) throws Exception {

		InputStream in = System.in;
		byte[] input = new byte[10];
		in.read(input);
		
		for(int i = 0; i < input.length; i++) {
			if(input[i] == 0) break;
			System.out.print((char)input[i]);
		}
		
	}
}
