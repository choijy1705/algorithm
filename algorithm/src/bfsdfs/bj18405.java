package bfsdfs;
import java.util.*;

class Virus implements Comparable<Virus>{
	int virus;
	int x;
	int y;
	int time = 0;
	Virus(int virus,int x, int y,int time){
		this.virus = virus;
		this.x = x;
		this.y = y;
		this.time = 0;
	}
	@Override
	public int compareTo(Virus v) {
		
		if(time == v.time) {
			return virus - v.virus;
		}else {
			return time - v.time;
		}
		
	}
	
	
}
public class bj18405 {
	static Scanner sc = new Scanner(System.in);
	static int N,K;
	static int S,X,Y;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static List<Virus> list = new ArrayList<>();

	public static void main(String[] args) {
		N = sc.nextInt();
		K = sc.nextInt();
		
		int[][] map = new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] != 0 ) {
					list.add(new Virus(map[i][j], i, j, 0));
				}
			}
		}
		S = sc.nextInt();
		X = sc.nextInt();
		Y = sc.nextInt();
		bfs(map);
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		

	}

	private static void bfs(int[][] map) {
		
		PriorityQueue<Virus> pq = new PriorityQueue<>();
		boolean[][] visit = new boolean[N][N];
		for(Virus p : list) {
			pq.add(p);
			visit[p.x][p.y] = true;
		}
		
		
		
		while(!pq.isEmpty()) {
			
			Virus v = pq.poll();
			System.out.println(v.virus);
			
			if(v.time == S) {
				break;
			}
			for(int i=0;i<4;i++) {
				
				int x = v.x+dx[i];
				int y = v.y+dy[i];
				
				if(x < 0 || x>N-1 || y<0 || y>N-1) {
					continue;
				}
				
				if(map[x][y] == 0 && !visit[x][y]) {
					visit[x][y] = true;
					map[x][y] = v.virus;
					pq.add(new Virus(v.virus, x, y,(v.time+1)));
				}
			}
		}
		//System.out.println(map[X-1][Y-1]);
	}

}
