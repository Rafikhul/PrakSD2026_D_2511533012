package Pekan5_2511533012;
import java.util.Scanner;

public class RumahSakit_2511533012 {
    static Pasien_2511533012 head_3012 = null;
    static int counter_3012 = 0;

    public static void daftarkanPasien_3012(String nama_3012, String keluhan_3012) {
        counter_3012++;

        Pasien_2511533012 pasienBaru_3012 =
                new Pasien_2511533012(nama_3012, keluhan_3012, counter_3012);

        if (head_3012 == null) {
            head_3012 = pasienBaru_3012;
        } else {
            Pasien_2511533012 temp_3012 = head_3012;

            while (temp_3012.getNext_3012() != null) {
                temp_3012 = temp_3012.getNext_3012();
            }

            temp_3012.setNext_3012(pasienBaru_3012);
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: "
                + pasienBaru_3012.getNomorAntrian_3012());
    }

    public static void panggilPasien_3012() {
        if (head_3012 == null) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Pasien dipanggil:");
            System.out.println("Nomor Antrian : " + head_3012.getNomorAntrian_3012());
            System.out.println("Nama Pasien   : " + head_3012.getNamaPasien_3012());
            System.out.println("Keluhan       : " + head_3012.getPenyakit_3012());

            head_3012 = head_3012.getNext_3012();
        }
    }

    public static void tampilkanAntrian_3012() {
        if (head_3012 == null) {
            System.out.println("Antrian masih kosong!");
        } else {
            Pasien_2511533012 temp_3012 = head_3012;
            int posisi_3012 = 1;

            System.out.println("=== DAFTAR ANTRIAN PASIEN ===");

            while (temp_3012 != null) {
                System.out.println("Posisi Antrian : " + posisi_3012);
                System.out.println("Nomor Antrian  : " + temp_3012.getNomorAntrian_3012());
                System.out.println("Nama Pasien    : " + temp_3012.getNamaPasien_3012());
                System.out.println("Keluhan        : " + temp_3012.getPenyakit_3012());
                System.out.println("-----------------------------");

                temp_3012 = temp_3012.getNext_3012();
                posisi_3012++;
            }
        }
    }

    public static void cariPasien_3012(String namaCari_3012) {
        if (head_3012 == null) {
            System.out.println("Antrian kosong!");
        } else {
            Pasien_2511533012 temp_3012 = head_3012;
            boolean ditemukan_3012 = false;

            while (temp_3012 != null) {
                if (temp_3012.getNamaPasien_3012()
                        .equalsIgnoreCase(namaCari_3012)) {

                    System.out.println("Pasien ditemukan!");
                    System.out.println("Nomor Antrian : "
                            + temp_3012.getNomorAntrian_3012());
                    System.out.println("Nama Pasien   : "
                            + temp_3012.getNamaPasien_3012());
                    System.out.println("Keluhan       : "
                            + temp_3012.getPenyakit_3012());

                    ditemukan_3012 = true;
                    break;
                }

                temp_3012 = temp_3012.getNext_3012();
            }

            if (!ditemukan_3012) {
                System.out.println("Pasien tidak ditemukan!");
            }
        }
    }

    public static void cekStatusAntrian_3012() {
        if (head_3012 == null) {
            System.out.println("Antrian kosong!");
        } else {
            Pasien_2511533012 temp_3012 = head_3012;
            int jumlah_3012 = 0;

            while (temp_3012 != null) {
                jumlah_3012++;
                temp_3012 = temp_3012.getNext_3012();
            }

            System.out.println("Jumlah Pasien Dalam Antrian : " + jumlah_3012);
            System.out.println("Pasien Terdepan : "
                    + head_3012.getNamaPasien_3012());
        }
    }

    public static void main(String[] args) {
        Scanner input_3012 = new Scanner(System.in);
        int pilihan_3012;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533012 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan : ");

            pilihan_3012 = input_3012.nextInt();
            input_3012.nextLine();

            switch (pilihan_3012) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_3012 = input_3012.nextLine();

                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_3012 = input_3012.nextLine();

                    daftarkanPasien_3012(nama_3012, keluhan_3012);
                    break;

                case 2:
                    panggilPasien_3012();
                    break;

                case 3:
                    tampilkanAntrian_3012();
                    break;

                case 4:
                    System.out.print("Masukkan Nama Pasien yang Dicari : ");
                    String cari_3012 = input_3012.nextLine();

                    cariPasien_3012(cari_3012);
                    break;

                case 5:
                    cekStatusAntrian_3012();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_3012 != 6);
    }
}
