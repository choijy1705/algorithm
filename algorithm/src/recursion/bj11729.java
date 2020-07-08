package recursion;
import java.util.*;
public class bj11729 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt(); // ÀÌµ¿È½¼ö
		
		Stack<Integer> one = new Stack<>();
		Stack<Integer> two = new Stack<>();
		Stack<Integer> three = new Stack<>();
		
		
		for(int i=7;i>=1;i--) {
			one.push(i);
		}
		
		move(one, two,three, 0);

	}
	private static void move(Stack one, Stack two, Stack three, int cnt) {
		
		if(cnt == N) {
			return;
		}
		
		if(three.size() == 7) {
			return;
		}
		
		if(two.isEmpty() && three.isEmpty()) {
			three.push(one.pop());
			System.out.println("1 3");
			move(one, two, three, cnt +1);
		}else if(two.isEmpty()) {
			two.push(one.pop());
			System.out.println("1 2");
			move(one, two, three, cnt+1);
		}else if(three.isEmpty()) {
			three.push(one.pop());
			System.out.println("1 3");
			move(one,two,three, cnt+1);	
		}
		
		
	}

}
