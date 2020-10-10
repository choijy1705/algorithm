package binarysearch;
import java.util.*;
public class bj1654 {
	static Scanner sc = new Scanner(System.in);
	static int k,n;
	public static void main(String[] args) {
		k = sc.nextInt();
		n = sc.nextInt();
		
		long[] arr = new long[k];
		long max = 0;
		for(int i=0;i<k;i++) {
			arr[i] = sc.nextLong();
			max = Math.max(max, arr[i]);
			
		}
		
		System.out.println(binarySearch(1,max,arr));

	}
	private static long binarySearch(long left, long right, long[] arr) {
		
		while(left <= right) {
			long mid = (left + right)/2;
			
			int cnt = 0;
			for(int i=0;i<k;i++) {
				cnt += arr[i]/mid;
			}
			
			if(cnt < n) {
				right = mid-1;
			}else if(cnt >= n) {
				left = mid+1;
			}
			
		}
		return right;
		
	}

}
