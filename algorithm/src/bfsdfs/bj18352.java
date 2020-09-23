package bfsdfs;
import java.util.*;
public class bj18352 {
	static int N,M,K,X;
	static Scanner sc = new Scanner(System.in);
	static List<Integer>[] list;
	static List<Integer> result = new ArrayList<>();
	public static void main(String[] args) {
		
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		X = sc.nextInt();
		
		list = new ArrayList[N+1];
		
		for(int i=0;i<=N;i++) {
			list[i] = new ArrayList();
		}
		
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list[a].add(b);
		}
		
		bfs(K,X);
		
		Collections.sort(result);
		if(result.size() > 0) {
			for(int a : result) {
				System.out.println(a);
			}
		}else {
			System.out.println(-1);
		}
		
	}
	private static void bfs(int k, int x) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(x);
		boolean[] visit = new boolean[N+1];
		int[] dist = new int[N+1];
		dist[x] = 0;
		visit[x] = true;
		
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			
			for(int next : list[cur]) {
				if(!visit[next]) {
					visit[next] = true;
					queue.add(next);
					dist[next] = dist[cur] + 1;
					if(dist[next] == k) {
						result.add(next);
					}
				}
			}
		}
		
	}

}
