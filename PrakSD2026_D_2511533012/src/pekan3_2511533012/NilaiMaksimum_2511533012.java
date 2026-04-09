package pekan3_2511533012;

import java.util.Stack;

public class NilaiMaksimum_2511533012 {
	public static int max_3012(Stack<Integer> s) {
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue_3012 = s.pop();
		backup.push(maxValue_3012);
		while (!s.isEmpty()) {
			int next_3012 = s.pop();
			backup.push(next_3012);
			maxValue_3012 = Math.max(maxValue_3012, next_3012);
		}
		while (!backup.isEmpty()) {
			s.push(backup.pop());
		}
		return maxValue_3012;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(70);
		s.push(12);
		s.push(20);
		System.out.println("isi stack " + s);
		System.out.println("stack teratas " + s.peek());
		System.out.println("nilai maksimum " + max_3012(s));
	}

}
