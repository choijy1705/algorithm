package string;
import java.util.*;
public class bj1316 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static String s;
	public static void main(String[] args) {
		N = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<N;i++) {
			s = sc.next();
			boolean chk = true;
			List<String> list = new ArrayList<>();
			for(int j=0;j<s.length();j++) {
				if(list.contains(String.valueOf(s.charAt(j)))) {
					if(s.charAt(j) != s.charAt(j-1)) {
						chk = false;
						break;
					}
				}else {
					list.add(String.valueOf(s.charAt(j)));
				};
			}
			if(chk) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
		
	}

}
