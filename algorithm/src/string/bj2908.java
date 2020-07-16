package string;
import java.util.*;
public class bj2908 {
	static Scanner sc = new Scanner(System.in);
	static String a,b;
	public static void main(String[] args) {
		a = sc.next();
		b = sc.next();
		
		String aaa = "";
		String bbb = "";
		for(int i=0;i<a.length();i++) {
			aaa += String.valueOf(a.charAt(a.length()-1-i));
		}
		
		for(int i=0;i<b.length();i++) {
			bbb += String.valueOf(b.charAt(b.length()-1-i));
		}
		
		int numa = Integer.parseInt(aaa);
		int numb = Integer.parseInt(bbb);
		
		if(numa > numb) {
			System.out.println(numa);
		}else {
			System.out.println(numb);
		}
		
		
		
		
	}

}
