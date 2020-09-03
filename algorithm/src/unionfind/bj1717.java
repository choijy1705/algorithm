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
		
		for(int i=0;i<=n;i++) {
			parent[i] = i;
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(a == 0) {
				union(x,y);
			}else {
				isSameParent(x,y);
			}
			
		}
		

	}
	private static void isSameParent(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x == y) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
	private static void union(int x, int y) {
		
		x = find(x);
		y = find(y);
		
		if(x != y) {
			parent[y] = x;
		}
		
		
	}
	private static int find(int x) {
		if(parent[x] == x) {
			return x;
		}
		
		return parent[x] = find(parent[x]);
		
	}

}
