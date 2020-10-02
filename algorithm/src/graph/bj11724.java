package graph;
import java.util.*;
public class bj11724 {
	static Scanner sc = new Scanner(System.in);
	static int n,m;
	static int[][] graph;
	static boolean[] visited;
	public static void main(String[] args) {
		n = sc.nextInt();
		m=sc.nextInt();
		graph = new int[n+1][n+1];
		visited = new boolean[n+1];
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			graph[a][b] = graph[b][a] = 1;
			
		}
		
		int result = 0;
		
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				dfs(i);
				result++;
			}
			
		}
		System.out.println(result);
	}

	private static void dfs(int index) {
		
		if(visited[index]) {
			return;
		}else {
			visited[index] = true;
			for(int i=1;i<=n;i++) {
				if(graph[index][i] == 1) {
					dfs(i);
				}
			}
		}
		
		
	}
	
	

}
