package minmax;
import java.util.*;

public class bj3052 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		for(int i=0;i<10;i++) {
			int num = sc.nextInt();
			
			set.add(num%42);
		}
		
		System.out.println(set.size());

	}

}
