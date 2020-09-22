package dijkstra;
import java.util.*;

class Node{
	int end;
	long weight;
	
	Node(int end, long weight){
		this.end = end;
		this.weight = weight;
	}

	
	
}


public class bj1504 {
	static int N,E,a,b,c;
	static Scanner sc = new Scanner(System.in);
	static List<Node>[] list;
	static long result = 0;
	static boolean chk;
	static int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		N = sc.nextInt();
		E = sc.nextInt();
		list = new ArrayList[N+1];
		
		for(int i=0;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0;i<E;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			list[a].add(new Node(b,c));
			list[b].add(new Node(a,c));
		}
		
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		
		dijkstra(1,v1);
		dijkstra(v1,v2);
		dijkstra(v2,N);
		
		if(chk) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
		
		
	}
	private static void dijkstra(int start, int end) {
		Queue<Node> queue = new LinkedList<>();
		long[] dist = new long[N+1];
		Arrays.fill(dist, INF);
		queue.add(new Node(start,0));
		dist[start] = 0;
		boolean[] visit = new boolean[N+1];
		while(!queue.isEmpty()) {
			
			Node curNode = queue.poll();
			int cur = curNode.end;
			
			if(visit[cur]) {
				continue;
			}
			
			visit[cur] = true;
			
			for(Node node : list[cur]) {
				if(dist[node.end] > dist[cur] + node.weight) {
					dist[node.end] = dist[cur]+node.weight;
					queue.add(new Node(node.end, dist[node.end]));
				}
			}
		}
		if(dist[end] == INF) {
			chk = true;
		}else {
			result += dist[end];
		}
		
	}

}
