package math;
import java.util.*;
public class bj2292 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		int num = 1;
		int cnt = 1;
		int i =1;
		while(num < N) {
			
			num = num+6*i;
			i++;
			cnt++;
		}
		System.out.println(cnt);
	}

}
