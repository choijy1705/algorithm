package bfsdfs;
import java.util.*;

class Node{
	int x;
	int y;
	
	Node(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class bj2178 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int M;
	static int[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int result;
	static boolean[][] visited;
	
	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String s = sc.next();
			String[] arr = s.split("");
		
			for(int j=0;j<arr.length;j++) {
				map[i][j] = Integer.parseInt(arr[j]);
			}
		}
		visited[0][0] = true;
		bfs(0,0);
		System.out.println(map[N-1][M-1]);

	}

	private static void bfs(int x, int y) {
		
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(new Node(x, y));
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			for(int i=0;i<4;i++) {
				int nextX = node.x + dx[i];
				int nextY = node.y +dy[i];
				
				if(nextX < 0 || nextX >= N || nextY < 0 || nextY >=M) {
					continue;
				}
				
				if(visited[nextX][nextY] || map[nextX][nextY]== 0) {
					continue;
				}
				
				queue.add(new Node(nextX,nextY));
				
				visited[nextX][nextY] = true;
				map[nextX][nextY] = map[node.x][node.y] + 1;
			}
		}
		
	}

}
