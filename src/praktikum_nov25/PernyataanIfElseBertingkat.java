package praktikum_nov25;

import java.util.Scanner;

public class PernyataanIfElseBertingkat {
    public static void main(String[] args) {
        int pendapatan;
        double jasa, komisi, total;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Pendapatan Sales Rp. ");
        pendapatan = sc.nextInt();
        if (pendapatan >= 0 && pendapatan <= 200000) {
            jasa = 10000;
            komisi = 0.1 * pendapatan;
        }else if (pendapatan <= 500000) {
            jasa = 20000;
            komisi = 0.15 * pendapatan;
        } else {
            jasa = 30000;
            komisi = 0.2 * pendapatan;
        }
        total = komisi + jasa;
        System.out.println("\nUang Jasa Rp. " + (int) jasa);
        System.out.println("Uang Komisi Rp. " + (int) komisi);
        System.out.println("================================");
        System.out.println("Uang Total Rp. " + (int) total);
    }
}
