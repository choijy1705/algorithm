package math;
import java.util.*;
public class bj2869 {
	static Scanner sc = new Scanner(System.in);
	static int V,A,B;
	public static void main(String[] args) {
		A = sc.nextInt();
		B = sc.nextInt();
		V = sc.nextInt();
		
		int day = (V-A)/(A-B);
		
		if(day*(A-B) + A >= V) {
			System.out.println(day + 1);
		}else {
			System.out.println(day + 2);
		}
		
		

	}

}
