package graph;
import java.util.*;

public class bj1991 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static HashMap<String, List<String>> map ;
	public static void main(String[] args) {
		n = sc.nextInt();
		
		map = new HashMap<>();
		
		
		for(int i=0;i<n;i++) {
			String name = sc.next();
			String left = sc.next();
			String right = sc.next();
			
			List<String> list = new ArrayList<>();
			list.add(left);
			list.add(right);
			
			map.put(name, list);
			
		}
		
		preorder("A");
		System.out.println();
		inorder("A");
		System.out.println();
		postorder("A");

	}
	private static void postorder(String name) {
		if(name.equals(".")) {
			return;
		}
		
		String left = map.get(name).get(0);
		String right = map.get(name).get(1);
		
		postorder(left);
		postorder(right);
		System.out.print(name);
		
		
	}
	private static void inorder(String name) {
	
		if(name.equals(".")) {
			return;
		}
		String left = map.get(name).get(0);
		String right = map.get(name).get(1);
		
		inorder(left);
		System.out.print(name);
		inorder(right);
		
		
	}
	private static void preorder(String name) {
		
		if(name.equals(".")) {
			return;
		}
		System.out.print(name);
		
		String left = map.get(name).get(0);
		String right = map.get(name).get(1);
		
		
		preorder(left);
		
		preorder(right);
	}

}
