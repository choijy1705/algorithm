package bruteforce;
import java.util.*;
public class bj1018 {
	static Scanner sc = new Scanner(System.in);
	static int M,N;
	public static void main(String[] args) {
		M = sc.nextInt();
		N = sc.nextInt();
		
		
		String[][] map = new String[M][N];
		for(int i=0;i<M;i++) {
			map[i] = sc.next().split("");
		}
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<=M-8;i++) {
			for(int j=0;j<=N-8;j++) {
				int cnt = 0;
				String s = map[i][j];
				
				int k=1;
				for(int a=i;a<i+8;a++) {
					if(k==1) {
						k = 0;
					}else {
						k=1;
					}
					for(int b=j;b<j+8;b++) {
						
						if(k == 0) {
							if(!map[a][b].equals(s)) {
								cnt++;
							}
						}else {
							if(map[a][b].equals(s)) {
								cnt++;
							}
						}
						if(k==1) {
							k = 0;
						}else {
							k=1;
						}
					}
				}
				list.add(cnt);
				list.add(64-cnt);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));

	}

}
