package stackqueue;

import java.util.*;

public class bj1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ~n���� ���� ���� ��
		int k = sc.nextInt(); // testCase

		int count = 0;

		Deque<Integer> q = new ArrayDeque<>();

		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		for (int i = 0; i < k; i++) {
			int num = sc.nextInt();

			while (true) {
				int index = 0; // ����� �ε������� ã��
				Iterator it = q.iterator();
				while (it.hasNext()) {
					if ((int)it.next() == num)
						break;
					index++;
				}

				if (index == 0) {
					q.pollFirst();
					break;
				}

				else if (index > q.size() / 2) {
					q.addFirst(q.removeLast());
					count++;
				}

				else {
					q.addLast(q.removeFirst());
					count++;
				}

			}

		}

		System.out.println(count);

	}

}
