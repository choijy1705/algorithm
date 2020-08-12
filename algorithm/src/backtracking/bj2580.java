package backtracking;
//½ºµµÄí
import java.util.*;
import java.io.*;
public class bj2580 {
	static Scanner sc = new Scanner(System.in);
	static int[][] map = new int[9][9];
	public static void main(String[] args) throws IOException {
		List<point> list = new ArrayList<>();
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 0) {
					list.add(new point(i,j));
				}
			}
		}
		
		for(int i=0;i<list.size();i++) {
			int x = list.get(i).x;
			int y = list.get(i).y;
			
			map[x][y] = sdocu(x,y);
			if(map[x][y] == 0) {
				list.add(new point(x,y));
			}
		}
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(map[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	private static int sdocu(int x, int y) {
		int[] num = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<9;i++) {
			num[map[i][y]] = 0;
			num[map[x][i]] = 0;
		}
		
		int a = x/3 *3;
		int b = y/3 *3;
		
		for(int i=a;i<a+3;i++) {
			for(int j=b;j<b+3;j++) {
				num[map[i][j]] = 0;
			}
		}
		int result = 0;
		for(int i=0;i<9;i++) {
			if(num[i] != 0) {
				result = num[i];
			}
		}
		return result;
	}
	
}
class point{
	int x;
	int y;
	
	point(int x, int y){
		this.x = x;
		this.y = y;
	}
}