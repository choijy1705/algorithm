package dynamic;
import java.util.*;
public class bj10844 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		
		
		long[] dp = new long[N+1];
		dp[0]=0;
		dp[1]= 9;
		for(int i=2;i<=N;i++) {
			dp[i] = (dp[i-1]*2 -i)%1000000000;
		}
		System.out.println(dp[N]);
		
		

	}

}
