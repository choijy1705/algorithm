package string;
import java.util.*;
public class bj2675 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		for(int j=0;j<N;j++) {
			int a = sc.nextInt();
			
			String s = sc.next();
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<s.length();i++) {
				String st = new String(new char[a]).replace("\0", String.valueOf(s.charAt(i)));
				sb.append(st);
			}
			
			System.out.println(sb.toString());
		}
		
	}

}
