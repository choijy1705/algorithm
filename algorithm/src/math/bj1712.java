package math;
import java.util.*;

public class bj1712 {
	static Scanner sc = new Scanner(System.in);
	static int A,B,C;
	public static void main(String[] args) {
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		if(C-B == 0) {
			System.out.println(-1);
			
		}else {
			int x = A/(C-B);
			
			if(x <0) {
				System.out.println(-1);
			}else {
				
				System.out.println(x+1);
				
			}
		}
		

	}

}
