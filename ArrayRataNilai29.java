
import java.util.Scanner;

public class ArrayRataNilai29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        while (jumlah <= 0) {
            System.out.println("Jumlah harus lebih dari 0.");
            System.out.print("Masukkan jumlah mahasiswa: ");
            jumlah = input.nextInt();
        }

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        int lulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");

            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }

        double rata2 = (double) total / nilaiMhs.length;

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);

        input.close();
    }
}
