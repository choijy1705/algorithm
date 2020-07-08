package bfsdfs;
import java.util.*;

public class bj1012 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int M;
	static int N;
	static int K;
	static int[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) {
		C =sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			
			map = new int[N][M];
			boolean[][] visited = new boolean[N][M];
			
			for(int i=0;i<N;i++) {
				Arrays.fill(map[i], 0);
			}
			
			for(int i=0;i<K;i++) {
				int y = sc.nextInt();
				int x = sc.nextInt();
				
				map[x][y] = 1;
			}
			
			int result = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(map[i][j] == 1 && !visited[i][j]) {
						result++;
						dfs(i,j,visited);
					}
				}
			}
			
			System.out.println(result);
		}
	}
	private static void dfs(int i, int j, boolean[][] visited) {
		if(i<0 || i>=N || j<0||j>=M) {
			return;
		}
		
		if(visited[i][j] || map[i][j] == 0) {
			return;
		}
		
		visited[i][j] = true;
		
		for(int a=0;a<4;a++) {
			dfs(i+dx[a], j+dy[a],visited);
		}
	}

}
