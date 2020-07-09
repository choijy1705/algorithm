package ifForWhile;
import java.util.*;
public class bj2884 {
	static Scanner sc = new Scanner(System.in);
	static int hour, min;
	public static void main(String[] args) {
		hour = sc.nextInt();
		min = sc.nextInt();
		
		hour = min-45 >=0? hour: (hour-1);
		
		hour = hour >=0? hour:24+hour;
		min = min -45 >= 0 ? min-45:60+(min-45);
		
		
		System.out.println(hour + " " + min);
	}

}
