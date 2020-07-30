package greedy;
import java.util.*;
public class bj1931 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		
		
		List<Meeting> meet = new ArrayList<>();
		int max = 0;
		int start=0;
		int finish=0;
		
		for(int i=0;i<N;i++) {
			start = sc.nextInt();
			finish = sc.nextInt();
			max = Math.max(max, finish);
			
			meet.add(new Meeting(start,finish));
			
		}
		int cnt=0;
		int time=0;
		while(time < max) {
			
			int min = max;
			boolean chk = false;
			for(int i=0;i<meet.size();i++) {
				if(meet.get(i).start >= time) {
					min = Math.min(min, meet.get(i).finish);
					chk = true;
				}
			}
			
			if(!chk) {
				break;
			}
			cnt++;
			time = min;

			
		}
		
		System.out.println(cnt);

	}

}

class Meeting{

	int start;
	int finish;
	
	Meeting( int start, int finish){

		this.start = start;
		this.finish = finish;
	}
}