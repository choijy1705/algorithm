package unionfind;
import java.util.*;
public class bj4195 {
	static Scanner sc = new Scanner(System.in);
	static int tc, F;
	public static void main(String[] args) {
		tc = sc.nextInt();
		
		for(int i=0;i<tc;i++) {
			F = sc.nextInt();
			
			Map<String,String> map = new HashMap<>();
			Map<String,Integer> cnt = new HashMap<>();
			
			for(int j=0;j<F;j++) {
				String a= sc.next();
				String b = sc.next();
				
				if(!map.containsKey(a) && !map.containsKey(b)) {
					map.put(a,a);
					map.put(b, a);
					cnt.put(a, cnt.getOrDefault(a, 1)+1);
					System.out.println(cnt.get(map.get(a)));
				}else {
					map.put(b,map.get(a));
					cnt.put(map.get(b), cnt.getOrDefault(map.get(b),1)+1);
					System.out.println(cnt.get(map.get(b)));
				}
			}
		}

	}

}
