
import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        int lulus = 0;
        int tidakLulus = 0;
        int nomor = 0;

        System.out.println("\nMahasiswa yang Lulus:");

        for (int nilai : nilaiAkhir) {
            nomor++;

            if (nilai > 70) {
                System.out.println("Mahasiswa ke-" + nomor + ": " + nilai);
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("\nJumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        input.close();
    }
}
