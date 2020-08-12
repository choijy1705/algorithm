package stackqueue;
import java.util.*;
public class bj2164 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		Queue<Integer> queue = new LinkedList();
		for(int i=1;i<=N;i++) {
			queue.add(i);
		}
		boolean chk = true;
		while(queue.size() !=1 ) {
			if(chk) {
				queue.poll();
				chk = false;
			}else {
				int tmp = queue.poll();
				queue.add(tmp);
				chk = true;
			}
			
		}
		System.out.println(queue.poll());
	}

}
