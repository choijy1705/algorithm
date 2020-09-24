package priorityqueue;
// 가운데를 말해요
import java.util.*;
public class bj1655 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		
		N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			list.add(num);
			Collections.sort(list);
			
			if(list.size()%2 == 0) {
				System.out.println(list.get(list.size()/2 -1));
			}else {
				System.out.println(list.get(list.size()/2));
			}
		}
		
		
		
	}

}
