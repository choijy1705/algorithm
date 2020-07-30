package stackqueue;
import java.util.*;
public class bj1874 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		boolean chk = false;
		int k= 1;
		for(int i=1;i<=n;i++) {
			int num = sc.nextInt();
			
			if(stack.contains(num)) {
				int p = stack.pop();
				if(p != num) {
					chk = true;
					break;
				}else {
					
				}
				sb.append("-\n");
			}else {
				stack.push(k);
				k++;
				sb.append("+\n");
			}
		}

	}

}
