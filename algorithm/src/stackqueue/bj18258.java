package stackqueue;
import java.util.*;
import java.io.*;
public class bj18258 {
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		
		Queue<String> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			String st = br.readLine();
			String[] arr = st.split(" ");
			String s = arr[0];
			
			if(s.equals("push")) {
				queue.add(arr[1]);
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
		bw.write(sb.toString());
		br.close();
		bw.close();
	}

}
