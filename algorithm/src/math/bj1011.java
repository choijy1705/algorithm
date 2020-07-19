package math;
import java.util.*;
public class bj1011 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static long x, y;

	public static void main(String[] args) {
		C = sc.nextInt();
		for(int tc=0;tc<C;tc++) {
			x = sc.nextLong();
			y = sc.nextLong();
			
			long distance = y-x;
			if(distance %2 == 0) {
				distance /= 2;
			}else {
				distance = (distance-1)/2;
			}
			
			
			int sum = 0;
			int i=1;
			while( sum < distance) {
				sum += i;
				i++;
			}
			
			System.out.println(i-1);
			
		}

	}
}
