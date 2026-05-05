package Pekan5_2511533012;

public class TambahSLL_2511533012 {
	public static NodeSLL_2511533012 insertAtFront_3012(NodeSLL_2511533012 head_3012, int value_3012) {
		NodeSLL_2511533012 new_node = new NodeSLL_2511533012(value_3012);
		new_node.next_3012 = head_3012;
		return new_node;
	}
	
	public static NodeSLL_2511533012 insertAtEnd_3012(NodeSLL_2511533012 head_3012, int value_3012) {
		NodeSLL_2511533012 newNode = new NodeSLL_2511533012(value_3012);
		if (head_3012 == null) {
			return newNode;
		}
		
		NodeSLL_2511533012 last = head_3012;
		while (last.next_3012 != null) {
			last = last.next_3012;
		}
		
		last.next_3012 = newNode;
		return head_3012;
	}
	
	static NodeSLL_2511533012 GetNode_3012(int data_3012) {
		return new NodeSLL_2511533012(data_3012);
	}
	
	static NodeSLL_2511533012 insertPos_3012(NodeSLL_2511533012 headNode_3012, int position_3012, int value_3012) {
		NodeSLL_2511533012 head_3012 = headNode_3012;
		if (position_3012 < 1)
			System.out.println("Invalid position");
		if (position_3012 == 1) {
			NodeSLL_2511533012 new_node = new NodeSLL_2511533012(value_3012);
			new_node.next_3012 = head_3012;
			return new_node;
		} else {
			while (position_3012-- != 0) {
				if (position_3012 == 1) {
					NodeSLL_2511533012 newNode = GetNode_3012(value_3012);
					newNode.next_3012 = headNode_3012.next_3012;
					headNode_3012.next_3012 = newNode;
					break;
				}
				headNode_3012 = headNode_3012.next_3012;
			}
			if (position_3012 != 1)
		System.out.println("Posisi di luar jangkauan");
			return head_3012;
		}
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
		NodeSLL_2511533012 head = new NodeSLL_2511533012(2);
		head.next_3012 = new NodeSLL_2511533012(3);
		head.next_3012.next_3012 = new NodeSLL_2511533012(5);
		head.next_3012.next_3012.next_3012 = new NodeSLL_2511533012(6);
		
		System.out.print("Senarai berantai awal : ");
		printList_3012(head);
		
		System.out.print("tambah 1 simpul di depan : ");
		int data_3012 = 1;
		head = insertAtFront_3012(head, data_3012);
		
		printList_3012(head);
		
		System.out.print("tambah 1 simpul di belakang : ");
		int data2_3012 = 7;
		head =  insertAtEnd_3012(head, data2_3012);
		
		printList_3012(head);
		
		System.out.print("tambah 1 simpul ke data 4 : ");
		int data3_3012 = 4;
		int pos_3012 = 4;
		head = insertPos_3012(head,pos_3012,data3_3012);
		
		printList_3012(head);
	}

}
