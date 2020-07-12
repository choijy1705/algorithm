package ifForWhile;
import java.util.*;
public class bj11022 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + tc + ": " + a + " + " + b + " = " + (a+b));
		}
	}

}

