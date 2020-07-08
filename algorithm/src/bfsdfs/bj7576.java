package bfsdfs;
import java.util.*;

public class bj7576 {
	static Scanner sc = new Scanner(System.in);
	static int M;
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int[][] day;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static Queue<Node> queue = new LinkedList<Node>();
	
	public static void main(String[] args) {
		M = sc.nextInt();
		N = sc.nextInt();
		
		map = new int[N][M];
		day = new int[N][M];
		
		for(int i =0;i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		visited = new boolean[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				day[i][j] = 0;
				if(map[i][j] == 1 && !visited[i][j]) {
					visited[i][j] = true;
					day[i][j] = 1;
					queue.add(new Node(i,j));
					
				}
			}
		}
		bfs();
		boolean chk = false;
		int max = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				max = Math.max(max, map[i][j]);
				if(map[i][j] == 0) {
					chk = true;
					break;
				}
			}
			if(chk) {
				break;
			}
		}
		if(chk) {
			System.out.println(-1);
		}else {
			System.out.println(max-1);
		}
		
		
			
		
	}

	private static void bfs() {
				
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			
			for(int i=0;i<4;i++) {
				int nextX = node.x + dx[i];
				int nextY = node.y + dy[i];
				
				if(nextX <0 || nextX >=N || nextY <0 || nextY>=M) {
					continue;
				}
				if(visited[nextX][nextY] || map[nextX][nextY] >= 1 || map[nextX][nextY] == -1) {
					continue;
				}
				
				queue.add(new Node(nextX,nextY));
				
				visited[nextX][nextY] = true;
				map[nextX][nextY] = map[node.x][node.y]+1;
				
				
			}
			
		}
		
	}
}
