package graph;
import java.util.*;

class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class bj4963 {
	static Scanner sc = new Scanner(System.in);
	static int w,h;
	public static void main(String[] args) {
		h = sc.nextInt();
		w = sc.nextInt();
		
		while(w != 0 && h != 0) {
			
			int[][] map = new int[w][h];
			boolean[][] visit = new boolean[w][h];
			
			for(int i=0;i<w;i++) {
				for(int j=0;j<h;j++) {
					map[i][j] = sc.nextInt();
				}
			}
	
			
			int cnt = 0;
			for(int i=0;i<w;i++) {
				for(int j=0;j<h;j++) {
					if(!visit[i][j] && map[i][j] == 1) {
						cnt++;
						bfs(map,visit,i,j);
					}
				}
			}
			
			
			
			System.out.println(cnt);
			
			
			
			h = sc.nextInt();
			w = sc.nextInt();
		}

	}

	private static void bfs(int[][] map,  boolean[][] visit,int x, int y) {
		
		Queue<Point> queue = new LinkedList<>();
		queue.add(new Point(x,y));
		visit[x][y] = true;
		
		int[] dx = {-1,-1,-1,0,0,1,1,1};
		int[] dy = {-1,0,1,-1,1,-1,0,1};
		
		while(!queue.isEmpty()) {
			
			Point p = queue.poll();
			
			for(int i=0;i<8;i++) {
				int nx = p.x+dx[i];
				int ny = p.y+dy[i];
				
				if(nx<0 || nx>w-1 || ny<0 || ny>h-1) {
					continue;
				}
				
				if(!visit[nx][ny] && map[nx][ny] == 1) {
					visit[nx][ny] = true;
					queue.add(new Point(nx,ny));
				}
			}
		}
		
		
		
	}

}
