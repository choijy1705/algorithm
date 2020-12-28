package graph;
import java.util.*;

public class bj1992 {
	static Scanner sc = new Scanner(System.in);
	static int n,m;
	static boolean[] check;
	static int result = 0;
	public static void main(String[] args) {
			n = sc.nextInt();
			m = sc.nextInt();
			
			int[][] map = new int[n+1][n+1];
			
			for(int i=0;i<m;i++) {
				map[sc.nextInt()][sc.nextInt()] = sc.nextInt();
			}
			check = new boolean[n+1];
			
			
			for(int i=1;i<=n;i++) {
				if(!check[i]) {
					check[i] = true;
					findMinBridge(map[i]);
				}
			}
			System.out.println(result);
		
	}
	private static void findMinBridge(int[] bridge) {
		int min = Integer.MAX_VALUE;
		int index = 0;
		for(int i=0;i<bridge.length;i++) {
			if(bridge[i] != 0 && bridge[i] < min) {
				min = bridge[i];
				index=i;
			}
		}
		if(min == Integer.MAX_VALUE) {
			return;
		}
		result += min;
		check[index] = true;
		
	}

}
