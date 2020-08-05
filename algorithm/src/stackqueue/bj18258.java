package stackqueue;
import java.util.*;
import java.io.*;
public class bj18258 {
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		Queue<String> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if(s.equals("push")) {
				queue.add(st.nextToken());
			}else if(s.equals("pop")) {
				if(queue.size()>0) {
					sb.append(queue.poll() + "\n");
				}else {
					sb.append(-1+"\n");
				}
			}else if(s.equals("size")){
				sb.append(queue.size()+"\n");
			}else if(s.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if(s.equals("front")) {
				if(queue.size()>0) {
					sb.append(queue.peek()+"\n");
				}else {
					sb.append(-1+"\n");
				}
			}else if(s.equals("back")) {
				if(queue.size()>0) {
					Object[] a = queue.toArray();
					
					sb.append(a[a.length-1]+"\n");
				}else {
					sb.append(-1+"\n");
				}
				
			}
		}
		System.out.println(sb.toString());
		br.close();

	}

}
