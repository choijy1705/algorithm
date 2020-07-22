package bruteforce;
import java.util.*;
public class bj2798 {
	static Scanner sc = new Scanner(System.in);
	static int N,M;
	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] card = new int[N];
		for(int i=0;i<N;i++) {
			card[i] = sc.nextInt();
		}
		
		Arrays.sort(card);
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k = j+1;k<N;k++) {
					int num = card[i] + card[j] + card[k];
					if(num<=M) {
						list.add(num);
					}else {
						break;
					}
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(list.size()-1));

	}

}
