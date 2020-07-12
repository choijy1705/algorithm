package ifForWhile;
import java.util.*;

public class bj1110 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		int cnt = 0;
		
		int n = N;
		do{
			
			int a = n/10;
			int b = n - a*10;
			
			int s = (a+b) - ((a+b)/10) * 10; 
			n = b*10 + s;
			cnt++;
			
		}while(n!=N);
		System.out.println(cnt);
		
		
		
		
		
	}

}
