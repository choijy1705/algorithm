package test1;
import java.util.*;
public class bj10039 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0;i<5;i++) {
			int score = sc.nextInt();
			
			if(score <=40) {
				score = 40;
			}
			
			sum += score;
			
		}
		
		System.out.println(sum/5);
	}

}
