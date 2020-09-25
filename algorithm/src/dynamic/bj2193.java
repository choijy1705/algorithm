package dynamic;
import java.util.*;
public class bj2193 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		
		if(n == 1) {
			System.out.println(1);
		}else {
			long[][] dp = new long[n+1][2];
			
			dp[1][0] = 0;
			dp[1][1] = 1;
			
			
			for(int i=2;i<=n;i++) {
				dp[i][0] = dp[i-1][1] + dp[i-1][0];
				dp[i][1] = dp[i-1][0];
			}
			
			System.out.println(dp[n][0]+dp[n][1]);
		}

	}

}
