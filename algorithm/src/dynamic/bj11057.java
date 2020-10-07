package dynamic;
import java.util.*;

public class bj11057 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		
		n = sc.nextInt();
		long[][] dp = new long[n+1][10];
		for(int i=0;i<9;i++) {
			dp[1][i]=1;
		}
		
		if(n >1) {
			for(int i=2;i<=n;i++) {
				
				for(int j=0;j<10;j++) {
					for(int k=0;k<=j;k++) {
						dp[i][j] += dp[i-1][k];
					}
					
				}
			}
		}
		
		long result = 0;
		for(int i=0;i<10;i++) {
			result += dp[n][i];
		}
		System.out.println(result+1);

	}

}
