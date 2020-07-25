package dynamic;
import java.util.*;
import java.io.*;
public class bj1003 {
	static int N;
	static int num;
	static int[] zero, one;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			num = Integer.parseInt(br.readLine());
			
			zero = new int[num+1];
			one = new int[num+1];
			
			find(0);
			
			
		}
		br.close();
		bw.close();

	}
	private static void find(int n) {
		
		
		if(num == 0) {
			System.out.println(1 + " " + 0);
			return;
		}else if(num==1) {
			System.out.println(0 + " " + 1);
			return;
		}
		
		if(n == num) {
			zero[n] = zero[n-1] + zero[n-2];
			one[n] = one[n-1] + one[n-2];
			
			System.out.println(zero[n] + " " + one[n]);
			return;
		}
		
		
		
		if(n == 0 ) {
			zero[n] = 1;
			one[n] = 0;
			find(n+1);
		}else if(n == 1) {
			zero[n] = 0;
			one[n] = 1;
			find(n+1);
		}else {
			zero[n] = zero[n-1] + zero[n-2];
			one[n] = one[n-1] + one[n-2];
			
			find(n+1);
		}
		
	}
	

}
