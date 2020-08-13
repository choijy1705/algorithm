package stackqueue;
// 프린터 큐
import java.util.*;
public class bj1966 {
	static Scanner sc = new Scanner(System.in);
	static int tc, N, M;
	public static void main(String[] args) {
		tc =sc.nextInt();
		for(int c=0;c<tc;c++) {
			N = sc.nextInt();
			M = sc.nextInt();
			
			Queue<Integer> queue = new LinkedList<>();
			Queue<Integer> key = new LinkedList<>();
			int[] arr = new int[N];
			
			for(int i=0;i<N;i++) {
				int num = sc.nextInt();
				key.add(i);
				queue.add(num);
				arr[i] = num;
				
			}
			
			Arrays.sort(arr);
			int cnt = 0;
			
			for(int i=0;i<N;i++) {
				
				
				while(arr[arr.length-1-i] != queue.peek()) {
					queue.add(queue.poll());
					key.add(key.poll());
				}
				queue.poll();
				int index = key.poll();
				
				cnt++;
				if(index == M) {
					System.out.println(cnt);
					break;
				}
				
			}
			
		}

	}

}
