package bruteforce;
import java.util.*;
public class bj1107 {
	static Scanner sc = new Scanner(System.in);
	static int n,m;
	static int min = Integer.MAX_VALUE;
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		
		
		for(int i=0;i<=9;i++) {
			list.add(i);
		}
		
		for(int i=0;i<m;i++) {
			int idx = sc.nextInt();
			
			list.remove((Integer)idx);
		}
		
		goChannel(100, 0, "");
		
		System.out.println(min);

	}
	private static void goChannel(int a, int b, String s) {
		if(b==8) {
			return;
		}
		
		s += a+"";
		
		int num = Integer.parseInt(s);
		if(a != 100) {
			min = Math.min(min, Math.abs(num - n)+s.length());
		}else {
			min = Math.min(min, Math.abs(num-n));
		}
		
		
		for(int i=0;i<list.size();i++) {
			goChannel(list.get(i),b+1, s);
		}
		
		
	}
	

}
