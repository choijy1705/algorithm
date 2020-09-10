package binarysearch;
import java.util.*;

public class bj10816 {
	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	static int cnt;
	public static void main(String[] args) {
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		m = sc.nextInt();
		
		for(int i=0;i<m;i++) {
			cnt = 0;
			binarySearch(arr, 0, n-1,sc.nextInt());
		}
		System.out.println(sb.toString());
		

	}
	private static void binarySearch(int[] arr, int low, int high, int target) {
		if(low > high) {
			sb.append(cnt + " ");
			return;
		}
		
		int mid = (low+high)/2;
		
		if(target < arr[mid]) {
			binarySearch(arr, low, mid-1, target);
		}else if(arr[mid] < target) {
			binarySearch(arr, mid+1, high,target);
		}else {
			cnt++;
			int k = 1;
			boolean chk = true;
			while(chk) {
				chk = false;
				if(mid+k < arr.length && target == arr[mid + k] ) {
					chk = true;
					cnt++;
				}
				
				if(mid-k>=0 && target == arr[mid - k]) {
					chk = true;
					cnt++;
				}
				k++;
			}
			sb.append(cnt + " ");
		}
		
	}
	

}
