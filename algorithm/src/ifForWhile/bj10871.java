package ifForWhile;
import java.util.*;
public class bj10871 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	public static void main(String[] args) {
		C = sc.nextInt();
		N = sc.nextInt();
		
		for(int i=0;i<C;i++) {
			int a = sc.nextInt();
			if(a < N) {
				System.out.print(a + " ");
			}
		}
	}

}
