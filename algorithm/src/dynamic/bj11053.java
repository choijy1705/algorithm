package dynamic;
import java.util.*;
public class bj11053 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		int[] dp = new int[n];
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		dp[0] = 1;
		
		for(int i=1;i<n;i++) {
			dp[i]=1;
			
			for(int j=0;j<i;j++) {
				if(arr[j] < arr[i] && dp[i] <= dp[j]) {
					dp[i] = dp[j]+1;
				}
			}
		}
		int max = 0;
		
		for(int i:dp) {
			max = Math.max(max, i);
		}
		
		System.out.println(max);
	}

}
