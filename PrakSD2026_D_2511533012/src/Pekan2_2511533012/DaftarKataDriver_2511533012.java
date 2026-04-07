package Pekan2_2511533012;

public class DaftarKataDriver_2511533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaftarKata_2511533012 al = new DaftarKata_2511533012();
		
		al.tambah_2511533012("Kami");
		al.tambah_2511533012("Informatika");
		
		al.tambahPada_2511533012(1, "Mahasiswa");
		
		System.out.println("Awal	: " + al);
		
		al.ubahElemen_2511533012(1, "Departmen");
		System.out.println("Setelah Ubah: " + al);
		
		String terhapus = al.hapusElemen_2511533012(0);
		System.out.println("Terhapus	: " + terhapus);
		System.out.println("Setelah Hapus : " + al);
		
		System.out.println("Iterasi");
		al.iterasiCetak_2511533012();
		System.out.println();
		
	}

}
