package dynamic;
import java.util.*;
public class bj1010 {
	static Scanner sc = new Scanner(System.in);
	static int n,m,t;
	public static void main(String[] args) {
		t = sc.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			n = sc.nextInt();
			m = sc.nextInt();
			
			if(m == 1) {
				System.out.println(1);
			}else {
				long[] num = new long[m+1];
				num[0]=1;
				num[1] = 1;
				for(int i=2;i<=m;i++) {
					num[i] = num[i-1]*i;
				}
				
				long[] dp = new long[m+1];
				
				dp[n] = 1;
				int k=1;
				for(int i=n+1;i<=m;i++) {
					dp[i] = (i*dp[i-1])/k;
					k++;
				}
				
				System.out.println(dp[m]);
				

			}
			
			
		}
	}

}
