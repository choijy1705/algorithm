package graph;
import java.util.*;
public class bj1987 {
	static Scanner sc = new Scanner(System.in);
	static int r,c;
	static int max = 0;
	static String[][] map;
	public static void main(String[] args) {
		r = sc.nextInt();
		c = sc.nextInt();
		
		map = new String[r][c];
		
		for(int i=0;i<r;i++) {
			String s = sc.next();
			map[i] = s.split("");
		}
		boolean[] visit = new boolean[26];
		
		dfs(0,0,visit,0);
		
		System.out.println(max);
	}
	
	static void dfs(int x, int y, boolean[] visit, int cnt) {
		
		int a = map[x][y].charAt(0) - 'A';
		
		if(visit[a]) {
			max = Math.max(max, cnt);
			return;
		}
		
		
		
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		
		for(int i=0;i<4;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx<0 || nx > r-1 || ny<0 || ny>c-1) {
				continue;
			}
			visit[a] = true;
			dfs(nx,ny, visit, cnt+1);
			visit[a] = false;
		}
	}
}

