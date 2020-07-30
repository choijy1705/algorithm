package stackqueue;
import java.io.*;
import java.util.*;
public class bj4949 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		while(!s.equals(".")) {
			
			
			Stack<Integer> stack = new Stack<>();
			
			boolean chk = false;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == '(') {
					stack.push(1);
				}else if(s.charAt(i) == ')') {
					try {
						int p = stack.peek();
						
						if(p == 1) {
							stack.pop();
						}else {
							chk = true;
							break;
						}
					}catch(Exception e){
						chk = true;
						break;
					}
					
					
				}else if(s.charAt(i) == '[') {
					stack.push(2);
				}else if(s.charAt(i) == ']') {
					try {
						int p = stack.peek();
						
						if(p == 2) {
							stack.pop();
						}else {
							chk = true;
							break;
						}
					}catch(Exception e){
						chk = true;
						break;
					}
				}
			}
			
			if(chk) {
				System.out.println("no");
			}else {
				if(stack.isEmpty()) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
			
			s = br.readLine();
		}

	}

}
