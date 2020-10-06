package dynamic;
import java.util.*;
public class bj9465 {
	static Scanner sc = new Scanner(System.in);
	static int t,n;
	public static void main(String[] args) {
		t=sc.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			n = sc.nextInt();
			
			int[][] cost = new int[2][n+1];
			int[][] dp = new int[2][n+1];
			
			for(int i=0;i<2;i++) {
				for(int j=1;j<=n;j++) {
					cost[i][j] = sc.nextInt();
				}
			}
			
			dp[0][1] = cost[0][1];
			dp[1][1] = cost[1][1];
			
			for(int i=2;i<=n;i++) {
				dp[0][i] = Math.max(dp[1][i-1],dp[1][i-2]) + cost[0][i];
				dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + cost[1][i];
			}
			
			System.out.println(Math.max(dp[0][n], dp[1][n]));
			
			
			
			
		}

	}

}
