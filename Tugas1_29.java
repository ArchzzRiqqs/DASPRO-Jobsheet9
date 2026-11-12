
import java.util.Scanner;

public class Tugas1_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            System.out.print("Masukkan jumlah mahasiswa: ");
            n = sc.nextInt();
        }

        int[] nilai = new int[n];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            total += nilai[i];
        }

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            if (nilai[i] > 70) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        double rataRata = (double) total / n;

        System.out.println("\nREKAP NILAI MAHASISWA");

        for (int i = 0; i < nilai.length; i++) {
            String status = nilai[i] > 70 ? "LULUS" : "TIDAK LULUS";

            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        sc.close();
    }
}