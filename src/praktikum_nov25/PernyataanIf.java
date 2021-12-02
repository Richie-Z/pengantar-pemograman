package praktikum_nov25;

import java.util.Scanner;

public class PernyataanIf {
    public static void main(String[] args) {
        double totalBeli, potongan = 0, jumlahBayar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Pembelian Rp. ");
        totalBeli = sc.nextDouble();
        if (totalBeli >= 50000)
            potongan = 0.2 * totalBeli;
        System.out.println("Besarnya Potongan Rp. " + potongan);
        jumlahBayar = totalBeli - potongan;
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahBayar);
    }
}
