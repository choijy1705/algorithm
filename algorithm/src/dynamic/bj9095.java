package dynamic;
import java.util.*;
public class bj9095 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			
			
			
			if(num == 1) {
				System.out.println(1);
				
			}else if(num == 2) {
				System.out.println(2);
			}else if(num == 3) {
				System.out.println(4);
			}else {
				int[] dp = new int[num+1];
				dp[0] = 0;
				dp[1] = 1;
				dp[2] = 2;
				dp[3] = 4;
				
				for(int j=4;j<=num;j++) {
					dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
				}
				System.out.println(dp[num]);
			}
			
		}

	}

}
