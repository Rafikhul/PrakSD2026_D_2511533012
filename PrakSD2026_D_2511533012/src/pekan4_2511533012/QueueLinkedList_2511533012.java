package pekan4_2511533012;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q_3012 = new LinkedList<>();
		
		for (int i = 0; i < 6; i++)
			q_3012.add(i);
		
		System.out.println("Elemen Antrian " + q_3012);
		
		int hapus = q_3012.remove();
		System.out.println("Hapus elemen = " + hapus);
		System.out.println(q_3012);
		
		int depan = q_3012.peek();
		System.out.println("Kepala Antrian = " + depan);
		
		int banyak = q_3012.size();
		System.out.println("Size Antrian = " + banyak);
	}

}
