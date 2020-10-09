package graph;
import java.util.*;
class Point4{
	int x;
	int y;
	int cnt;
	Point4(int x, int y, int cnt){
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}
public class bj7562 {
	static Scanner sc = new Scanner(System.in);
	static int t,l;
	static int min;
	public static void main(String[] args) {
		t = sc.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			l = sc.nextInt();
			min = Integer.MAX_VALUE;
			boolean[][] visit = new boolean[l][l];
			
			int startx = sc.nextInt();
			int starty = sc.nextInt();
			int endx = sc.nextInt();
			int endy = sc.nextInt();
			
			if(startx != endx || starty != endy) {
				bfs(startx, starty, endx, endy,visit);
			}
			
			
			if(min != Integer.MAX_VALUE) {
				System.out.println(min);
			}else {
				System.out.println(0);
			}
			
		}
	}
	private static void bfs(int startx, int starty, int endx, int endy, boolean[][] visit) {
		
		Queue<Point4> queue = new LinkedList<>();
		queue.add(new Point4(startx, starty,0));
		visit[startx][starty] = true;
		
		int[] dx = {-2,-1,1,2,2,1,-1,-2};
		int[] dy = {1,2,2,1,-1,-2,-2,-1};
		while(!queue.isEmpty()) {
			Point4 p = queue.poll();
			
			for(int i=0;i<8;i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx<0 || nx > l-1 || ny<0 || ny >l-1) {
					continue;
				}
				
				if(!visit[nx][ny]) {
					visit[nx][ny] = true;
					if(nx == endx && ny == endy) {
						min = Math.min(min, p.cnt+1);
					}
					queue.add(new Point4(nx,ny,p.cnt+1));
					
					
				}
			}
			
		}
		
	}


}
