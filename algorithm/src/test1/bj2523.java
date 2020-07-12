package test1;
import java.util.*;
public class bj2523 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		String s = "*";
		for(int i=1;i<=N;i++) {
			String repeat = new String(new char[i]).replace("\0", s);
			System.out.println(repeat);
		}
		for(int i=N-1;i>0;i--) {
			String repeat = new String(new char[i]).replace("\0", s);
			System.out.println(repeat);
		}
	}

}
