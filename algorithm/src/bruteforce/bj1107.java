package bruteforce;
import java.util.*;
public class bj1107 {
	static Scanner sc = new Scanner(System.in);
	static int n,m;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<=9;i++) {
			list.add(i);
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			list.remove(a);
		}
		
		for(int i=0;i<6;i++) {
			StringBuilder sb = new StringBuilder();
			pick(i,0,sb);
		}
	

	}
	private static void pick(int i, int j,StringBuilder sb) {
		sb.append(i);
		
		int a = Integer.parseInt(sb.toString());
		
		min = Math.min(min, Math.abs(n-a));
		
		for(int i=0;i<6;)
		
	}

}
