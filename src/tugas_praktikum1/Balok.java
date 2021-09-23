package tugas_praktikum1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Balok {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar, tinggi, luas, volume;
        System.out.println("Masukan panjang : ");
        panjang = sc.nextInt();
        System.out.println("Masukan Lebar : ");
        lebar = sc.nextInt();
        System.out.println("Masukan Tinggi: ");
        tinggi = sc.nextInt();
        luas = (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
        volume = panjang * lebar * tinggi;
        System.out.println("Luas Balok : " + luas);
        System.out.println("Volume Balok : " + volume);
    }
}
