package greedy;
import java.util.*;
import java.io.*;

public class bj1541 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		String[] st = s.split("-");
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<st.length;i++) {
			
			st[i]=st[i].replace("+", " ");
			String[] n = st[i].split(" ");
			
			int num = 0;
			
			for(int j=0;j<n.length;j++) {
				num += Integer.parseInt(n[j]);
			}
			list.add(num);
			
		}
		
		int result = list.get(0);
		
		for(int i=1;i<list.size();i++) {
			result -= list.get(i);
		}
		System.out.println(result);
	}

}
