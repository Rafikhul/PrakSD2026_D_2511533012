package pekan6_2511533012;
import java.util.Scanner;

public class Musik_2511533012 {

 Lagu_2511533012 head_3012;
 Lagu_2511533012 tail_3012;

 public void tambahLagu_3012(String judul_3012, String penyanyi_3012) {

     Lagu_2511533012 laguBaru_3012 = new Lagu_2511533012(judul_3012, penyanyi_3012);

     if (head_3012 == null) {

         head_3012 = laguBaru_3012;
         tail_3012 = laguBaru_3012;

     } else {

         tail_3012.next_3012 = laguBaru_3012;
         laguBaru_3012.prev_3012 = tail_3012;
         tail_3012 = laguBaru_3012;
     }

     System.out.println("Lagu berhasil ditambahkan!");
 }

 public void hapusLaguAwal_3012() {

     if (head_3012 == null) {

         System.out.println("Playlist kosong!");
         return;
     }

     System.out.println("Lagu " + head_3012.getJudul_3012() + " berhasil dihapus.");

     if (head_3012 == tail_3012) {

         head_3012 = null;
         tail_3012 = null;

     } else {

         head_3012 = head_3012.next_3012;
         head_3012.prev_3012 = null;
     }
 }

 public void tampilMaju_3012() {

     if (head_3012 == null) {

         System.out.println("Playlist kosong!");
         return;
     }

     Lagu_2511533012 bantu_3012 = head_3012;

     System.out.println("\n=== Playlist Maju ===");

     while (bantu_3012 != null) {

         System.out.println(bantu_3012.getJudul_3012() + " - " + bantu_3012.getPenyanyi_3012()
         );

         bantu_3012 = bantu_3012.next_3012;
     }
 }

 public void tampilMundur_3012() {

     if (tail_3012 == null) {

         System.out.println("Playlist kosong!");
         return;
     }

     Lagu_2511533012 bantu_3012 = tail_3012;

     System.out.println("\n=== Playlist Mundur ===");

     while (bantu_3012 != null) {

         System.out.println(
                 bantu_3012.getJudul_3012() + " - " + bantu_3012.getPenyanyi_3012()
         );

         bantu_3012 = bantu_3012.prev_3012;
     }
 }

 public void cariLagu_3012(String judulCari_3012) {

     if (head_3012 == null) {

         System.out.println("Playlist kosong!");
         return;
     }

     Lagu_2511533012 bantu_3012 = head_3012;

     boolean ketemu_3012 = false;

     while (bantu_3012 != null) {

         if (bantu_3012.getJudul_3012().equalsIgnoreCase(judulCari_3012)) {

             System.out.println("\nLagu ditemukan!");
             System.out.println("Judul : " + bantu_3012.getJudul_3012());

             System.out.println("Penyanyi : " + bantu_3012.getPenyanyi_3012());

             ketemu_3012 = true;

             break;
         }

         bantu_3012 = bantu_3012.next_3012;
     }

     if (!ketemu_3012) {

         System.out.println("Lagu tidak ditemukan!");
     }
 }

 // Main Program
 public static void main(String[] args) {

     Scanner input_3012 = new Scanner(System.in);

     Musik_2511533012 musik_3012 = new Musik_2511533012();

     int pilihan_3012;

     do {

         System.out.println("\n=== Playlist Musik NIM: 2511533012 ===");

         System.out.println("1. Tambah Lagu");
         System.out.println("2. Hapus Lagu Pertama");
         System.out.println("3. Lihat Playlist (Maju)");
         System.out.println("4. Lihat Playlist (Mundur)");
         System.out.println("5. Cari Lagu");
         System.out.println("6. Keluar");

         System.out.print("Pilihan : ");

         pilihan_3012 = input_3012.nextInt();
         input_3012.nextLine();

         switch (pilihan_3012) {

             case 1:

                 System.out.print("Judul Lagu : ");
                 String judul_3012 = input_3012.nextLine();

                 System.out.print("Penyanyi : ");
                 String penyanyi_3012 = input_3012.nextLine();

                 musik_3012.tambahLagu_3012(
                         judul_3012,
                         penyanyi_3012
                 );

                 break;

             case 2:

                 musik_3012.hapusLaguAwal_3012();

                 break;

             case 3:

                 musik_3012.tampilMaju_3012();

                 break;

             case 4:

                 musik_3012.tampilMundur_3012();

                 break;

             case 5:

                 System.out.print("Masukkan judul lagu : ");

                 String cari_3012 = input_3012.nextLine();

                 musik_3012.cariLagu_3012(cari_3012);

                 break;

             case 6:

                 System.out.println("Program selesai.");

                 break;

             default:

                 System.out.println("Pilihan tidak tersedia!");
         }

     } while (pilihan_3012 != 6);

     input_3012.close();
 }
}