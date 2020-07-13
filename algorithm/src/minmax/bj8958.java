package minmax;
import java.util.*;

public class bj8958 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			String ox = sc.next();
			int cnt = 1;
			int score = 0;
			for(int j=0;j<ox.length();j++) {
				if(ox.charAt(j)=='O') {
					score += cnt;
					cnt++;
				}else {
					cnt = 1;
				}
			}
			System.out.println(score);
		}
		
	}

}
