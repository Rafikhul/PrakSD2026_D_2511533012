package pekan3_2511533012;

public class stackArray_2511533012 {
	static final int MAX_3012 = 1000;
	int top_3012;
	int a_3012[] = new int [MAX_3012];
	boolean isEmpty_3012() {
		return (top_3012 < 0);
	}
	stackArray_2511533012() {
		top_3012 = -1;
	}
	boolean push_3012(int x_3012) {
		if (top_3012 >= (MAX_3012 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a_3012[++top_3012] = x_3012;
			System.out.println(x_3012 + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_3012() {
		if (top_3012 <0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x_3012 = a_3012[top_3012--];
			return x_3012;
		}
	}
	int peek_3012() {
		if (top_3012 <0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x_3012 = a_3012[top_3012];
			return x_3012;
		}
	}
	void print_3012( ) {
		for (int i_3012 = top_3012; i_3012 > -1; i_3012--) {
			System.out.println(" " + a_3012[i_3012]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
