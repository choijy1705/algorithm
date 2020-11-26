package bfsdfs;
import java.util.*;
public class bj11657 {
	static Scanner sc = new Scanner(System.in);
	static int n,m;
	public static void main(String[] args) {
		
		
		int num = 1;
		for(int i=0;i<30;i++) {
			System.out.print("[");
			for(int j=0;j<29;j++) {
				System.out.print(num + ",");
				num++;
			}
			System.out.print(num);
			num++;
			System.out.print("]");
			System.out.print(",");
			
			
		}
		
		

	}

}
