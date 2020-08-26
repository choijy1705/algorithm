package bfsdfs;
import java.util.*;
class Point{
	int x;
	int y;
	int z;
	int dis;
	public Point(int x,int y,int dis,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.dis = dis;
	}
}
public class bj2206 {
	static int node [][];
	static int check[][];
	static int n,m,ans;
	static int dy[] = {1,-1,0,0};
	static int dx[] = {0,0,1,-1};
	public static void bfs(int a,int b) {
		Queue<Point> queue = new LinkedList();
		
		queue.offer(new Point(a,b,1,0));
			
		check[a][b] =0;
		while(!queue.isEmpty()) {
			Point q = queue.poll();
			
			if(q.x==n-1 && q.y==m-1) {
				ans = q.dis;
				break;
			}
			
			
			
			for(int i=0;i<4;i++) {
				int x =q.x + dx[i];
				int y = q.y + dy[i];
				
				if(x<0 || y<0|| x>=n ||y>=m)continue;

				if(check[x][y]<=q.z) continue;
				
				
				if(node[x][y]==0) {
					check[x][y] = q.z;
					queue.offer(new Point(x,y,q.dis+1,q.z));
				}
				else {
					if(q.z==0) {
						check[x][y]=q.z+1;
						queue.offer(new Point(x,y,q.dis+1,q.z+1));
					}
				}

			}
		}
	
	}
	


	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		n = sc.nextInt();
		 m = sc.nextInt();
		
		node = new int[n][m];
		check = new int[n][m];
		
		for(int i=0;i<n;i++) {
			String row = sc.next();
			for(int j=0;j<m;j++) {
				node[i][j] = row.charAt(j)-'0';
				Arrays.fill(check[i], Integer.MAX_VALUE);
			}
		}
		node[0][0]=node[n-1][m-1] =0;
		
		
		ans = Integer.MAX_VALUE;
		
		bfs(0,0);
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				System.out.print(check[i][j]+" ");
			}
			System.out.println();
		}
		if(ans == Integer.MAX_VALUE) {
			System.out.println("-1");
		}else {
			System.out.println(ans);
		}
	
		
	}
	
}