package recursion;
import java.util.*;
public class bj2447 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		String[][] three = new String[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				three[i][j] = "*";
			}
		}
		three[1][1] = " ";
		
		make(N, three);

	}
	private static void make(int n, String[][] three) {
		
		
		int len = three.length;
		if(len == n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(three[i][j]);
				}
				System.out.println();
			}
			return;
		}
		int a = len * 3;
		
		String[][] s = new String[a][a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				
				
				if(i>=len && i< len+len && j >=len && j<len+len ) {
					s[i][j] = " ";
				}else {
					s[i][j] = three[i%len][j%len];
				}
			}
		}
		
		
		make(n,s);
		
	}

}
