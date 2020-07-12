package ifForWhile;
import java.util.*;
public class bj2439 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			String s = "*";
			String repeated = new String(new char[i]).replace("\0", s);
			String space = new String(new char[N-i]).replace("\0", " ");
			System.out.print(space);
			System.out.print(repeated);
			System.out.println();
		
		}
	}

}
