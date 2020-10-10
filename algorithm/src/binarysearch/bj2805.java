package binarysearch;
import java.util.*;	
public class bj2805 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static long m;
	public static void main(String[] args) {
		
		n = sc.nextInt();
		m = sc.nextLong();
		long[] arr = new long[n];
		
		long max = 0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max,  arr[i]);
		}
		
		long min = 1;
		
		while(min <= max) {
			long mid = (min+max)/2;
			
			long tree = 0;
			for(int i=0;i<n;i++) {
				if(arr[i] > mid) {
					tree += (arr[i]-mid);
				}
				
			}
			
			if(tree >= m) {
				min = mid+1;
			}else if(tree < m) {
				max = mid-1;
			}

		}
		System.out.println(max);

	}

}
