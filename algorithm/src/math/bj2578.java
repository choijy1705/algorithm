package math;
import java.util.*;
class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class bj2578 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] bingo = new int[5][5];
		HashMap<Integer, Point> map = new HashMap<>();
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				bingo[i][j] = sc.nextInt();
				map.put(bingo[i][j], new Point(i,j));
			}
		}
		int cnt = 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int num = sc.nextInt();
				cnt++;
				Point p = map.get(num);
				bingo[p.x][p.y] = 0;
				if(check(bingo)) {
					break;
				}
			}
		}
		
		System.out.println(cnt);

	}
	static boolean check(int[][] bingo) {
		int row = 0;
		int col = 0;
		int cross = 0;
		int cnt = 0;
		for(int i=0;i<5;i++) {
			row= 0;
			col = 0;
			for(int j=0;j<5;j++) {
				if(i == j) {
					cross += bingo[i][j];
				}
				row += bingo[i][j];
				col += bingo[j][i];
			}
			
			if(row == 0) {
				cnt++;
			}
			
			if(col == 0) {
				cnt++;
			}
		}
		if(cross == 0) {
			cnt++;
		}
		
		if(bingo[0][4] == 0 && bingo[1][3] == 0 && bingo[2][2] == 0 && bingo[3][1] == 0 && bingo[4][0]==0) {
			cnt++;
		}
		
		if(cnt >= 1) {
			return true;
		}else {
			return false;
		}
	}

}
