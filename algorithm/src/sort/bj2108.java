package sort;
import java.util.*;
public class bj2108 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		int[] arr = new int[4001];
		int[] num = new int[N];
		int sum = 0;
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			sum+=a;
			num[i] = a;
			arr[a]++;
		}
		
		System.out.println((int)(Math.round((sum/N)*10)/10));
		
		Arrays.sort(num);
		
		if(N%2 == 0) {
			System.out.println((arr[N/2-1] + arr[N/2])/2);
		}else {
			System.out.println(arr[(int)(N/2)]);
		}
		
		
		
		
		
		
		int max = 0;
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(index); // ÃÖºó°ª

	}

}
