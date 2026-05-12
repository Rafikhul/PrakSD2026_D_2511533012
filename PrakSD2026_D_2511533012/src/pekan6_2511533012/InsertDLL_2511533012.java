package pekan6_2511533012;

public class InsertDLL_2511533012 {
	static NodeDLL_2511533012 insertBegin_3012(NodeDLL_2511533012 head, int data) {
		NodeDLL_2511533012 new_node = new NodeDLL_2511533012(data);
		
		new_node.next_3012 = head;
		
		if (head != null) {
			head.prev_3012 = new_node;
		}
		return new_node;
	}
public static NodeDLL_2511533012 insertEnd_3012(NodeDLL_2511533012 head, int newData) {
	NodeDLL_2511533012 newNode = new NodeDLL_2511533012(newData);
	
	if (head == null) {
		head = newNode;
	} else {
		NodeDLL_2511533012 curr = head;
		while (curr.next_3012 != null) {
			curr = curr.next_3012;
		}
		curr.next_3012 = newNode;
		newNode.prev_3012 = curr;
	}
	return head;
}
public static NodeDLL_2511533012 insertAtPosition_3012(NodeDLL_2511533012 head, int pos, int new_data) {
	NodeDLL_2511533012 new_node = new NodeDLL_2511533012(new_data);
	if(pos == 1) {
		new_node.next_3012 = head;
		if (head != null) {
			head.prev_3012 = new_node;
		}
		head = new_node;
		return head;
	}
	NodeDLL_2511533012 curr = head;
	for (int i = 1; i < pos - 1 && curr != null; ++i) {
		curr = curr.next_3012;
	}
	if (curr == null) {
		System.out.println("Posisi tidak ada");
		return head;
	}
	new_node.prev_3012 = curr;
	new_node.next_3012 = curr.next_3012;
	curr.next_3012 = new_node;
	if (new_node.next_3012 != null) {
		new_node.next_3012.prev_3012 = new_node;
	}
	return head;
}

public static void printList_3012(NodeDLL_2511533012 head) {
	NodeDLL_2511533012 curr = head;
	while (curr != null) {
		System.out.print(curr.data_3012 + " <-> ");
		curr = curr.next_3012;
	}
	System.out.println();
}
public static void main(String[] args) {
	NodeDLL_2511533012 head = new NodeDLL_2511533012(2);
	head.next_3012 = new NodeDLL_2511533012(3);
	head.next_3012.prev_3012 = head;
	head.next_3012.next_3012 = new NodeDLL_2511533012(5);
	head.next_3012.next_3012.prev_3012 = head.next_3012;
	
	System.out.print("DLL Awal: ");
	printList_3012(head);
	
	head = insertBegin_3012(head, 1);
	System.out.print("simpul 1 ditambah di awal: ");
	printList_3012(head);
	
	System.out.print("simpul 6 ditambah di akhir: ");
	int data = 6;
	head = insertEnd_3012(head, data);
	printList_3012(head);
	
	System.out.print("tambah node 4 di posisi 4: ");
	int data2 = 4;
	int pos = 4;
	head = insertAtPosition_3012(head, pos, data2);
	printList_3012(head);
}
}
