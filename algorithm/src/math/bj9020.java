package math;
import java.util.*;
public class bj9020 {
	static Scanner sc = new Scanner(System.in);
	static int C, num;
	static HashMap<String, Integer> map ;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=0;tc<C;tc++) {
			num = sc.nextInt();
			
			boolean[] prime = new boolean[num+1];
			
			prime[1] = true;
			
			for(int i=2;i<=num;i++) {
				for(int j=2;i*j<=num;j++) {
					prime[i*j] = true;
				}
			}
			map = new HashMap<>();
			String s  = "";
			gold(prime, num,s,0,2);
			
			List<String> keySetList = new ArrayList<>(map.keySet());
			Collections.sort(keySetList, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));
			
			//System.out.println(keySetList.get(0));
		}

	}
	private static void gold(boolean[] prime, int number, String s,int cnt, int b) {
		
		if(number < 0 || cnt >2) {
			return;
		}
		
		if(number == 0) {
			String[] sd = s.split(" ");
			int n = Integer.parseInt(sd[1]) - Integer.parseInt(sd[0]);
			
			
			map.put(s, n);
			return;
		}
		
		for(int i=b;i<num;i++) {
			if(!prime[i]) {
				String sb = s +" "+ i;
				System.out.println(sb);
				gold(prime, number - i,sb,cnt+1,i);
			}
		}
	}

}
