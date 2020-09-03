package unionfind;
import java.util.*;
public class bj1976 {
	static int N, M;
	static int[] city;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		N = sc.nextInt(); // 도시의 수
		M = sc.nextInt(); // 방문 도시의 수
		
		city = new int[N];
		
		for(int i=0;i<N;i++) {
			city[i] = i;
		}
		
		for(int i=0;i<N;i++) {
			for(int j= 0;j<N;j++) {
				int a = sc.nextInt();
				
				if(a==1) {
					union(i,j);
				}
			}
		}
		
		int chk = -1;
		boolean bl = true;
		for(int i=0;i<M;i++) {
			if(i==0) {
				chk = find(sc.nextInt()-1);
			}else {
				if(chk != find(sc.nextInt()-1)) {
					System.out.println("NO");
					bl = false;
					break;
				}
			}
		}
		if(bl) {
			System.out.println("YES");
		}
	}
	private static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x != y) {
			city[y] = x;
		}
		
	}
	private static int find(int x) {
		if(city[x] == x) {
			return x;
		}
		
		return city[x] = find(city[x]);
	}

}
