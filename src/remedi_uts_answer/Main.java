package remedi_uts_answer;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Masukan tahun lahir pasien : ");
        int tahunLahir = sc.nextInt();
        final int tahunSekarang = 1900 + new Date().getYear(),
                umur = (tahunSekarang - tahunLahir);
        final String az = "AstraZeneca",
                sv = "Sinovac";

        System.out.println("Ketik 'az' untuk " + az);
        System.out.println("Ketik 'sv' untuk " + sv);
        System.out.print("Pilih vaksin yang diberikan : ");
        String jenisVaksin = sc.next();
        
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.printf("Umur Pasien : %d %n", umur);
        if (!(jenisVaksin.equalsIgnoreCase("az") || jenisVaksin.equalsIgnoreCase("sv"))) {
            System.out.println("Pilihan vaksin hanya 'az' dan 'sv' silahkan masukan dengan benar");
            return;
        }
        if (tahunLahir > tahunSekarang) {
            System.out.println("Tahun lahir tidak boleh lebih besar dari tahun " + tahunSekarang);
            return;
        }
        String sebutanVaksin = jenisVaksin.equalsIgnoreCase("az") ? az : sv,
                keteranganUmur = umur <= 5 ? "Balita"
                        : umur <= 11 ? "Anak-anak"
                                : umur <= 16 ? "Remaja"
                                        : umur <= 35 ? "Pemuda"
                                                : umur <= 60 ? "Orangtua"
                                                        : "Lansia",
                allowed = umur <= 16 ? sv
                        : umur <= 35 ? az
                                : umur > 60 ? sv
                                        : az + "/" + sv;
        if (umur <= 11) {
            System.out.printf("Pasien dengan rentang umur %s, tidak boleh menerima vaksin Covid19 %n", keteranganUmur);
            return;
        }
        if (((umur <= 16 || umur <= 35 || umur > 60) && sebutanVaksin.equals(allowed)) || (umur >= 36 && umur <= 60)) {
            System.out.printf("Pasien dengan rentang umur %s, boleh menerima vaksin Covid19 (%s) %n",
                    keteranganUmur, sebutanVaksin);
        } else {
            System.out.printf("Pasien dengan rentang umur %s, hanya boleh menerima vaksin %s, %n"
                    + "dan tidak boleh menerima vaksin %s %n", keteranganUmur, allowed, sebutanVaksin);
        }
    }
}
