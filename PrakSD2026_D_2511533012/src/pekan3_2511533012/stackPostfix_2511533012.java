package pekan3_2511533012;

import java.util.Stack;
import java.util.Scanner;

public class stackPostfix_2511533012 {
	public static int postfixEvaluate_3012(String expression_3012) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner input = new Scanner(expression_3012);
		while (input.hasNext()) {
			if (input.hasNextInt()) {
				s.push(input.nextInt());
			} else {
				String operator_3012 = input.next();
				int operator2_3012 = s.pop();
				int operator1_3012 = s.pop();
				if (operator_3012.equals("+")) {
					s.push (operator1_3012 + operator2_3012);
				} else if (operator_3012.equals("-")) {
					s.push(operator1_3012 - operator2_3012);
				} else if (operator_3012.equals("*")) {
					s.push(operator1_3012 * operator2_3012);
				} else {
					s.push(operator1_3012 / operator2_3012);
				}
			}
		}
		input.close();
		return s.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hasil postfix = " + postfixEvaluate_3012("5 2 4 * + 7 -"));
	}

}
