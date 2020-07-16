package string;
import java.util.*;
public class bj10809 {
	static Scanner sc = new Scanner(System.in);
	static String s;
	public static void main(String[] args) {
		s=sc.next();
		
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int len = alpha.length();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<len;i++) {
			if(s.contains(String.valueOf(alpha.charAt(i)))){
				sb.append(s.indexOf(alpha.charAt(i)) + " ");
			}else {
				sb.append(-1 + " ");
			}
		}
		System.out.println(sb.toString());

	}

}
