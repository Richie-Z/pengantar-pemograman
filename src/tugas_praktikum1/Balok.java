package tugas_praktikum1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Balok {

    public static void main(String[] args) {
        double panjang, lebar, tinggi, luas, volume;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan panjang (p) : ");
        panjang = sc.nextDouble();
        System.out.println("Masukan lebar (l) : ");
        lebar = sc.nextDouble();
        System.out.println("Masukan tinggi (t) : ");
        tinggi = sc.nextDouble();
        
        luas = (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
        volume = panjang * lebar * tinggi;
        System.out.printf("Luas balok : %.2f %n", luas);
        System.out.printf("Volume balok : %.2f %n" , volume);
    }
}
