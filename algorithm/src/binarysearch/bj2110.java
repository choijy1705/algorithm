package binarysearch;
import java.util.*;
public class bj2110 {
	static Scanner sc = new Scanner(System.in);
	static int n,c;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		c = sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int ans = 1;
		int start =1;
		int end = arr[n-1] - arr[0];
		
		while(start <= end) {
			int mid = (start + end)/2;

			if(check(arr, mid, c)) {
				
				ans = Math.max(ans, mid);
				start = mid+1;
			}else {
				end = mid -1;
			}
		}
		
		System.out.println(ans);
		

	}
	private static boolean check(int[] arr, int dist, int c) {
		int cnt = 1;
		int last = arr[0] +  dist;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] >= last) {
				cnt++;
				last = arr[i] + dist;
				
			}
		}
		return cnt >= c;
	}
	

}
