package ifForWhile;
import java.util.*;
public class bj2753 {
	static Scanner sc = new Scanner(System.in);
	static int year;
	public static void main(String[] args) {
		year = sc.nextInt();
		
		if(year %4 == 0) {
			if(year%100 != 0) {
				System.out.println("1");
			}else {
				if(year%400 == 0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}
		}else {
			System.out.println("0");
		}
	}

}
