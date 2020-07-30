package stackqueue;
import java.util.*;
public class bj10828 {
	static Scanner sc= new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<N;i++) {
			
			String s = sc.next();
			
			if(s.equals("push")) {
				stack.push(sc.nextInt());
			}else if(s.equals("top")) {
				try {
					System.out.println(stack.peek());
				}catch(Exception e) {
					System.out.println(-1);
					
				}
			}else if(s.equals("size")) {
				System.out.println(stack.size());
			}else if(s.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(s.equals("pop")) {
				try {
					System.out.println(stack.pop());
				}catch(Exception e) {
					System.out.println(-1);
				}
				
			}
		}
	}

}
