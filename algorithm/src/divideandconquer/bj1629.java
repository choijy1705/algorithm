package divideandconquer;
import java.util.Scanner;

public class bj1629 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int mod = sc.nextInt();
		
		long ans = 1; 
		long multiply = A%mod;
		
		while(B>0){
			if(B%2==1){
				ans *= multiply;
				ans%=mod;
			}
			multiply = ((multiply%mod)*(multiply%mod))%mod;
			B/=2;
		}
		System.out.print(ans);
	}
}