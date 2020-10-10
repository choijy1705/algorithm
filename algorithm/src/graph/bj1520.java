package graph;
import java.util.*;
class Point5{
	int x;
	int y;
	int num;
	Point5(int x, int y, int num){
		this.x = x;
		this.y = y;
		this.num = num;
	}
}
public class bj1520 {
	static Scanner sc = new Scanner(System.in);
	static int m,n;
	static int[][] dp;
	static int[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) {
		m = sc.nextInt();
		n = sc.nextInt();
		
		map = new int[m][n];
		dp = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				map[i][j] = sc.nextInt();
				dp[i][j] = -1;
			}
		}
		
		System.out.println(dfs(0,0));


	}


	private static int dfs(int x, int y) {
		
		dp[x][y] = 0;
		
		for(int i=0;i<4;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx<0 || nx >m-1 || ny <0 || ny >n-1) {
				continue;
			}
			
			if(map[x][y] > map[nx][ny]) {
				if(nx == m-1 && ny == n-1) {
					dp[x][y] ++;
				}
				if(dp[nx][ny] >=0) {
					dp[x][y] += dp[nx][ny];
				}else {
					dp[x][y] += dfs(m,n);
				}
			}
		}
		
		
		return dp[x][y];
	}
	

}
