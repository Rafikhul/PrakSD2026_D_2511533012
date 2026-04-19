package pekan3_2511533012;

import java.util.Stack;
import java.util.Scanner;

public class Browser_2511533012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Website_2511533012> history = new Stack<>();

        int pilihan;

        do {
            System.out.println("\n=== Browser History NIM: 2511533012 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url = input.nextLine();

                    history.push(new Website_2511533012(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history.isEmpty()) {
                        Website_2511533012 w = history.pop();
                        System.out.println("Kembali dari: " + w.getJudul());
                    } else {
                        System.out.println("History kosong!");
                    }
                    break;

                case 3:
                    if (!history.isEmpty()) {
                        Website_2511533012 w = history.peek();
                        System.out.println("Halaman aktif: " + w.getJudul() + 
                        " (" + w.getUrl() + ")");
                    } else {
                        System.out.println("Tidak ada halaman!");
                    }
                    break;

                case 4:
                    System.out.println("Jumlah history: " + history.size());
                    System.out.println("Kosong? " + history.isEmpty());
                    break;
            }

        } while (pilihan != 5);
    }
}
