import java.io.*;

public class SampleBufferedReader {

	public static void main(String[] args) throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        String input = br.readLine();
        System.out.println(input);
	}
}
