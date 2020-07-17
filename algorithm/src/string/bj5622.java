package string;
import java.util.*;
public class bj5622 {
	static Scanner sc = new Scanner(System.in);
	static String s;
	public static void main(String[] args) {
		s = sc.next();
		
		String[] al = new String[10];
		al[2] = "ABC";
		al[3] = "DEF";
		al[4] = "GHI";
		al[5] = "JKL";
		al[6] = "MNO";
		al[7] = "PQRS";
		al[8] = "TUV";
		al[9] = "WXYZ";
		int cnt = 0;
		for(int i=0;i<s.length();i++) {
			
			for(int j=2;j<=9;j++) {
				if(al[j].contains(String.valueOf(s.charAt(i)))){
					cnt += j+1;
					break;
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
