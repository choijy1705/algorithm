package bruteforce;
import java.util.*;
public class bj7568 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		int[] weight = new int[N];
		int[] height = new int[N];
		
		for(int i=0;i<N;i++) {
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			int w = weight[i];
			int h = height[i];
			int cnt = 0;
			for(int j=0;j<N;j++) {
				if(w < weight[j] && h < height[j]) {
					cnt++;
				}
			}
			
			System.out.print((cnt+1) + " ");
		}

	}

}
