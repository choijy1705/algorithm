package math;
import java.util.*;
public class bj1978 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			
			if(num == 1) {
				continue;
			}
			boolean chk = true;
			for(int j=2;j<num;j++) {
				if(num%j == 0) {
					chk = false;
				}
			}
			if(chk) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
