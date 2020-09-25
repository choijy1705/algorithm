package bruteforce;
import java.util.*;
public class bj1182 {
	static Scanner sc = new Scanner(System.in);
	static int n,s;
	static int result = 0;
	public static void main(String[] args) {
		n = sc.nextInt();
		s = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			find(arr[i], arr,i);
		}
		System.out.println(result);

	}
	private static void find(int sum, int[] arr,int idx) {
		
		if(sum == s) {
			result++;

		}

		if(idx == n-1) {
			return;
		}
		for(int i=idx+1;i<n;i++) {
			
			find(sum+arr[i], arr,i);
			
		}
		
	}

}
