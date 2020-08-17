package dynamic;
import java.util.*;
public class bj1149 {
	static int N;
	static Scanner sc = new Scanner(System.in);
	static int result = Integer.MAX_VALUE;
	static int[][] price;
	public static void main(String[] args) {
		N = sc.nextInt();
		price = new int[N][3];
		for(int i=0;i<N;i++) {
			price[i][0] = sc.nextInt();
			price[i][1] = sc.nextInt();
			price[i][2] = sc.nextInt();
		}
		
		for(int i = 1;i<N;i++) {
			for(int j=0;j<3;j++) {
				if(j==0) {
					price[i][j] = price[i][j] + Math.min(price[i-1][1],price[i-1][2]);
				}else if(j==1) {
					price[i][j] = price[i][j] + Math.min(price[i-1][0],price[i-1][2]);
				}else {
					price[i][j] = price[i][j] + Math.min(price[i-1][0],price[i-1][1]);
				}
			}
		}
		
		Arrays.sort(price[N-1]);
		System.out.println(price[N-1][0]);

	}
	

}
