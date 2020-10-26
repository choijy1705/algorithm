package bruteforce;
import java.util.*;
public class bj1107 {
	static Scanner sc = new Scanner(System.in);
	static int n,m;
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
			
		}
	

	}

}
