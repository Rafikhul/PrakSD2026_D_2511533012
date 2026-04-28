package pekan4_2511533012;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_25115533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q_3012 = new LinkedList<Integer>();
		q_3012.add(1);
		q_3012.add(2);
		q_3012.add(3);
		System.out.println("Sebelum reverse" + q_3012);
		Stack<Integer> s_3012 = new Stack<Integer>();
		while (!q_3012.isEmpty()) {
			s_3012.push(q_3012.remove());
		}
		while (!s_3012.isEmpty()) {
			q_3012.add(s_3012.pop());
		}
		System.out.println("Sesudah reverse = " + q_3012);
	}

}
