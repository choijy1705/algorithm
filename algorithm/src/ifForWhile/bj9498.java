package ifForWhile;
import java.util.*;

public class bj9498 {
	static Scanner sc = new Scanner(System.in);
	static int score;
	public static void main(String[] args) {
		score = sc.nextInt();
		
		if(score >=90) {
			System.out.println("A");
		}else if(score >=80) {
			System.out.println("B");
		}else if(score >=70) {
			System.out.println("C");
		}else if(score >=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
