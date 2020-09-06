package divideandconquer;
import java.util.*;
public class bj1629 {
	static int a, b, c;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println((int)(Math.pow(a, b)%c));
	}

}
