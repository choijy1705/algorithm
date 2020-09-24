package dynamic;
import java.util.*;
public class bj2156 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		int[] grape = new int[N];
		
		for(int i=0;i<N;i++) {
			grape[i] = sc.nextInt();
		}
		int[] dp = new int[N];
		
		if(N==1) {
			System.out.println(grape[0]);
		}else if(N==2) {
			System.out.println(grape[0] + grape[1]);
		}else {
			dp[0] = grape[0];
			dp[1] = grape[0]+grape[1];
			dp[2] = Math.max(dp[1],Math.max(dp[0]+grape[2], grape[1] + grape[2]));
			
			for(int i=3;i<N;i++) {
				dp[i] = Math.max(dp[i-2] +grape[i], dp[i-3] + grape[i]+grape[i-1]);
				dp[i] = Math.max(dp[i], dp[i-1]);
			}
			System.out.println(dp[N-1]);
			
		}
		
		
		

	}

}
