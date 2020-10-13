package bruteforce;
import java.util.*;
public class bj1759 {
	static Scanner sc = new Scanner(System.in);
	static int l,c;
	static String[] st;
	public static void main(String[] args) {
		l = sc.nextInt();
		c = sc.nextInt();
		
		st = new String[c];
		
		for(int i=0;i<c;i++) {
			st[i] = sc.next();
		}
		
		Arrays.sort(st);
		
		boolean[] visit = new boolean[c];
		
		for(int i=0;i<c;i++) {
			visit[i] = true;
			
			secret(visit, st[i],i);
			visit[i] = false;
		}
	}
	private static void secret(boolean[] visit, String s, int idx) {
		
	
		if(s.length() == l) {
	
			int mo = 0;
			int ja = 0;
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u') {
					mo++;
				}else {
					ja++;
				}
			}
			
			if(ja>=2 && mo >=1) {
				System.out.println(s);
			}
			return;
		}
		
		for(int i=idx+1;i<c;i++) {
			
			if(visit[i]) continue;
			visit[i] = true;
		
			secret(visit, s+st[i], i);
			visit[i] = false;
		}
		
	}

}
