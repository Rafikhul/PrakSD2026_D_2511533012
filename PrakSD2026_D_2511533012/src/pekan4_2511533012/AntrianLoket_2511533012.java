package pekan4_2511533012;
import java.util.Scanner;

public class AntrianLoket_2511533012 {
    String queue[];
    int front;
    int rear;
    int max;

    public AntrianLoket_2511533012(int size) {
        max = size;
        queue = new String[max];
        front = -1;
        rear = -1;
    }

    boolean isEmpty_3012() {
        return rear == -1;
    }

    boolean isFull_3012() {
        return rear == max - 1;
    }

    void enqueue_3012(String data) {
        if (isFull_3012()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_3012()) {
                front = 0;
            }
            rear++;
            queue[rear] = data;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    void dequeue_3012() {
        if (isEmpty_3012()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue[front] + " telah dilayani");

            if (front == rear) {
                front = rear = -1;
            } else {
                for (int i = front; i < rear; i++) {
                    queue[i] = queue[i + 1];
                }
                rear--;
            }
        }
    }

    void display_3012() {
        if (isEmpty_3012()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i = front; i <= rear; i++) {
                System.out.println((i + 1) + ". " + queue[i]);
            }
        }
    }

    void Reverse_3012() {
        if (isEmpty_3012()) {
            System.out.println("Antrian kosong!");
        } else {
            int awal = front;
            int akhir = rear;

            while (awal < akhir) {
                String temp = queue[awal];
                queue[awal] = queue[akhir];
                queue[akhir] = temp;

                awal++;
                akhir--;
            }

            System.out.println("Antrian berhasil dibalik");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AntrianLoket_2511533012 antrian =
                new AntrianLoket_2511533012(10);

        int pilih;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET PIKHUL ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    antrian.enqueue_3012(nama);
                    break;

                case 2:
                    antrian.dequeue_3012();
                    break;

                case 3:
                    antrian.display_3012();
                    break;

                case 4:
                    antrian.Reverse_3012();
                    antrian.display_3012();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 5);

        input.close();
    }
}