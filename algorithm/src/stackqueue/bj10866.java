package stackqueue;

import java.util.*;
public class bj10866 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		for(int i=0;i<N;i++) {
			String key = sc.next();
			
			if(key.equals("push_front")) {
				dq.addFirst(sc.nextInt());
			}else if(key.equals("push_back")) {
				dq.addLast(sc.nextInt());
			}else if(key.equals("pop_front")) {
				if(dq.size()>0) {
					System.out.println(dq.pollFirst());
				}else {
					System.out.println(-1);
				}
			}else if(key.equals("pop_back")) {
				if(dq.size()>0) {
					System.out.println(dq.pollLast());
				}else {
					System.out.println(-1);
				}
			}else if(key.equals("size")) {
				System.out.println(dq.size());
			}else if(key.equals("empty")) {
				if(dq.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(key.equals("front")) {
				if(!dq.isEmpty()) {
					System.out.println(dq.peekFirst());
				}else {
					System.out.println(-1);
				}
			}else if(key.equals("back")) {
				if(!dq.isEmpty()) {
					System.out.println(dq.peekLast());
				}else {
					System.out.println(-1);
				}
			}
		}

	}

}
