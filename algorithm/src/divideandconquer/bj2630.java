package divideandconquer;

import java.util.*;

public class bj2630 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int square=0;
	static int blue=0;
	public static void main(String[] args) {
		N = sc.nextInt();
		int[][] map = new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		divide(map);
		System.out.println(square-blue);
		System.out.println(blue);
				
	}
	private static void divide(int[][] map) {
		
		int n = map.length;
		n = n/2;
		
		
		int[] dx = {0,n,0,n};
		int[] dy = {0,0,n,n};
		
		for(int k=0;k<4;k++) {
			int cnt =0;
			int[][] newmap = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					cnt += map[i+dx[k]][j+dy[k]];
					newmap[i][j] = map[i+dx[k]][j+dy[k]];
				}
			}
			
			if(cnt ==0 || cnt == n*n) {
				square++;
				if(cnt == n*n) {
					blue++;
				}
			}else {
				divide(newmap);
			}
			
		}
		
		
		
	}

}
