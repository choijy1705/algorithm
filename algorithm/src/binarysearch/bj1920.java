package binarysearch;
import java.util.*;
public class bj1920 {
	static Scanner sc =new Scanner(System.in);
	static int n,m;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		
		m = sc.nextInt();
		
		for(int i=0;i<m;i++) {
			binarySearch(sc.nextInt(), 0, n-1, arr);
		}
		System.out.println(sb.toString());
	}
	private static void binarySearch(int target, int low, int high, int[] arr) {
		
		if(low > high) {
			
			sb.append(0 + "\n");
			return;
		}
		
		int mid = (low + high)/2;
		
		if(target < arr[mid]) {
			binarySearch(target, low, mid-1, arr);
		}else if(arr[mid]< target) {
			binarySearch(target,mid+1,high,arr);
		}else {
			sb.append(1 + "\n");
		}
		
	}
	


}
