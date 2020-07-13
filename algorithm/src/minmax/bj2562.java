package minmax;
import java.util.*;
public class bj2562 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		for(int i=0;i<9;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
	}

}
