package tree;
// 트리의 지름 찾기
import java.util.*;
class Tree{
	
	class Treenode{
		int parent;
		List<Integer> child = new ArrayList<>();
		List<Integer> length = new ArrayList<>();
		Treenode(int parent){
			this.parent = parent;
		}
		
	}
	
	int nodeNum;
	Treenode[] treenode;
	
	Tree(int nodeNum){
		this.nodeNum = nodeNum;
		treenode = new Treenode[nodeNum+1];
		for(int i=0;i<nodeNum;i++) {
			treenode[i] = new Treenode(i);
		}
	}
	
	void addChild(int parent, int child, int length) {
		treenode[parent].child.add(child);
		treenode[parent].length.add(length);
	}
}
public class bj1167 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	
	public static void main(String[] args) {
		N = sc.nextInt();
		
		Tree tree = new Tree(N+1);
		
		for(int i=0;i<N;i++) {
			int parent = sc.nextInt();
			int child = sc.nextInt();
			while(child != -1) {
				int length = sc.nextInt();
				tree.addChild(parent,child,length);
				child = sc.nextInt();
			}
		}
		int max = 0;
		
	
		
		
	}
	

}
