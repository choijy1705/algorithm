package greedy;
import java.util.*;
import java.io.*;
public class bj1931 {
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int[][] meeting = new int[N][2];
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			String[] ar = s.split(" ");
			meeting[i][0] = Integer.parseInt(ar[0]);
			meeting[i][1] = Integer.parseInt(ar[1]);
			
		}
		
		Arrays.sort(meeting, new Comparator<int[]>() {

			@Override
			public int compare(int[] start, int[] end ) {
				
				if(start[1] == end[1]) {
					
					return Integer.compare(start[0], end[0]);
				}
				return Integer.compare(start[1], end[1]);
			}
		});
		int cnt = 0;
		int end = 0;
		for(int i= 0;i<N;i++) {
			
			if(meeting[i][0] >= end) {
				end = meeting[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		 
	}

}
