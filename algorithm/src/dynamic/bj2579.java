package dynamic;
import java.util.*;
public class bj2579 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i=0;i<N;i++) {
			int num  = sc.nextInt();
			if(i==0) {
				arr[i][0] = 0;
				arr[i][1] = num;
			}else if(i == 1){
				arr[i][0] =num + arr[0][1];
				arr[i][1] = num;
			}else {
				arr[i][0] = num + arr[i-1][1];
				arr[i][1] = num + Math.max(arr[i-2][0],arr[i-2][1]);

			}
		}
		
		System.out.println(Math.max(arr[N-1][0], arr[N-1][1]));
		
		
	}
}


