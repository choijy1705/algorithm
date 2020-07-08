package tree;
//트리의 부모 찾기
import java.util.*;
public class bj11725 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int u,v;
	static List<Integer>[] list;
	static int[] parents;
	static boolean[] visit;
	public static void main(String[] args) {
		N = sc.nextInt();
		visit = new boolean[N+1];
		list = new LinkedList[N+1];
		parents = new int[N+1];
		for(int i=0;i<N+1;i++) {
			list[i] = new LinkedList<Integer>();
		}
		
		for(int i=0;i<N-1;i++) {
			u = sc.nextInt();
			v = sc.nextInt();
			
			list[u].add(v);
			list[v].add(u);
			
		}
		
		bfs(1);
		for(int i=2;i<=N;i++) {
			System.out.println(parents[i]);
		}
	}
	private static void bfs(int n) {
		
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		
		while(!queue.isEmpty()) {
			int parent = queue.poll();
			
			if(visit[parent]) {
				continue;
			}
			
			visit[parent] = true;
			
			for(int child : list[parent]) {	
				queue.add(child);
				if(parents[child] ==0) {
					parents[child] = parent;
				}
				
				
			}
		}
		
	}
	

}
