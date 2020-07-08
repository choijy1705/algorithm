package recursion;
import java.util.*;
public class bj10872 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		int result = 1;
		
		for(int i=1;i<=N;i++) {
			result *= i;
		}
		System.out.println(result);
	}
	
}
