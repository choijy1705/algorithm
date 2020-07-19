package math;
import java.util.*;
public class bj2581 {
	static Scanner sc = new Scanner(System.in);
	static int a,b;
	
	
			
	public static void main(String[] args) {
		a = sc.nextInt();
		b= sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		for(int i=a;i<=b;i++) {
			boolean chk = true;
			if(i==1) {
				continue;
			}
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					chk = false;
					break;
				}
			}
			if(chk) {
				list.add(i);
				sum += i;
			}
		}
		
		if(list.size()>0) {
			System.out.println(sum);
			System.out.println(list.get(0));
		}else {
			System.out.println(-1);
		}
		

	}

}
