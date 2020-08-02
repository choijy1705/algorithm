package stackqueue;
import java.util.*;
import java.io.*;
public class bj18258 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		Queue<String> queue = new LinkedList<>();
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if(s.equals("push")) {
				queue.add(st.nextToken());
			}else if(s.equals("pop")) {
				if(queue.size()>0) {
					bw.write(queue.poll());
				}else {
					bw.write(-1);
				}
			}else if(s.equals("size")){
				bw.write(queue.size());
			}else if(s.equals("empty")) {
				if(queue.isEmpty()) {
					bw.write(1);
				}else {
					bw.write(0);
				}
			}else if(s.equals("front")) {
				if(queue.size()>0) {
					bw.write(queue.peek());
				}else {
					bw.write(-1);
				}
			}else if(s.equals("back")) {
				if(queue.size()>0) {
					Object[] a = queue.toArray();
					String str = String.valueOf(a[a.length-1]);
					bw.write(Integer.parseInt(str));
				}else {
					bw.write(-1);
				}
				
			}
		}
		br.close();
		bw.close();

	}

}
