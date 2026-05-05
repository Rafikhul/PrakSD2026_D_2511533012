package Pekan5_2511533012;

public class HapusSLL_2511533012 {
	public static NodeSLL_2511533012 deleteHead_3012(NodeSLL_2511533012 head_3012) {
		if (head_3012 == null)
			return null;
		
		head_3012 = head_3012.next_3012;
		
		return head_3012;
	}
	
	public static NodeSLL_2511533012 removeLastNode_3012(NodeSLL_2511533012 head_3012) {
		if (head_3012 == null) {
			return null;
		}
		if (head_3012.next_3012 == null) {
			return null;
		}
		NodeSLL_2511533012 secondLast_3012 = head_3012;
		while (secondLast_3012.next_3012.next_3012 != null) {
			secondLast_3012 = secondLast_3012.next_3012;
		}
		secondLast_3012.next_3012 = null;
		return head_3012;
	}
	
	public static NodeSLL_2511533012 deleteNode_3012(NodeSLL_2511533012 head_3012, int position_3012) {
		NodeSLL_2511533012 temp = head_3012;
		NodeSLL_2511533012 prev = null;
		
		if (temp == null)
			return head_3012;
		if (position_3012 == 1) {
			head_3012 = temp.next_3012;
			return head_3012;
		}
		
		for (int i_3012 = 1; temp != null && i_3012 < position_3012; i_3012++) {
			prev = temp;
			temp = temp.next_3012;
		}
		if (temp != null) {
			prev.next_3012 = temp.next_3012;
		} else {
			System.out.println("data tidak ada");
		}
		return head_3012;
	}
	public static void printList_3012(NodeSLL_2511533012 head_3012) {
		NodeSLL_2511533012 curr = head_3012;
		while (curr.next_3012 != null) {
			System.out.print(curr.data_3012 + "--->");
			curr = curr.next_3012;
		}
		if (curr.next_3012 == null) {
			System.out.print(curr.data_3012);
		System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeSLL_2511533012 head = new NodeSLL_2511533012(1);
		head.next_3012 = new NodeSLL_2511533012(2);
		head.next_3012.next_3012 = new NodeSLL_2511533012(3);
		head.next_3012.next_3012.next_3012 = new NodeSLL_2511533012(4);
		head.next_3012.next_3012.next_3012.next_3012 = new NodeSLL_2511533012(5);
		head.next_3012.next_3012.next_3012.next_3012.next_3012 = new NodeSLL_2511533012(6);
		
		System.out.println("list awal : ");
		printList_3012(head);
		
		head = deleteHead_3012(head);
		System.out.println("List setelah head di hapus : ");
		printList_3012(head);
		
		head = removeLastNode_3012(head);
		System.out.println("List setelah simpul terakhir di hapus : ");
		printList_3012(head);
		
		int position_3012 = 2;
		head = deleteNode_3012(head, position_3012);
		
		System.out.println("List setelah posisi 2 dihapus : ");
		printList_3012(head);
	}

}
