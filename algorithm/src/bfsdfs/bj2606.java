package bfsdfs;
import java.util.*;
public class bj2606 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int link;
	static List<Integer>[] list;
	static int cnt = 0;
	public static void main(String[] args) {
		N = sc.nextInt(); //컴퓨터의 수
		link = sc.nextInt(); // 연결된 컴퓨터 수
		
		list = new LinkedList[N+1];
		boolean[] visited = new boolean[N+1];
		for(int i=0;i<N+1;i++) {
			list[i] = new LinkedList<Integer>();
		}
		
		for(int i=0;i<link;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list[a].add(b);
			list[b].add(a);
		}
		
		dfs(1, visited);
		System.out.println(cnt-1);
	}
	private static void dfs(int v, boolean[] visited) {
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		cnt++;
		
		for(int i=0;i<list[v].size();i++) {
			int a = list[v].get(i);
			dfs(a, visited);
		}
		
		
	}

}
