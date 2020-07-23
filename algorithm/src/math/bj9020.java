package math;
import java.util.*;
public class bj9020 {
	static Scanner sc = new Scanner(System.in);
	static int C, num;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=0;tc<C;tc++) {
			num = sc.nextInt();
			
			boolean[] prime = new boolean[num+1];
			
			prime[1] = true;
			
			for(int i=2;i<=num;i++) {
				for(int j=2;i*j<=num;j++) {
					prime[i*j] = true;
				}
			}
			String s = "";
			gold(prime, num,s,0,2 );
			
		}

	}
	private static void gold(boolean[] prime, int number, String s,int cnt, int b) {
		
		if(number < 0 || cnt >2) {
			return;
		}
		
		if(number == 0) {
			System.out.println(s);
			return;
		}
		
		for(int i=b;i<num;i++) {
			if(!prime[i]) {
				String sd = s +" " +  i ;
				gold(prime, number - i,sd,cnt+1,i);
			}
		}
	}

}
