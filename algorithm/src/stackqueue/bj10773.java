package stackqueue;
import java.util.*;
public class bj10773 {
	static Scanner sc = new Scanner(System.in);
	static int K;
	public static void main(String[] args) {
		K = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		int sum =0;
		for(int i=0;i<K;i++) {
			int a = sc.nextInt();
			
			if(a !=0) {
				sum += a;
				s.push(a);
			}else {
				sum -= s.pop();
			}
		}
		System.out.println(sum);
		
		

	}

}
