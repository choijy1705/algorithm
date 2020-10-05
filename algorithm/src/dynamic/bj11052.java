package dynamic;
import java.util.*;	
public class bj11052 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		int[] dp = new int[n];
		for(int i=0;i<n;i++) {
			dp[i] = sc.nextInt();
		}
		
		
		for(int i=1;i<n;i++) {
			int max = dp[i];
			
			for(int j=0;j<i;j++) {
				int div = (i+1)/(j+1);
				System.out.println(div + " : " + (i-(div)*(j+1)+1));
				
				max = Math.max(max, dp[j]*div + dp[i-(j+1)]*(i-(div)*(j+1)+1));
			}
			dp[i] = max;
			System.out.println(dp[i]);
		}
		
		System.out.println(dp[n-1]);
	}

}
