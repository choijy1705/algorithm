package string;
import java.util.*;
public class bj11720 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		String s = sc.next();
		
		String[] st = s.split("");
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum += Integer.parseInt(st[i]);
		}
		
		System.out.println(sum);
	}

}
