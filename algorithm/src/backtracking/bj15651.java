package backtracking;
import java.util.*;
public class bj15651 {
	static Scanner sc = new Scanner(System.in);
	static int N,M;
	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			StringBuilder s = new StringBuilder();
			combination(i,1,s);
		}
	}
	private static void combination(int num, int cnt, StringBuilder s) {
		if(cnt == M) {
			s.append(num);
			System.out.println(s.toString());
			return;
		}
		
		s.append(num + " ");
		
		for(int i=1;i<=N;i++) {
			combination(i, cnt+1, s);
		}
	}

}
