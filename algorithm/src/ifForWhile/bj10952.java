package ifForWhile;
import java.util.*;	
public class bj10952 {
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		int a=sc.nextInt();
		int b= sc.nextInt();
		
		while(a != 0 && b!=0) {
			System.out.println(a + b);
			a = sc.nextInt();
			b = sc.nextInt();
			
		}

	}

}
