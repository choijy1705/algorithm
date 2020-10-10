package binarysearch;
import java.util.*;

public class bj10816 {
	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	static int cnt;
	static int[] arr;
	public static void main(String[] args) {
		n = sc.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<m;i++) {
			int num = sc.nextInt();
			sb.append(check(num)).append(" ");
		}
		System.out.println(sb.toString());
		

	}
	private static int check(int num) {
		int low = lower(num);
		int high = upper(num);
		return high - low-1;
	}
	private static int upper(int num) {
		int left=0, right = n;
		
		while(left<right) {
			int mid = (left+right)/2;
			
			if(arr[mid] == num) {
				left = mid+1;
			}else if(arr[mid] > num) {
				right = mid;
			}else {
				left = mid +1;
			}
		}
		
		return left+1;
	}
	private static int lower(int num) {
int left=0, right = n;
		
		while(left<right) {
			int mid = (left+right)/2;
			
			if(arr[mid] == num) {
				right = mid;
			}else if(arr[mid] > num) {
				right = mid;
			}else {
				left = mid +1;
			}
		}
		
		return right;
	}
	
	

}
