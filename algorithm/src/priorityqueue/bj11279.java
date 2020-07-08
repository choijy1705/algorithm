package priorityqueue;
// ÃÖ´ë Èü
import java.util.*;

public class bj11279 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		boolean chk = false;
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			
			if(num == 0) {
				if(!pq.isEmpty()) {
					System.out.println(pq.poll());
				}else {
					System.out.println("0");
				}
			}else {
				pq.add(num);
			}
			
			
			
		}
		
		

	}

}
