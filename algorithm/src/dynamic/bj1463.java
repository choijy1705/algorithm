package dynamic;
import java.util.*;
public class bj1463 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int result = Integer.MAX_VALUE;
			
	public static void main(String[] args) {
		N = sc.nextInt();
		
		int[] dp = new int[N+1];
		
		dp[0] = dp[1] = 0;
		
		for(int i=2;i<=N;i++) {
			dp[i] = dp[i-1] + 1;
			if(i %2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			}
			
			if(i%3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
		}
		
		System.out.println(dp[N]);

	}

}
