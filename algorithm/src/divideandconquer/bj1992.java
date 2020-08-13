package divideandconquer;
import java.util.*;
import java.io.*;
public class bj1992 {
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		String[][] map = new String[N][N];
		
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			map[i] = s.split("");
		}
		int cnt = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				cnt+= Integer.parseInt(map[i][j]);
			}
		}
		if(cnt == 0 || cnt == N*N) {
			if(cnt == 0) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
			
		}else {
			System.out.println(divide(map));
		}
		

	}
	private static String divide(String[][] map) {
		
		int n = map.length;
		n = n/2;
		
		int[] dx = {0,0,n,n};
		int[] dy = {0,n,0,n};
		String s = "";
		for(int k=0;k<4;k++) {
			String[][] newmap = new String[n][n];
			int cnt = 0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					
					newmap[i][j]=map[i+dx[k]][j+dy[k]];
					cnt +=Integer.parseInt(map[i+dx[k]][j+dy[k]]);
				}
			}
			
			if(cnt == 0 || cnt == n*n) {
				if(cnt == 0) {
					s = s+"0";
				}else {
					s = s+"1";
				}
			}else {
				s = s + divide(newmap);
			}
		}
		
		
		return "("+s+")";
	}

}
