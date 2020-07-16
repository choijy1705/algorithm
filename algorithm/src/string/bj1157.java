package string;
import java.util.*;

public class bj1157 {
	static Scanner sc = new Scanner(System.in);
	static String s;
	public static void main(String[] args) {
		s =sc.next();
		
		s = s.toUpperCase();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		Character[] ch = new Character[map.size()];
		int i=0;
		
		List<Character> keySetList = new ArrayList<>(map.keySet());
		
		Collections.sort(keySetList,(o1,o2) -> (map.get(o1).compareTo(map.get(o2))));
		
		
		
		if(map.size() >1 && (map.get(keySetList.get(keySetList.size()-1)) == map.get(keySetList.get(keySetList.size()-2)))) {
			System.out.println("?");
		}else {
			System.out.println(keySetList.get(keySetList.size()-1));
		}

	}

}
