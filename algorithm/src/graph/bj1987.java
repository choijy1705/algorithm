package graph;
import java.util.*;
public class bj1987 {
	static Scanner sc = new Scanner(System.in);
	static int r,c;
	static int max = 1;
	
	public static void main(String[] args) {
		r = sc.nextInt();
		c = sc.nextInt();
		
		String[][] map = new String[r][c];
		
		for(int i=0;i<r;i++) {
			String s = sc.next();
			map[i] = s.split("");
		}
		
		List<String> list = new ArrayList<>();
		
		bfs(map,list);
		System.out.println(max);
	}
	
	static void bfs(String[][] map , List<String> list) {
		
		Queue<Point3> queue = new LinkedList<>();
		list.add(map[0][0]);
		Point3 point = new Point3(0,0,1, list);
	
		queue.add(point);
		
		boolean[][] visit = new boolean[r][c];
		visit[0][0] = true;
		
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		
		while(!queue.isEmpty()) {
			Point3 p = queue.poll();
			System.out.println(map[p.x][p.y]);
			for(int i=0;i<4;i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx<0 || nx>r-1 || ny<0 || ny>c-1) {
					continue;
				}
				
				if(!visit[nx][ny] && !p.list.contains(map[nx][ny])) {
					visit[nx][ny] = true;
					p.list.add(map[nx][ny]);
					Point3 po = new Point3(nx,ny,p.cnt+1,p.list);
					p.list.remove(p.list.size()-1);
					queue.add(po);
					
					max = Math.max(max, p.cnt+1);
				}
			}
			
		}
	}

}

class Point3{
	int x;
	int y;
	int cnt;
	List<String> list = new ArrayList<>();
	Point3(int x, int y, int cnt, List<String> list){
		this.x = x;
		this.y = y;
		this.cnt = cnt;
		this.list = list;
	}
}
