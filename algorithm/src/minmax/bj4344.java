package minmax;
import java.util.*;
public class bj4344 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int i=0;i<C;i++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			double sum = 0;
			for(int j=0;j<N;j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}

			double avg = (double)sum/N;
		
			int cnt = 0;
			for(int j=0;j<N;j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			
			
			double result = (cnt/(double)N)*100;
			
			System.out.printf("%.3f",result);
			System.out.print("%");
			System.out.println();
		}
	}

}
