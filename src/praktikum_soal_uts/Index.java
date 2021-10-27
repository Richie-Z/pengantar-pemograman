package praktikum_soal_uts;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umur, beratBadan, totalBelanja;
        System.out.print("Masukan Umur (Tahun) = ");
        umur = sc.nextInt();
        System.out.print("Masukan berat badan costumer (kg) = ");
        beratBadan = sc.nextInt();
        System.out.print("Masukan total belanja (Rupiah) = ");
        totalBelanja = sc.nextInt();

        int hasilPotongan = 0;
        if (umur > 16 && totalBelanja > 50000) {
            double potonganHarga;
            if (umur <= 25) {
                potonganHarga = beratBadan / 10;
            } else if (umur <= 50) {
                potonganHarga = beratBadan / 5;
            } else {
                potonganHarga = beratBadan / 2;
            }
            hasilPotongan = (int) (totalBelanja * (potonganHarga / 100));
            System.out.printf("Anda mendapatkan potongan %.1f%% dari Rp.%d Sebesar Rp.%d %n", potonganHarga,
                    totalBelanja, hasilPotongan);
        } else {
            System.out.println("Anda tidak mendapatkan promo potongan harga");
        }

        System.out.println("\n\n--------------------------------------------------");
        System.out.println("Umur \t\t\t\t :" + umur + " tahun");
        System.out.println("Berat Badan \t\t\t :" + beratBadan + " kg");
        System.out.println("Total Belanja \t\t\t :" + "Rp. " + totalBelanja);
        System.out.println("Potongan Promo \t\t\t :" + "Rp. " + hasilPotongan);
        System.out.println("Yang Harus dibayarkan \t\t :" + "Rp. " + (totalBelanja - hasilPotongan));
    }
}
