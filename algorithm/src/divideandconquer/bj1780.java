package divideandconquer;
import java.io.*;
import java.util.*;
public class bj1780 {
	static int N;
	static int zero=0;
	static int one = 0;
	static int minus = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		String[][] paper = new String[N][N];
		
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			paper[i] = s.split(" ");
		}
		
		countpaper(paper);
		
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(one);
		
		
		

	}

	private static void countpaper(String[][] paper) {
		
		int l = paper.length;
		
		int num = Integer.parseInt(paper[0][0]);
		boolean chk = false;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if(num != Integer.parseInt(paper[i][j])) {
					chk = true;
					break;
				}
			}
		}
		if(chk) {
			int[] dx = {0,0,0,l/3,l/3,l/3,2*l/3,2*l/3,2*l/3};
			int[] dy = {0,l/3, 2*l/3,0,l/3, 2*l/3,0,l/3, 2*l/3};
			
			int n = l/3;
			for(int k=0;k<9;k++) {
				String[][] newpaper = new String[n][n];
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						newpaper[i][j] = paper[i+dx[k]][j+dy[k]];
					}
				}
				countpaper(newpaper);
			}
		}else {
			if(num == 0) {
				zero++;
			}else if(num == 1) {
				one++;
			}else if(num == -1) {
				minus++;
			}else {
				
			}
		}
		
		
	}

}
