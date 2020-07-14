package function;
import java.util.*;
public class bj4673 {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		
		
		for(int i=1;i<=10000;i++) {
			list.add(i);
		}
		
		for(int i=1;i<=10000;i++) {
			d(i);
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	private static void d(int n) {
		String s = String.valueOf(n);
		
		int num = 0;
		num +=n;
		for(int i=0;i<s.length();i++) {
			num += s.charAt(i) - '0';
		}
		list.remove((Integer)num);
	}

}
