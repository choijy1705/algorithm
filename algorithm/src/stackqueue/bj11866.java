package stackqueue;
import java.util.*;
public class bj11866 {
	static Scanner sc = new Scanner(System.in);
	static int N,K;
	
	public static void main(String[] args) {
		N = sc.nextInt();
		K = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			queue.add(i);
		}
		List<Integer> list = new ArrayList<>();
		int k=1;
		int tmp;
		while(list.size()!=N) {
			tmp = queue.poll();
			if(k != K) {
				queue.add(tmp);
			}else {
				list.add(tmp);
			}
			if(k == K) {
				k=1;
			}else {
				k++;
			}
		}
		
		System.out.print("<");
		for(int i=0;i<N;i++) {
			if(i != N-1) {
				System.out.print(list.get(i)+", ");
			}else {
				System.out.print(list.get(i)+">");
			}
			
		}

	}

}
