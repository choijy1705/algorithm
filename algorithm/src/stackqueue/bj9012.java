package stackqueue;
import java.util.*;

public class bj9012 {
	static Scanner sc = new Scanner(System.in);
	static int T;
	public static void main(String[] args) {
		T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			Stack s = new Stack();
			
			String vps = sc.next();
			boolean chk = false;
			for(int j=0;j<vps.length();j++) {
				if(vps.charAt(j) == '(') {
					s.push(1);
				}else if(vps.charAt(j) == ')') {
					try {
						s.pop();
					}catch(Exception e) {
						chk = true;
						break;
					}
					
				}
			}
			
			if(chk) {
				System.out.println("NO");
			}else {
				if(s.isEmpty()) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}

	}

}
