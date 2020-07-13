package minmax;
import java.util.*;
public class bj1546 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		double M = arr[arr.length-1];
		
		double sum = 0.0;
		for(int i=0;i<N;i++) {
			sum += (arr[i]/M)*100;
			
		}
		
		
		System.out.println(sum/N);

	}

}
