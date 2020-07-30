package greedy;
import java.util.*;
public class bj11399 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		
		int sum = 0;
		int wait = 0;
		
		for(int i=0;i<N;i++) {
			wait += arr[i];
			sum += wait;
		}
		
		System.out.println(sum);
	}

}
