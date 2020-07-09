package ifForWhile;
import java.util.*;
public class bj14681 {
	static int x,y;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x >0) {
			if(y>0) {
				System.out.println("1");
			}else {
				System.out.println("4");
			}
		}else {
			if(y>0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
		}
		

	}

}
