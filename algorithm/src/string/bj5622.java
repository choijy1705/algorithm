package string;
import java.util.*;
public class bj5622 {
	static Scanner sc = new Scanner(System.in);
	static String s;
	public static void main(String[] args) {
		s = sc.next();
		
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int cnt = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != 'Z') {
				int index = alpha.indexOf(s.charAt(i));
				cnt +=(index/3 + 3);
			}else {
				cnt += 11;
			}
			
		}
		System.out.println(cnt);
	}

}
