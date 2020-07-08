package priorityqueue;
// 가운데를 말해요
import java.util.*;
public class bj1655 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		
		N = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			list.add(num);
			
			Collections.sort(list);
			
			System.out.println((list.get((list.size()-1)/2)));
			
			
			
		}
	}

}
