package dynamic;
import java.util.*;
public class bj2748 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static long[] fibo;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		fibo = new long[N+1];
		
		fibonacci(0);
	}
	private static void fibonacci(int n) {
		
		if(N>1 &&n == N) {
			System.out.println(fibo[n-1] + fibo[n-2]);
			return;
		}
		
		if(N==1) {
			System.out.println(1);
			return;
		}else if(N==0){
			System.out.println(0);
			return;
		}
		
		if(n == 0) {
			fibo[n] = 0;
			fibonacci(n+1);
		}else if(n==1) {
			fibo[n] = 1; 
			fibonacci(n+1);
		}else {
			fibo[n] = fibo[n-1] + fibo[n-2];
			fibonacci(n+1);
		}
		
		
	}

}
