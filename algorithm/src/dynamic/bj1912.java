package dynamic;
import java.util.*;
import java.io.*;
public class bj1912 {
	
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] dp = new int[n];
		
		dp[0] = Integer.parseInt(st.nextToken());
		for(int i=1;i<n;i++) {
			int num = Integer.parseInt(st.nextToken());
			dp[i] = Math.max(dp[i-1]+num, num);
		}
		Arrays.sort(dp);
		
		
		
		

		System.out.println(dp[n-1]);
		
		

	}

}
