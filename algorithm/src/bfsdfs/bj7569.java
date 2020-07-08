
package bfsdfs;
import java.util.*;

class Dot{
	int x;
	int y;
	int z;
	
	Dot(int x, int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
public class bj7569 {
	static Scanner sc = new Scanner(System.in);
	static int M;
	static int N;
	static int H;
	static int[][][] map;
	static boolean[][][] visited;
	static int[][][] day;
	
	static int[] dx = {-1,1,0,0,0,0};
	static int[] dy = {0,0,-1,1,0,0};
	static int[] dz = {0,0,0,0,-1,1};
	static Queue<Dot> queue = new LinkedList<Dot>();
	
	public static void main(String[] args) {
		M = sc.nextInt();
		N = sc.nextInt();
		H = sc.nextInt();
		map = new int[H][N][M];
		day = new int[H][N][M];
		for(int k=0;k<H;k++) {
			for(int i =0;i<N;i++) {
				for(int j=0;j<M;j++) {
					
					map[k][i][j] = sc.nextInt();
				}
			}
		}
		
		visited = new boolean[H][N][M];
		for(int k=0;k<H;k++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					day[k][i][j] = 0;
					if(map[k][i][j] == 1 && !visited[k][i][j]) {
						visited[k][i][j] = true;
						day[k][i][j] = 1;
						queue.add(new Dot(i,j,k));
						
					}
				}
			}
		}
		
		bfs();
		boolean chk = false;
		int max = 0;
		for(int k=0;k<H;k++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					max = Math.max(max, map[k][i][j]);
					if(map[k][i][j] == 0) {
						chk = true;
						break;
					}
				}
				if(chk) {
					break;
				}
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
			Dot node = queue.poll();
			
			for(int i=0;i<6;i++) {
				int nextX = node.x + dx[i];
				int nextY = node.y + dy[i];
				int nextZ = node.z + dz[i];
				
				if(nextX <0 || nextX >=N || nextY <0 || nextY>=M || nextZ <0 || nextZ >= H) {
					continue;
				}
				if(visited[nextZ][nextX][nextY] || map[nextZ][nextX][nextY] >= 1 || map[nextZ][nextX][nextY] == -1) {
					continue;
				}
				
				queue.add(new Dot(nextX,nextY,nextZ));
				
				visited[nextZ][nextX][nextY] = true;
				map[nextZ][nextX][nextY] = map[node.z][node.x][node.y]+1;
				
				
			}
			
		}
		
	}
}
