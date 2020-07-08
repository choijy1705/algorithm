package priorityqueue;
//Àý´ë°ª Èü
import java.util.*;

public class bj11286 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		PriorityQueue<Integer> positive = new PriorityQueue<Integer>();
		PriorityQueue<Integer> negative = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<N;i++) {
			
			int num = sc.nextInt();
			
			if(num == 0) {
				if(positive.isEmpty() && negative.isEmpty()) {
					System.out.println("0");
				}else if(positive.isEmpty()){
					System.out.println(negative.poll());
				}else if(negative.isEmpty()) {
					System.out.println(positive.poll());
				}else {
					if(positive.peek() < (negative.peek()*-1)) {
						System.out.println(positive.poll());
					}else if(positive.peek() > (negative.peek()*-1)) {
						System.out.println(negative.poll());
					}else {
						System.out.println(negative.poll());
					}
				}
				
			}else {
				if(num > 0) {
					positive.add(num);
				}else {
					negative.add(num);
				}
			}
		}

	}

}
