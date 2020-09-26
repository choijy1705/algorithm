package graph;
import java.util.*;
public class bj11724 {
	static Scanner sc = new Scanner(System.in);
	static int n,m;
	static int[] parent;
	public static void main(String[] args) {
		n = sc.nextInt();
		m=sc.nextInt();
		
		parent = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			parent[i] = i;
		}
		
		for(int i=0;i<m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			union(x,y);
		}
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=1;i<=n;i++) {
			System.out.println(parent[i]);
			set.add(parent[i]);
		}
		
		System.out.println(set.size());
	}
	private static void union(int x, int y) {
		
		x = find(x);
		y = find(y);
		
		if(x<=y) {
			parent[y] = x;
		}else {
			parent[x] = y;
		}
		
	}
	private static int find(int x) {
		if(parent[x] == x) {
			return x;
		}
		
		return parent[x] = find(parent[x]);
	}

}
