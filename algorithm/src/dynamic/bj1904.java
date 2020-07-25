package dynamic;
import java.util.*;
public class bj1904 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] arr;
	public static void main(String[] args) {
		N = sc.nextInt();
		arr = new int[N+1];
		fibo(1);

	}
	private static void fibo(int n) {
		
		if(N ==1) {
			System.out.println(1);
			return;
		}else if(N == 2) {
			System.out.println(2);
			return;
		}
		
		if(n==N) {
			arr[n] = arr[n-1]%15746 + arr[n-2]%15746;
			System.out.println(arr[N]%15746);
			return;
		}
		
		
		if(n==1) {
			arr[n] = 1;
			fibo(n+1);
		}else if(n == 2) {
			arr[n] = 2;
			fibo(n+1);
		}else {
			arr[n] = arr[n-1]%15746 + arr[n-2]%15746;
			fibo(n+1);
		}
	}

}
