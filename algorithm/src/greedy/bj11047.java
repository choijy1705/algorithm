package greedy;
import java.util.*;
public class bj11047 {
	static Scanner sc = new Scanner(System.in);
	static int N,K;
	public static void main(String[] args) {
		N = sc.nextInt();
		K = sc.nextInt();
		int[] money = new int[N];
		for(int i=0;i<N;i++) {
			money[i] = sc.nextInt();
		}
		int cnt = 0;
		int result;
		for(int i=N-1;i>=0;i--) {
			if(K >= money[i]) {
				result = K/money[i];
				cnt+= result;
				K -= result*money[i];

			}
		}
		
		System.out.println(cnt);

	}

}
