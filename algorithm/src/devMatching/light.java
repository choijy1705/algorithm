package devMatching;
import java.util.*;
public class light {

	public static void main(String[] args) {
		int[][] groups = {{1,5},{2,7},{4,8},{3,6}};
		
		Soution(10, groups);

	}

	private static void Soution(int n, int[][] groups) {
		
		Arrays.sort(groups, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}
			
		});
		
		for(int i=0;i<groups.length;i++) {
			
		}
		
		
	}

}
