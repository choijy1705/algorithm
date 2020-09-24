package priorityqueue;
// 가운데를 말해요
import java.util.*;
public class bj1655 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		
		N = sc.nextInt();
		PriorityQueue<Integer> min = new PriorityQueue<>((o1,o2) -> o1 - o2);
		PriorityQueue<Integer> max = new PriorityQueue<>((o1,o2)->o2-o1);
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			
			if(min.size() == max.size()) {
				max.add(num);
			}else {
				min.add(num);
			}
			
			if(!min.isEmpty() && !max.isEmpty()) {
				if(min.peek() < max.peek()) {
					int tmp = min.poll();
					min.add(max.poll());
					max.add(tmp);
				}
			}
			sb.append(max.peek() + "\n");
			
			
		}
		System.out.println(sb.toString());
		
		
		
	}

}
