package dynamic;
import java.util.*;	
public class bj11052 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		int[] a = new int[n+1];
		int[] dp = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				dp[i] = Math.max(dp[i], dp[i-j]+a[j]);
			}
		}
		
		System.out.println(dp[n]);
	}

}
