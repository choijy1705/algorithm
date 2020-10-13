package dijkstra;
import java.util.*;

 class Node3 implements Comparable<Node3>{
	
	int end, weight;
	
	Node3(int end, int weight){
		this.end = end;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node3 o) {
		return weight - o.weight;
	}
}

public class bj1753 {
	static int V,E,K;
	static int u,v,w;
	static List<Node3>[] list;
	static int[] dist;
	static Scanner sc = new Scanner(System.in);
	static int INF = 1000000000;
	public static void main(String[] args) {
		V = sc.nextInt();
		E = sc.nextInt();
		K = sc.nextInt();
		
		list = new ArrayList[V+1];
		dist = new int[V+1];
		Arrays.fill(dist, INF);
		
		for(int i=0;i<=V;i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0;i<E;i++) {
			u = sc.nextInt();
			v = sc.nextInt();
			w = sc.nextInt();
			
			list[u].add(new Node3(v,w));
			
		}
		
		dijkstra(K);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=V;i++) {
			if(dist[i] == INF) {
				sb.append("INF" + "\n");
			}else {
				sb.append(dist[i]+"\n");
			}
		}
		
		System.out.println(sb.toString());
		
	}
	private static void dijkstra(int start) {
		PriorityQueue<Node3> queue = new PriorityQueue<>();
		queue.add(new Node3(start, 0));
		dist[start]=0;
		boolean[] visit = new boolean[V+1];
		while(!queue.isEmpty()) {
			Node3 curNode = queue.poll();
			int cur = curNode.end;
			
			if(visit[cur]) {
				continue;
			}
			visit[cur] = true;
			for(Node3 node : list[cur]) {
				if(dist[node.end] > dist[cur] + node.weight) {
					dist[node.end] = dist[cur] + node.weight;
					queue.add(new Node3(node.end, dist[node.end]));
				}
				
			}
		}
		
		
	}
	
	

}
