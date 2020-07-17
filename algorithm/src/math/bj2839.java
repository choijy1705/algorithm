package math;
import java.util.*;
public class bj2839 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		
			int cnt=0;
			int num = N;
			int five = N/5;
			int three=0;
			while(true) {
				num = N;
				
				num -= five*5;
				
				if(num%3 == 0) {
					three = num/3;
					break;
				}else {
					five--;
				}
				
				if(five == -1) {
					break;
				}
			}
			if(five<0) {
				System.out.println(-1);
			}else {
				System.out.println(five+three);
			}
			
		

	}

}
