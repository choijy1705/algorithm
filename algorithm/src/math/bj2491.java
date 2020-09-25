package math;
import java.util.*;
public class bj2491 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		
		N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 1;
		int max = 0;
		for(int i=1;i<N;i++) {
			if(arr[i]>=arr[i-1]) {
				cnt++;
			}else {
				max = Math.max(cnt, max);
				cnt=1;
			}
		}
		max = Math.max(cnt, max);
		cnt=1;
		for(int i=1;i<N;i++) {
			if(arr[i]<=arr[i-1]) {
				cnt++;
			}else {
				max = Math.max(cnt, max);
				cnt=1;
			}
		}
		max = Math.max(cnt, max);
		
		System.out.println(max);
	}

}
