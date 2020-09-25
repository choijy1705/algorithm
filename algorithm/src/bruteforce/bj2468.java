package bruteforce;
import java.util.*;
public class bj2468 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int result;
	public static void main(String[] args) {
		n = sc.nextInt();
		int[][] map = new int[n][n];
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j] = sc.nextInt();
				max = Math.max(map[i][j], max);
			}
		}
		int k=1;	
		while(k<=max) {
			safeArea(map, k);
			k++;
		}
		if(result == 0) {
			result = 1;
		}
		System.out.println(result);
	}
	private static void safeArea(int[][] map, int k) {
		
		boolean[][] chk = new boolean[n][n];
		int cnt = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j] > k && !chk[i][j]) {
					drawn(i,j,map,chk,k);
					cnt++;
				}
			}
		}
		result = Math.max(cnt, result);
	}
	private static void drawn(int x, int y, int[][] map, boolean[][] chk,int k) {
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		chk[x][y] = true;
		for(int i=0;i<4;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx < 0 || nx > map.length-1 || ny < 0 || ny>map.length-1) {
				continue;
			}
			if(map[nx][ny] > k && !chk[nx][ny]) {
				drawn(nx,ny,map, chk, k);
			}
		}
		
	}
	
	

}
