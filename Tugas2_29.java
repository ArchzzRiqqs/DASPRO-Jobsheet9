
import java.util.Scanner;

public class Tugas2_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("Daftar Menu");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("\nCari menu: ");
        String cari = sc.nextLine();

        int indeksCari = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari.trim())) {
                indeksCari = i;
                break;
            }
        }

        if (indeksCari != -1) {
            System.out.println("Menu ditemukan: " + menu[indeksCari]);
            System.out.println("Harga: Rp " + harga[indeksCari]);
        } else {
            System.out.println("Menu " + cari + " tidak tersedia.");
        }

        System.out.print("\nMasukkan jumlah jenis pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        while (jumlahPesanan < 0) {
            System.out.println("Jumlah pesanan tidak boleh negatif.");
            System.out.print("Masukkan jumlah jenis pesanan: ");
            jumlahPesanan = sc.nextInt();
            sc.nextLine();
        }

        String[] pesanan = new String[jumlahPesanan];
        int[] jumlahItem = new int[jumlahPesanan];
        int[] subtotal = new int[jumlahPesanan];

        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            int indeksMenu = -1;

            while (indeksMenu == -1) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaMenu = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaMenu.trim())) {
                        indeksMenu = j;
                        break;
                    }
                }

                if (indeksMenu == -1) {
                    System.out.println("Menu tidak tersedia. Silakan pilih menu yang benar!");
                }
            }

            System.out.print("Masukkan jumlah item: ");
            jumlahItem[i] = sc.nextInt();
            sc.nextLine();

            pesanan[i] = menu[indeksMenu];
            subtotal[i] = harga[indeksMenu] * jumlahItem[i];

            totalBiaya += subtotal[i];
        }

        System.out.println("\nNota Pesanan:");

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println(pesanan[i] + " x " + jumlahItem[i] + " = Rp " + subtotal[i]);
        }

        System.out.println("Total biaya: Rp " + totalBiaya);

        sc.close();
    }
}