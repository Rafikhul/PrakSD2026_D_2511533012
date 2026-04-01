package pekan1_2511533012;

public class MobilDriver_2511533012 {

    public static void main(String[] args) {

        Mobil_2511533012[] dataMobil = new Mobil_2511533012[10];
        int jumlah = 0;

        dataMobil[jumlah++] = new Mobil_2511533012("Avanza", 2020, 1300, 150000000, "Toyota");
        dataMobil[jumlah++] = new Mobil_2511533012("Brio", 2022, 1200, 180000000, "Honda");

        System.out.println("=== Data Mobil ===");
        tampil(dataMobil, jumlah);

        int indexHapus = 0;
        for (int i = indexHapus; i < jumlah - 1; i++) {
            dataMobil[i] = dataMobil[i + 1];
        }
        jumlah--;

        System.out.println("\n=== Setelah Hapus ===");
        tampil(dataMobil, jumlah);

        dataMobil[0].setHarga(175000000);

        System.out.println("\n=== Setelah Update ===");
        tampil(dataMobil, jumlah);

        System.out.println("\n=== Ambil Data (Getter) ===");
        System.out.println("Nama mobil: " + dataMobil[0].getNama());
    }

    public static void tampil(Mobil_2511533012[] data, int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(data[i]);
        }
    }
}