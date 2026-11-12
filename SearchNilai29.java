
import java.util.Scanner;

public class SearchNilai29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        while (n <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0.");
            System.out.print("Masukkan jumlah elemen array: ");
            n = input.nextInt();
        }

        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari: ");
        int key = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i
                );

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai yang dicari (" + key + ") tidak ditemukan dalam array."
            );
        }

        input.close();
    }
}