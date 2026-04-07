package Pekan2_2511533012;
import java.util.ArrayList;
import java.util.Scanner;


public class MahasiswaDriver_2511533012 {
	
	public static void tampilkanMenu_2511533012() {
		System.out.println("\nMenu");
		System.out.println("1. Tambah Mahasiswa");
		System.out.println("2. Tampilkan Semua Mahasiswa");
		System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
		System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
		System.out.println("5. Keluar");
	}
	
	public static void tambahMahasiswa_2511533012(ArrayList<Mahasiswa_2511533012> list, Scanner sc) {
		System.out.println("Masukkan NIM: ");
		String nim = sc.nextLine();
		System.out.println("Masukkan Nama: ");
		String nama = sc.nextLine();
		System.out.println("Masukkan Prodi: ");
		String prodi = sc.nextLine();
		list.add(new Mahasiswa_2511533012(nim, nama, prodi));
		System.out.println("Mahasiswa berhasil ditambahkan");
		
	}
	
	public static void tampilkanSemuaMahasiswa_2511533012(ArrayList<Mahasiswa_2511533012> list) {
		if (list.isEmpty()) {
			System.out.println("Daftar mahasiswa kosong.");
		} else {
			System.out.println("Data Mahasiswa:");
			for (Mahasiswa_2511533012 mhs : list) {
				System.out.println(mhs);
			}
		}
	}
	
	public static void hapusMahasiswa_2511533012(ArrayList<Mahasiswa_2511533012> list, Scanner sc) {
		System.out.println("Masukkan NIM yang akan dihpus: ");
		String nimHapus = sc.nextLine();
		boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus));
		
		if(removed) {
			System.out.println("Data dengan NIM " + nimHapus + " Berhasil dihapus.");
		} else {
			System.out.println("NIM tidak ditemukan");
		}
	}
	
	public static void cariMahasiswa_2511533012(ArrayList<Mahasiswa_2511533012> list, Scanner sc) {
		System.out.println("Mahasiswa NIM yang dicari: ");
		String nimCari = sc.nextLine();
		boolean ditemukan = false;
		
		for (Mahasiswa_2511533012 mhs : list) {
			if (mhs.nim.equals(nimCari)) {
				System.out.println("Hasil Pencarian: " + mhs);
				ditemukan = true;
				break;
			}
		}
		
		if (!ditemukan) {
			System.out.println("NIM tidak ada.");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Mahasiswa_2511533012> mahasiswaList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			tampilkanMenu_2511533012();
			System.out.println("Pilih menu: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
				case 1:
					tambahMahasiswa_2511533012(mahasiswaList, scanner);
					break;
				case 2:
					tampilkanSemuaMahasiswa_2511533012(mahasiswaList);
					break;
				case 3:
					hapusMahasiswa_2511533012(mahasiswaList, scanner);
					break;
				case 4:
					cariMahasiswa_2511533012(mahasiswaList, scanner);
					break;
				case 5:
					System.out.println("Keluar dari program");
					break;
				default:
					System.out.println("Pilihan tidak valid");
					
			}
		} while (choice != 5);
		scanner.close();
	}
}
