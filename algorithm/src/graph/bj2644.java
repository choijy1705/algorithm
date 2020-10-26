package graph;
import java.util.*;
public class bj2644 {
 
    static int[][] map;
    static int n, p1, p2, par_ch;
    static int[] check;
    static Scanner sc = new Scanner(System.in);
    static void BFS(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(start);
        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i = 1; i < map.length; i++) {
                if (map[x][i] == 1 && check[i] == 0) {
                    q.offer(i);
                    check[i] = check[x] + 1; // check¿¡ ÀúÀå.
                }
            }
        }
        System.out.println(check[p2] == 0 ? -1 : check[p2]);
    }
 
    public static void main(String[] args){
 
        
        n = sc.nextInt();

        p1 = sc.nextInt();
        p2 = sc.nextInt();
        par_ch = sc.nextInt();
        map = new int[n + 1][n + 1]; 
 
        for (int i = 0; i < par_ch; i++) {
   
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = map[b][a] = 1;
        }
        check = new int[n + 1];
 
        BFS(p1);
 
    }
 
}