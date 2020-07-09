package print;
import java.util.*;
public class bj2588 {
	static Scanner sc = new Scanner(System.in);
	static int a;
	static String b;
	public static void main(String[] args) {
		a = sc.nextInt();
		b = sc.next();
		
		String[] x = b.split("");
		
		for(int i=x.length-1;i>=0;i--) {
			System.out.println(Integer.parseInt(x[i]) * a);
		}
		
		System.out.println(a *Integer.parseInt(b));
		
		

	}

}
