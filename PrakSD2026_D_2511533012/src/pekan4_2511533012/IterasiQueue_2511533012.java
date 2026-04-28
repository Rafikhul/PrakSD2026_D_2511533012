package pekan4_2511533012;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q_3012 = new LinkedList<>();
		
		q_3012.add("Pratikum");
		q_3012.add("Struktur");
		q_3012.add("Data");
		q_3012.add("Dan");
		q_3012.add("Algoritma");
		Iterator<String> iterator = q_3012.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}

}
