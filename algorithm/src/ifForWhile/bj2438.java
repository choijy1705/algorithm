package ifForWhile;
import java.util.*;
public class bj2438 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			String s = "*";
			String repeated = new String(new char[i]).replace("\0", s);
			
			System.out.println(repeated);
		
		}
	}

}
