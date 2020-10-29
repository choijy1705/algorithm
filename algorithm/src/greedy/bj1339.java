package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class bj1339 {
	static char[][] input;
	static HashSet<Character> set;
	static HashMap<Character, Integer> map;
	static ArrayList<Character> alphabet;
	static boolean[] selected;
	

	static int N, max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		max = Integer.MIN_VALUE;
		set = new HashSet<>();
		map = new HashMap<>();
		input = new char[N][];
		
		for(int i = 0 ; i < N ; ++i) {
			char[] line = br.readLine().toCharArray();
			// ���� ���ĺ��� ����Ѵ�. 
			input[i] = line;
			// �־��� ���ĺ��� set�� �ִ´�.(�ߺ�����) 
			for(char c : line) set.add(c);
		}
		
		alphabet = new ArrayList<>(set);
		
		selected = new boolean[10];
		permutation(0);
		
		System.out.println(max);
	}
	
	private static void permutation(int depth) {
		if(depth == alphabet.size()) {
			int temp = calc();
			max = temp > max ? temp : max;
			return;
		}
		
		for(int i = 0 ; i < 10 ; ++i) {
			if(!selected[i]) {
				selected[i] = true;
				// �ؽ������� ���� - ���ڸ� �����Ѵ�.
				map.put(alphabet.get(depth), i);
				permutation(depth + 1);
				selected[i] = false;
			}
		}
		
	}

	// ���ε� ���� - ���ڸ� �������� �հ� �����ϱ� 
	private static int calc() {
		int result = 0;
		
		for(int i = 0 ; i < N ; ++i) {
			int temp = 0;
			// String�� ���� �ڵ鸵�ϴ� ���� �δ��� ũ��(����, �Ľ�) 
			for(char c : input[i]) {
				temp *= 10;
				temp += map.get(c);
			}
			result += temp;
		}
		
		return result;
	}
}