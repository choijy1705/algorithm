package function;
import java.util.*;
public class bj1065 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int cnt = 0;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			check(i);
		}
		System.out.println(cnt);
	}
	private static void check(int n) {
		String num = String.valueOf(n);
		boolean chk = true;
		int k = 0;
		for(int i=0;i<num.length()-1;i++) {
			if(i==0) {
				k = (num.charAt(i+1) - num.charAt(i)); 
			}else {
				if( k != (num.charAt(i+1) - num.charAt(i))){
					chk = false;
					break;
				}
			}	
		}
		if(chk) {
			cnt++;
		}
	}

}
