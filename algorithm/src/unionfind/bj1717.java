package unionfind;
import java.util.*;
public class bj1717 {
	static int n, m;
	static Scanner sc = new Scanner(System.in);
	static int[] parent;
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		parent = new int[n+1];
		
		for(int i=0;i<n;i++) {
			parent[i] = i;
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == 0) {
				union(b,c);
			}else {
				isSameParent(b,c);
			}
			
		}
		

	}
	private static void isSameParent(int x, int y) {
		if(parent[x] == parent[y]) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
	private static void union(int x, int y) {
		
		int a = find(x);
		int b = find(y);
		
		if(a<b) {
			parent[x] = a;
			parent[y] = a;
		}else {
			parent[x] = b;
			parent[y] = b;
		}
		
		
	}
	private static int find(int x) {
		if(parent[x] == x) {
			return x;
		}else {
			return find(parent[x]);
		}
	}

}
