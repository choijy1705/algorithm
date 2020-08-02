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
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			
			while(true) {
				if(stack.size()>0 && stack.peek() == num) {
					System.out.println(num + " : " + 1);
					stack.pop();
					sb.append("-" + "\n");
					break;
				}else if(k<=num) {
					System.out.println(num + " : " + 2);
					stack.push(k);
					sb.append("+"+"\n");
					k++;
				}else {
					System.out.println(num + " : " + 3);
					chk =true;
					break;
				}
			}
			
			if(chk) {
				break;
			}
		}
		
		if(chk) {
			System.out.println("NO");
		}else {
			System.out.println(sb.toString());
		}

	}

}
