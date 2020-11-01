package bfsdfs;
import java.util.*;
public class bj11657 {
	static Scanner sc = new Scanner(System.in);
	static int n,m;
	public static void main(String[] args) {
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		
		int[][] link = new int[n+1][n+1];
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			link[a][b] = c;
		}
		
		

	}

}
