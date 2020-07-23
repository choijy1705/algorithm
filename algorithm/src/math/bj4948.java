package math;
import java.util.*;
public class bj4948 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		
		N = sc.nextInt();
		
		while(N != 0) {
			boolean[] num = new boolean[2*N+1];
			
			num[1] = true;
			
			for(int i=2;i<=2*N;i++) {
				for(int j=2;i*j<=2*N;j++) {
					num[i*j] = true;
				}
			}
			int cnt = 0;
			for(int i=N+1;i<=2*N;i++) {
				if(!num[i]) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
			
			
			N = sc.nextInt();
		}

	}

}
