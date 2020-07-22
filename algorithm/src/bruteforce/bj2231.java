package bruteforce;
import java.util.*;
public class bj2231 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		int k = 1;
		boolean chk = false;
		int sum =0;
		while(k<N) {
			String[] nu = String.valueOf(k).split("");
			sum = k;
			for(int i=0;i<nu.length;i++) {
				sum += Integer.parseInt(nu[i]);
			}
			
			if(sum == N) {
				chk = true;
				break;
			}
			k++;
		}
		if(chk) {
			System.out.println(k);
		}else {
			System.out.println(0);
		}
		

	}

}
