package math;
import java.util.*;
public class bj10250 {
	static Scanner sc = new Scanner(System.in);
	static int H,W,N;
	public static void main(String[] args) {
		int tc= sc.nextInt();
		
		for(int i=0;i<tc;i++) {
			int ho;
			
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt();
			
			if(N%H == 0) {
				ho = N/H;
			}else {
				ho = N/H+1;
			}
			
			int floor = N % H  == 0?H:N%H;
			
			System.out.println(floor*100+ho);
		}
		

	}

}
