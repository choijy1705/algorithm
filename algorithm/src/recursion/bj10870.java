package recursion;
// 피보나치수 5
import java.util.*;
public class bj10870 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		
		System.out.println(fibo(n));

	}
	private static int fibo(int n) {
		if(n <=1) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
			
		
	}

}
