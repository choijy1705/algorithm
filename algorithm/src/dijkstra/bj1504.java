package dijkstra;
import java.util.*;

class Node implements Comparable<Node>{
	int end;
	int weight;
	
	Node(int end, int weight){
		this.end = end;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node o) {
		return weight - o.weight;
	}
	
	
	
}


public class bj1504 {
	static int N,E,a,b,c;
	static Scanner sc = new Scanner(System.in);
	static List<Node>[] list;
	static long result = 0;
	static boolean chk;
	static int INF = 200000000;
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
		
		int answer = solve(v1,v2);
		System.out.println(answer);
	}
	private static int solve(int v1, int v2) {
		int result1 = 0 ;
		int result2 = 0;
		
		result1 += dijkstra(1,v1);
		result1 += dijkstra(v1,v2);
		result1 += dijkstra(v2,N);
		
		result2 += dijkstra(1,v2);
		result2 += dijkstra(v2,v1);
		result2 += dijkstra(v1,N);
		
		if(result1 >= INF && result2 >= INF) {
			return -1;
		}else {
			return Math.min(result1, result2);
		}
	}
	private static int dijkstra(int start, int end) {
		
		PriorityQueue<Node> queue = new PriorityQueue<>();
		queue.add(new Node(start, 0));
		int[] dist = new int[N+1];
		Arrays.fill(dist, INF);
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
				if(!visit[node.end] && dist[node.end] > dist[cur] + node.weight) {
					dist[node.end] = dist[cur] + node.weight;
					queue.add(new Node(node.end, dist[node.end]));
				}
			}
			
			
		}
		return dist[end];
	}
	
}
