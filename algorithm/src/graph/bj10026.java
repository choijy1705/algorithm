package graph;
import java.util.*;
public class bj10026 {
	static int n;
	static String[][] map;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		n = sc.nextInt();
		
		map = new String[n][n];
		
		for(int i=0;i<n;i++) {
			String s = sc.next();
			
			map[i] = s.split("");
		}
		int cnt = 0;
		boolean[][] visit = new boolean[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(!visit[i][j]) {
					cnt++;
					bfs(i,j,visit);
				}			
				
			}
		}
		System.out.print(cnt + " ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j].equals("G")) {
					map[i][j] = "R";
				}
			}
		}
		cnt = 0;
		visit = new boolean[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(!visit[i][j]) {
					cnt++;
					bfs(i,j,visit);
				}			
			}
		}
		System.out.print(cnt);
		

	}
	private static void bfs(int x, int y, boolean[][] visit) {
		
		Queue<Point3> queue = new LinkedList<>();
		queue.add(new Point3(x,y));
		visit[x][y] = true;
		String s = map[x][y];
		
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		
		while(!queue.isEmpty()) {
			Point3 p = queue.poll();
			
			for(int i=0;i<4;i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx<0||nx>n-1||ny<0||ny>n-1) {
					continue;
				}
				
				if(!visit[nx][ny] && map[nx][ny].equals(s)) {
					visit[nx][ny] = true;
					queue.add(new Point3(nx,ny));
				}
				
			}
		}
	}

}

class Point3{
	int x;
	int y;
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
}
