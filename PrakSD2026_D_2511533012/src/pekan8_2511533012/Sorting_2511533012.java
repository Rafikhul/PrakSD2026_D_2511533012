package pekan8_2511533012;

public class Sorting_2511533012 {

    Lagu_2511533012[] dataLagu_3012 = new Lagu_2511533012[20];
    int jumlahData_3012 = 0;

    public void inputData_3012() {
        dataLagu_3012[jumlahData_3012++] = new Lagu_2511533012("Hati-Hati di Jalan", "Tulus", 240);
        dataLagu_3012[jumlahData_3012++] = new Lagu_2511533012("Monokrom", "Tulus", 220);
        dataLagu_3012[jumlahData_3012++] = new Lagu_2511533012("Sial", "Mahalini", 210);
        dataLagu_3012[jumlahData_3012++] = new Lagu_2511533012("Tak Segampang Itu", "Anggi Marito", 250);
        dataLagu_3012[jumlahData_3012++] = new Lagu_2511533012("Komang", "Raim Laode", 260);
        dataLagu_3012[jumlahData_3012++] = new Lagu_2511533012("Melukis Senja", "Budi Doremi", 200);
        dataLagu_3012[jumlahData_3012++] = new Lagu_2511533012("Runtuh", "Feby Putri", 230);
    }

    public void tampilData_3012() {
        for (int i = 0; i < jumlahData_3012; i++) {
            System.out.println(
                (i + 1) + ". " +
                dataLagu_3012[i].judul_3012 + " - " +
                dataLagu_3012[i].penyanyi_3012 + " - " +
                dataLagu_3012[i].durasi_3012 + " detik"
            );
        }
    }

    public void quickSort_3012(int low_3012, int high_3012) {
        if (low_3012 < high_3012) {
            int pivotIndex_3012 = partition_3012(low_3012, high_3012);

            quickSort_3012(low_3012, pivotIndex_3012 - 1);
            quickSort_3012(pivotIndex_3012 + 1, high_3012);
        }
    }

    public int partition_3012(int low_3012, int high_3012) {
        int pivot_3012 = dataLagu_3012[high_3012].durasi_3012;
        int i_3012 = low_3012 - 1;

        for (int j_3012 = low_3012; j_3012 < high_3012; j_3012++) {
            if (dataLagu_3012[j_3012].durasi_3012 < pivot_3012) {
                i_3012++;

                Lagu_2511533012 temp_3012 = dataLagu_3012[i_3012];
                dataLagu_3012[i_3012] = dataLagu_3012[j_3012];
                dataLagu_3012[j_3012] = temp_3012;
            }
        }

        Lagu_2511533012 temp_3012 = dataLagu_3012[i_3012 + 1];
        dataLagu_3012[i_3012 + 1] = dataLagu_3012[high_3012];
        dataLagu_3012[high_3012] = temp_3012;

        return i_3012 + 1;
    }

    public static void main(String[] args) {

        Sorting_2511533012 playlist_3012 = new Sorting_2511533012();

        playlist_3012.inputData_3012();

        System.out.println("=== Sorting Playlist NIM: 2511533012 ===");

        System.out.println("\nData Sebelum Sorting:");
        playlist_3012.tampilData_3012();

        playlist_3012.quickSort_3012(
                0,
                playlist_3012.jumlahData_3012 - 1
        );

        System.out.println("\nData Setelah Quick Sort (Durasi Ascending):");
        playlist_3012.tampilData_3012();
    }
}