package math;
import java.util.*;
public class bj1929 {
	static Scanner sc = new Scanner(System.in);
	static int M, N;
	public static void main(String[] args) {
		M = sc.nextInt();
		N = sc.nextInt();
		
		boolean[] num = new boolean[N+1];
		
		
		num[1] = true;
		for(int i=2;i<=N;i++) {
			for(int j = 2;i*j<=N;j++) {
				num[i*j] = true;
			}
		}
		
		for(int i=M;i<=N;i++) {
			if(!num[i]) {
				System.out.println(i);
			}
		}
	}

}
