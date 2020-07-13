package minmax;
import java.util.*;
public class bj2577 {
	static Scanner sc = new Scanner(System.in);
	static int A,B,C;
	public static void main(String[] args) {
		int[] cnt = new int[10];
		Arrays.fill(cnt, 0);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		int num = A*B*C;
		
		String number = String.valueOf(num);
		
			for(int i=0;i<number.length();i++) {
				
				switch(number.charAt(i)) {
				
					case '0':
						cnt[0]++;
						break;
					case '1':
						cnt[1]++;
						break;
					case '2':
						cnt[2]++;
						break;
					case '3':
						cnt[3]++;
						break;
					case '4':
						cnt[4]++;
						break;
					case '5':
						cnt[5]++;
						break;
					case '6':
						cnt[6]++;
						break;
					case '7':
						cnt[7]++;
						break;
					case '8':
						cnt[8]++;
						break;
					case '9':
						cnt[9]++;
						break;
				
			}
		}
			
			for(int i=0;i<10;i++) {
				System.out.println(cnt[i]);
			}
	}
}
