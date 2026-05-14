package pekan6_2511533012;

public class PenelusuranDLL_2511533012 {
	static void forwardTraversal_3012(NodeDLL_2511533012 head) {
		NodeDLL_2511533012 curr = head;
		
		while (curr != null) {
			System.out.print(curr.data_3012 + " <-> ");
			curr = curr.next_3012;
		}
		System.out.println();
	}
	
	static void backwardTraversal_3012(NodeDLL_2511533012 tail) {
		NodeDLL_2511533012 curr = tail;
		
		while (curr != null) {
			System.out.print(curr.data_3012 + " <-> ");
			curr= curr.prev_3012;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDLL_2511533012 head = new NodeDLL_2511533012(1);
		NodeDLL_2511533012 second = new NodeDLL_2511533012(2);
		NodeDLL_2511533012 third = new NodeDLL_2511533012(3);
		
		head.next_3012 = second;
		second.prev_3012 = head;
		second.next_3012 = third;
		third.prev_3012 = second;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_3012(head);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_3012(third);
	}

}
