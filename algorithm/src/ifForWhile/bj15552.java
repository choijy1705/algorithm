package ifForWhile;
import java.io.*;
import java.util.*;

public class bj15552 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine().trim());
		
		for(int i=0;i<N;i++) {
			String text = br.readLine();
			String[] word = text.split(" ");
			
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			
			bw.write((a+b) + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
