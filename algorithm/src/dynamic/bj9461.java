package dynamic;
import java.util.*;
public class bj9461 {
	static Scanner sc = new Scanner(System.in);
	static int T,N;
	static long[] arr;
 	public static void main(String[] args) {
		T = sc.nextInt();
		
		for(int tc = 0;tc<T;tc++) {
			
			N = sc.nextInt();
			arr = new long[N+1];
			fibo(1);
		}

	}
	private static void fibo(int n) {
		
		if(N == 1) {
			System.out.println(1);
			return;
		}else if(N== 2) {
			System.out.println(1);
			return;
		}else if(N == 3) {
			System.out.println(1);
			return;
		}else if(N==4) {
			System.out.println(2);
			return;
		}else if(N==5) {
			System.out.println(2);
			return;
		}
		
		if(n == N) {
			arr[n] = arr[n-1] + arr[n-5];
			System.out.println(arr[n]);
			return;
		}
		
		if(n == 1) {
			arr[n] = 1;
			fibo(n+1);
		}else if(n== 2) {
			arr[n] = 1;
			fibo(n+1);
		}else if(n == 3) {
			arr[n] = 1;
			fibo(n+1);
		}else if(n==4) {
			arr[n] = 2;
			fibo(n+1);
		}else if(n==5) {
			arr[n] = 2;
			fibo(n+1);
		
		}else {
			arr[n] = arr[n-1] + arr[n-5];
			fibo(n+1);
		}
		
	}

}
