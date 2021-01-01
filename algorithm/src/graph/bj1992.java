package graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj1992 {
	static int n,m;
	static int[] parent;
	static PriorityQueue<edge> pq = new PriorityQueue<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		parent = new int[n+1];
			
	
	}
	
	
	
}
class edge implements Comparable<edge>{
	int s;
	int e;
	int v;
	@Override
	public int compareTo(edge o) {
		// TODO Auto-generated method stub
		return o.v >= this.v ? -1 : 1;
	}
}
