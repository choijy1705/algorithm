package math;
import java.util.*;
public class bj1193 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		int mother = 1;
		int son=1;
		int dir = 0; //1이 오른쪽 0이 아래쪽 0일때 분모가 커지고 분자가 작아짐
		int cnt = 1;
		
		while(cnt != N) {
			
				if(dir ==0 && son == 1 ) {
					dir = 1;
					mother++;

					cnt++;
					continue;
				}else if(dir ==1 && mother == 1) {
					dir = 0;
					son++;

					cnt++;
					continue;
				}
				
				
			
				if(dir ==1) {
					mother--;
					son++;
				}else {
					mother++;
					son--;
				}
				
				cnt++;
			
		}
		System.out.println(son + "/" + mother);
		
	
	}

}
