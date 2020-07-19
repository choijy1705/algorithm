package math;
import java.util.*;
public class bj1929 {
	static Scanner sc = new Scanner(System.in);
	static int M, N;
	public static void main(String[] args) {
		M = sc.nextInt();
		N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int s=0;
		for(int i=2;i<=N;i++) {
			list.add(i);
		}
		
		for(int i=0;i<list.size();i++) {
			int n = list.get(i);
			
			for(int j=i+1;j<list.size();j++) {
				if(list.get(j)%n == 0) {
					list.remove(j);
					j--;
				}
			}
		}
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) < M) {
				continue;
			}
			System.out.println(list.get(i));
		}
	}

}
