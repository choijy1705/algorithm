package string;
import java.util.*;
public class bj2941 {
	static Scanner sc = new Scanner(System.in);
	static String s;
	public static void main(String[] args) {
		s = sc.next();
		
		String[] cr = new String[8];
		
		cr[0] = "c=";
		cr[1] = "c-";
		cr[2] = "dz=";
		cr[3] = "d-";
		cr[4] = "lj";
		cr[5] = "nj";
		cr[6] = "s=";
		cr[7] = "z=";
		
		int cnt = s.length();
		
		for(int i=0;i<8;i++) {
			if(s.contains(cr[i])) {
				s = s.replaceAll(cr[i], "*");
			}
			
		}
		
		System.out.println(s.length());

	}

}
