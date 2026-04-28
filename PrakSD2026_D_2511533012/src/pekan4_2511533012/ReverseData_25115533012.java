package pekan4_2511533012;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_25115533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println("Sebelum reverse" + q);
		Stack<Integer> s = new Stack<Integer>();
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
		System.out.println("Sesudah reverse = " + q);
	}

}
