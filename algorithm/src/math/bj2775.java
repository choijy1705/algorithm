package math;
import java.util.*;
public class bj2775 {
	static Scanner sc = new Scanner(System.in);
	static int C,k,n;
	
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=0;tc<C;tc++) {
			
			k = sc.nextInt();
			n = sc.nextInt(); // kÃþ nÈ£
			
			int[][] arr = new int[k+1][n];
			
			for(int i=0;i<=k;i++) {
				arr[i][0] = 1;
			}
			
			for(int i=0;i<n;i++) {
				arr[0][i] = i+1;
			}
			
			for(int i=1;i<=k;i++) {
				for(int j=1;j<n;j++) {
					arr[i][j] = arr[i-1][j] + arr[i][j-1];
				}
			}
			
			System.out.println(arr[k][n-1]);
		}
		

	}

	

}
