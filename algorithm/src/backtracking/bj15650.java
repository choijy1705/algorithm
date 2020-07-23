package backtracking;
import java.util.*;
public class bj15650 {
	static Scanner sc = new Scanner(System.in);
	static int N,M;
	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			boolean[] chk = new boolean[N+1];
			String s = "";
			combination(i,1,chk,s);
		}
	}
	private static void combination(int num, int cnt, boolean[] chk,String s) {
		if(chk[num]) {
			return;
		}
		
		if(cnt == M) {
			s += num;
			System.out.println(s);
		}else {
			s += num + " ";
			for(int i=num+1;i<=N;i++) {
				chk[num] =true;
				combination(i,cnt+1,chk,s);
				chk[num] = false;
			}
			
		}
		
	}

}
