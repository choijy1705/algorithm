package dynamic;
import java.util.*;	
public class bj1932 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		int[][] arr = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j] = sc.nextInt();
				if(j==i) {
					break;
				}
			}
		}
		
		
		for(int i=1;i<N;i++) {
			for(int j=0;j<N;j++) {
				
				if(j==0) {
					arr[i][j] = arr[i-1][j] + arr[i][j];
				}else if(j==i) {
					arr[i][j] = arr[i-1][j-1] + arr[i][j];
					break;
				}else {
					arr[i][j] = Math.max(arr[i-1][j-1],arr[i-1][j]) + arr[i][j];
				}
			}
		}
		Arrays.sort(arr[N-1]);
		
		System.out.println(arr[N-1][N-1]);

	}

}
