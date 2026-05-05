package Pekan5_2511533012;

public class PencarianSLL_2511533012 {
	static boolean searchKey_3012(NodeSLL_2511533012 head_3012, int key_3012) {
		NodeSLL_2511533012 curr = head_3012;
		while (curr != null) {
			if (curr.data_3012 == key_3012)
				return true;
			curr = curr.next_3012;
		}
		return false;
	}
	
	public static void travelsal_3012 (NodeSLL_2511533012 head_3012) {
		NodeSLL_2511533012 curr = head_3012;
		while (curr != null) {
			System.out.print(" " + curr.data_3012);
			curr = curr.next_3012;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeSLL_2511533012 head = new NodeSLL_2511533012(14);
		head.next_3012 = new NodeSLL_2511533012(21);
		head.next_3012.next_3012 = new NodeSLL_2511533012(13);
		head.next_3012.next_3012.next_3012 = new NodeSLL_2511533012(30);
		head.next_3012.next_3012.next_3012.next_3012 = new NodeSLL_2511533012(10);
		System.out.print("Penelusuran SLL : ");
		travelsal_3012(head);
		
		int key_3012 = 30;
		System.out.print("cari data " + key_3012 + " = ");
		if (searchKey_3012(head, key_3012))
			System.out.println("Ketemu");
		else
			System.out.println("Tidak ada");
	}

}
