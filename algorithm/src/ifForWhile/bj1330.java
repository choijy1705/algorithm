package ifForWhile;
import java.util.*;
public class bj1330 {
	static Scanner sc = new Scanner(System.in);
	static int a, b;
	public static void main(String[] args) {
		a = sc.nextInt();
		b = sc.nextInt();
		
		if( a < b) {
			System.out.println("<");
		}else if(a>b) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}

	}

}
