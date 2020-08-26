package tree;
// 트리의 지름 찾기
import java.util.*;

public class bj1167 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int len = 0;
	static Tree[] tree;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		tree= new Tree[N+1];
		tree[0] = new Tree(0);
		
		for(int i=0;i<N;i++) {
			int node = sc.nextInt();
			int link = sc.nextInt();
			
			tree[node] = new Tree(node);
			while(link != -1) {
				int length = sc.nextInt();
				tree[node].map.put(link, length);
				link = sc.nextInt();
			}	 
		}
		
		
		boolean[] visit = new boolean[N+1];
		for(int i=1;i<=N;i++) {
			bfs(i);
		}
		System.out.println(len);
		
	}
	private static void bfs(int node) {
		Queue<Tree> queue = new LinkedList<>();
		int length = 0;
		queue.add(tree[node]);
		boolean[] visit = new boolean[N+1];
		
		
		while(!queue.isEmpty()) {
			
			Tree t =queue.poll();
			visit[t.no] = true; 
			
			Set<Integer> key = t.map.keySet();
			int max = 0;
			int nextnode = 0;
			boolean chk = false;
			for(int k : key) {
				if(max < t.map.get(k) && !visit[k]) {
					chk = true;
					nextnode = k;
				}
			}
			if(chk) {
				length += t.map.get(nextnode);
				queue.add(tree[nextnode]);
			}
			
		}
		
		len = Math.max(len, length);
		
	}
	

}

class Tree{
	int no;
	HashMap<Integer, Integer> map = new HashMap<>();	
	
	Tree(int no){
		this.no = no;
	}
}