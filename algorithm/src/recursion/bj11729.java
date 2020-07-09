package recursion;
import java.util.*;
public class bj11729 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static StringBuilder sb = new StringBuilder();
	static int cnt=0;
	public static void main(String[] args) {
		N = sc.nextInt(); // ÀÌµ¿È½¼ö
		hanoi(N, 1, 2, 3);
		System.out.println(cnt);
		System.out.println(sb);
	
	}
	private static void hanoi(int n, int from, int by, int to) {
		cnt++;
		if(n ==1) {
			sb.append(from + " " + to + "\n");
		}else {
			hanoi(n-1, from, to, by);
			sb.append(from + " " + to + "\n");
			hanoi(n-1, by, from, to);
		}
		
	}
}
