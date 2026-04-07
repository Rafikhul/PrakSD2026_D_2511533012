package Pekan2_2511533012;
import java.util.ArrayList;

public class DaftarKata_2511533012 {
	private final ArrayList<String> data;
		
		public DaftarKata_2511533012() {
			this.data = new ArrayList<>();
		}
		
		public void tambah_2511533012(String elemen) {
			data.add(elemen);
		}
		
		public void tambahPada_2511533012(int index, String elemen) {
			data.add(index, elemen);
		}
		
		public void ubahElemen_2511533012(int index, String nilaiBaru) {
			data.set(index, nilaiBaru);
		}
		
		public String hapusElemen_2511533012(int index) {
			return data.remove(index);
		}
		
		public void iterasiCetak_2511533012() {
			for (int i = 0; i < data.size(); i++) {
				System.out.println(data.get(i) + " ");
			}
		}
		
		public String get(int index) {
			return data.get(index);
		}
		
		@Override
		public String toString() {
			return data.toString();
		}
}
