package priorityqueue;
//ÃÖ¼Ò Èü
import java.util.*;

public class bj1927 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<N;i++) {
			int num =sc.nextInt();
			
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
