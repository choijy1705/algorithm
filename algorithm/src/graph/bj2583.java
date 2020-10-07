package graph;
import java.util.*;		
public class bj2583 {
	static Scanner sc = new Scanner(System.in);
	static int m,n,k;
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		m = sc.nextInt();
		n = sc.nextInt();
		k = sc.nextInt();
		
		boolean[][] map = new boolean[m][n];
		
		for(int t=0;t<k;t++) {
			
			int ay = sc.nextInt();
			int ax = sc.nextInt();
			int by = sc.nextInt();
			int bx = sc.nextInt();
			
			for(int i=ax;i<bx;i++) {
				for(int j=ay;j<by;j++) {
					map[i][j] = true;
				}
			}
			
		}
		
		int cnt = 0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(!map[i][j]) {
					cnt++;
					area(i,j,map);
				}
			}
		}
		System.out.println(cnt);
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
		

	}
	
	static void area(int a, int b, boolean[][] map) {
		
		Queue<Point> queue = new LinkedList<>();
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		queue.add(new Point(a,b));
		map[a][b] = true;
		int result = 1;
		
		while(!queue.isEmpty()) {
			
			Point p = queue.poll();
			
			for(int i=0;i<4;i++) {
				int nx = p.x+ dx[i];
				int ny = p.y + dy[i];
				
				if(nx <0 || nx > map.length-1 || ny <0 || ny > map[0].length-1) {
					continue;
				}
				
				if(!map[nx][ny]) {
					map[nx][ny] = true;
					result++;
					queue.add(new Point(nx,ny));
				}
				
				
			}
		}
		list.add(result);
		
	}

}

class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y =y;
	}
}
