package test1;
import java.util.*;
public class bj5543 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] burger = new int[3];
		int[] coke = new int[2];
		
		for(int i=0;i<3;i++) {
			burger[i] = sc.nextInt();
		}
		
		for(int i=0;i<2;i++) {
			coke[i] = sc.nextInt();
		}
		
		Arrays.sort(burger);
		Arrays.sort(coke);
		
		
		
		
		int price = burger[0] + coke[0];
		System.out.println(price - 50);
	}

}
