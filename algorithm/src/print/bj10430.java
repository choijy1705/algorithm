package print;
import java.util.*;

public class bj10430 {
	static Scanner sc = new Scanner(System.in);
	static int A,B,C;
	public static void main(String[] args) {
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}

}
