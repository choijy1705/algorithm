package sort;
import java.util.*;
public class bj2751 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<N;i++) {
			pq.add(sc.nextInt());
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(pq.poll());
		}
		
	}

}
