package bfsdfs;
import java.util.*;
public class bj2206 {
	static Scanner sc = new Scanner(System.in);
	static int N,M;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int result = Integer.MAX_VALUE;
	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[][] map = new int[N][M];
		
		for(int i=0;i<N;i++) {
			String s =sc.next();
			String[] arr = s.split("");
			
			for(int j=0;j<M;j++) {
				map[i][j]=Integer.parseInt(arr[j]);
			}
		}
		
		boolean[][] visit = new boolean[N][M];
		Point po = new Point(0,0);
		dfs(po,visit, map, 0,0);
		if(result == Integer.MAX_VALUE) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
		

	}
	private static void dfs(Point p, boolean[][] visit, int[][] map,int breakwall,int cnt) {
		if(p.x ==N-1 && p.y == M-1) {
			
			result = Math.min(result, cnt+1);
			return;
		}
		
		if(visit[p.x][p.y]) {
			return;
		}

		
		for(int i=0;i<4;i++) {
			if(p.x+dx[i] >=0 && p.x+dx[i]<N && p.y+dy[i]>=0 && p.y+dy[i] <M) {
				
				if(map[p.x+dx[i]][p.y+dy[i]] == 0) {
					Point newp = new Point(p.x+dx[i],p.y+dy[i]);
					visit[p.x][p.y]= true;
					dfs(newp, visit, map, breakwall, cnt+1);
					visit[p.x][p.y] = false;
				}else if(map[p.x+dx[i]][p.y+dy[i]] == 1&& breakwall == 0) {
					
					Point newp = new Point(p.x+dx[i],p.y+dy[i]);
					visit[p.x][p.y]= true;
					dfs(newp, visit, map, breakwall+1, cnt+1);
					visit[p.x][p.y] = false;
				}
			}
			
		}
		
		
	}
	
}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
