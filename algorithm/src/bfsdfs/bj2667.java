package bfsdfs;
import java.util.*;

public class bj2667 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int dangi =0;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static String[][] apt;
	static int cnt;
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		N = sc.nextInt();
		
		apt = new String[N][N];
		boolean[][] visited = new boolean[N][N];
		
		
		for(int i=0;i<N;i++) {
			String s = sc.next();
			apt[i] = s.split("");
		}

		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				
				if(apt[i][j].equals("1") && !visited[i][j]) {
					dangi++;
					cnt = 0;
					dfs(i,j,visited);
					list.add(cnt);
				}
			}
		}
		
		System.out.println(dangi);
		
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	private static void dfs(int i, int j, boolean[][] visited) {
		
		if(i<0 || i>=N || j<0 || j>=N) {
			return;
		}
		
		if(visited[i][j] || apt[i][j].equals("0")) {
			return;
		}
		
				
		visited[i][j] = true;
		cnt++;
		
		
		for(int a=0;a<4;a++) {
			dfs(i+dx[a], j+dy[a],visited);
		}
		
	}

}
