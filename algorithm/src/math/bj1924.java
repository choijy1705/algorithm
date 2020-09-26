package math;
import java.util.*;
public class bj1924 {
	static Scanner sc = new Scanner(System.in);
	static int mon, day;
	public static void main(String[] args) {
		mon = sc.nextInt();
		day = sc.nextInt();
		
		int[] day_list = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int date = 0;
		for(int i=0;i<mon-1;i++) {
			date += day_list[i];
		}
		
		date += day;
		
		date--;
		
		int idx = date%7;
		String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		System.out.println(week[idx]);

	}

}
