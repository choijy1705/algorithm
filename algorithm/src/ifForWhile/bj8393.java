package ifForWhile;
import java.util.*;
public class bj8393 {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
