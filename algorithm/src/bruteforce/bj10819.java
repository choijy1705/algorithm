package bruteforce;
import java.util.*;
public class bj10819 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int max;
	public static void main(String[] args) {
		n = sc.nextInt();
		max = 0;
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean[] visit = new boolean[n];
		for(int i=0;i<n;i++) {
			visit[i]= true;
			makeMax(i,visit, arr,0,1);
			visit[i] = false;
		}
		
		System.out.println(max);
	}
	private static void makeMax(int idx, boolean[] visit, int[] arr, int sum,int cnt) {
		
		if(cnt == n) {
			max = Math.max(max, sum);
		}
		
		
		for(int i=0;i<n;i++) {
			
			if(!visit[i]) {
				visit[i] = true;
				makeMax(i,visit,arr,sum+ Math.abs(arr[idx] - arr[i]),cnt+1);
				visit[i] = false;
			}
		}
		
	}

}
