package unionfind;
import java.util.*;
public class bj4195 {
	static Scanner sc = new Scanner(System.in);
	static int[] parent;
	static int[] level;
	static int[] relation;
	static StringBuilder sb;
	public static void main(String[] args) {
		int t = sc.nextInt();
		sb = new StringBuilder();
		
		while(t-->0) {
			int f = sc.nextInt();
			int idx = 1;
			HashMap<String,Integer> hm = new HashMap<>();
			parent = new int[200001];
			level = new int[200001];
			relation = new int[200001];
			
			for(int i=1;i<200001;i++) {
				parent[i] = i;
				relation[i] = i;
				
			}
			
			for(int i=0;i<f;i++) {
				String a = sc.next();
				String b= sc.next();
				
				if(!hm.containsKey(a)) {
					hm.put(a, idx++);
				}
				
				if(!hm.containsKey(b)) {
					hm.put(b, idx++);
	
				}
				
				int ai = hm.get(a);
				int bi = hm.get(b);
				
				merge(ai, bi);
				
				
			}
		
		}

	}
	private static void merge(int u, int v) {
		u = find(u);
		v = find(v);
		
		if(u == v) {
			sb.append(relation[u] + "\n");
			return;
		}
		
		if(level[u] > level[v]) {
			int temp = u;
			
			u = v;
			v = temp;
		}
		
		parent[u] = v;
		relation[v] += relation[u];
		
		if(level[u] == level[v]) {
			++level[v];
		}
		
	}
	private static int find(int u) {
		if(parent[u] == u) {
			return u;
		}
		return parent[u] = find(parent[u]);
	}

}
