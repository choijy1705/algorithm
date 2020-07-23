package backtracking;
import java.util.*;

public class bj15649 {
	static Scanner sc = new Scanner(System.in);
	static int M,N;
	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		
		
		
		for(int i=1;i<=N;i++) {
			String s = "";
			boolean[] chk = new boolean[N+1];
			combination(i,chk, 1,s);
			
		}
		
	}
	private static void combination(int num, boolean[] chk, int cnt,String s) {
		
		if(chk[num]) {
			return;
		}
		
		
		if(cnt == M) {
			s += num + " ";
			System.out.println(s);
			
			return;
		}else {
			s += num + " ";
			for(int i=1;i<=N;i++) {		
				chk[num] = true;
				combination(i,chk, cnt+1,s);
				chk[num] = false;
				
			}
		}
		
		

	}

}
