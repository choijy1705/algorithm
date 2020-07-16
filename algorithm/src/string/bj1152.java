package string;
import java.util.*;
public class bj1152 {
	static Scanner sc = new Scanner(System.in);
	static String s;
	public static void main(String[] args) {
		int cnt = 0;
		String s = sc.nextLine();
		String[] st = s.split(" ");
		
		if(st.length > 1 && st[0].equals("")) {
			System.out.println(st.length-1);
		}else {
			System.out.println(st.length);
		}
		

	}

}
