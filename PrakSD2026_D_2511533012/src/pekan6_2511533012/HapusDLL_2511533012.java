package pekan6_2511533012;

public class HapusDLL_2511533012 {
	public static NodeDLL_2511533012 delHead_3012(NodeDLL_2511533012 head) {
		if (head == null) {
			return null;
		}
		NodeDLL_2511533012 temp = head;
		head = head.next_3012;
		if (head != null) {
			head.prev_3012 = null;
		}
		return head;
	}
	
	public static NodeDLL_2511533012 delLast_3012(NodeDLL_2511533012 head) {
		if (head ==  null) {
			return null;
		}
		if (head.next_3012 ==  null) {
			return null;
		}
		NodeDLL_2511533012 curr = head;
		while (curr.next_3012 != null) {
			curr = curr.next_3012;
		}
		
		if (curr.prev_3012 != null) {
			curr.prev_3012.next_3012 = null;
		}
		return head;
	}
	
	public static NodeDLL_2511533012 delPos_3012(NodeDLL_2511533012 head, int pos) {
		if (head == null) {
			return head;
		}
		NodeDLL_2511533012 curr = head;
		
		for (int i = 1; curr != null && i < pos; ++i) {
			curr = curr.next_3012;
		}
		if (curr == null) {
			return head;
		}
		if (curr.prev_3012 != null) {
			curr.prev_3012.next_3012 = curr.next_3012;
		}
		if (curr.next_3012 != null) {
			curr.next_3012.prev_3012 = curr.prev_3012;
		}
		if (head == curr) {
			head = curr.next_3012;
		}
		return head;
	}
	
	public static void printList_3012(NodeDLL_2511533012 head) {
		NodeDLL_2511533012 curr = head;
		while (curr != null) {
			System.out.print(curr.data_3012 + " ");
			curr = curr.next_3012;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDLL_2511533012 head = new NodeDLL_2511533012(1);
		head.next_3012 = new NodeDLL_2511533012(2);
		head.next_3012.prev_3012 = head;
		head.next_3012.next_3012 = new NodeDLL_2511533012(3);
		head.next_3012.next_3012.prev_3012 = head.next_3012;
		head.next_3012.next_3012.next_3012 = new NodeDLL_2511533012(4);
		head.next_3012.next_3012.next_3012.prev_3012 = head.next_3012.next_3012;
		head.next_3012.next_3012.next_3012.next_3012 = new NodeDLL_2511533012(5);
		head.next_3012.next_3012.next_3012.next_3012.prev_3012 = head.next_3012.next_3012.next_3012;
		
		System.out.print("DLL Awal: ");
		printList_3012(head);
		
		System.out.print("Setelah head dihapus: ");
		head = delHead_3012(head);
		printList_3012(head);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head = delLast_3012(head);
		printList_3012(head);
		
		System.out.print("Menghapus node ke 2: ");
		head = delPos_3012(head, 2);
		
		printList_3012(head);
	}

}
