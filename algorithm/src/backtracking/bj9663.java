package backtracking;
import java.util.*;
public class bj9663 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static boolean[][] map;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		map = new boolean[N][N];
		int cnt = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!map[i][j]) {
					cnt++;
					nqeen(i,j);
				}
			}
		}
		
		System.out.println(cnt);

	}
	private static void nqeen(int n, int m) {
		
		for(int i=0;i<N;i++) {
			map[n][i] = true;
			map[i][m] = true;	
		}
		int k=1;
		
		while(true) {
			boolean chk = true;
			if(n+k<N && m+k<N) {
				map[n+k][m+k] = true;
				chk=false;
			}
			
			if(n-k>=0 && m-k>=0) {
				map[n-k][m-k] = true;
				chk=false;
			}
			
			if(n+k<N && m-k>=0){
				map[n+k][m-k] = true;
				chk=false;
			}
			
			if(n-k>=0 && m+k<N) {
				map[n-k][m+k] = true;
				chk=false;
			}
			k++;
			
			if(chk) {
				break;
			}
		}
		
		return;

		
	}

}
