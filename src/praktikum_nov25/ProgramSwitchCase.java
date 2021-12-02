package praktikum_nov25;

import java.util.Scanner;

public class ProgramSwitchCase {
    public static void main(String[] args) {
        int kode;
        String namaBarang;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan kode Barang [1-3] : ");
        kode = sc.nextInt();
        switch (kode) {
            case 1:
                namaBarang = "Alat Olah Raga";
                break;
            case 2:
                namaBarang = "Alat Elektronik";
                break;
            case 3:
                namaBarang = "Alat Masak";
                break;
            default:
                namaBarang = "Anda Salah Memasukan Kode";
                break;
        }
        System.out.println("\nKode yang anada Pilih : "+ namaBarang);
    }
}
