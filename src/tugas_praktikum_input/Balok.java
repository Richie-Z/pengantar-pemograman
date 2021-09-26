package tugas_praktikum_input;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Balok {

    public static void main(String[] args) {
        double panjang, lebar, tinggi, luas, volume;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan panjang (p) : ");
        panjang = input.nextDouble();
        System.out.println("Masukan lebar (l) : ");
        lebar = input.nextDouble();
        System.out.println("Masukan tinggi (t) : ");
        tinggi = input.nextDouble();
        
        luas = (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
        volume = panjang * lebar * tinggi;
        System.out.printf("Luas balok : %.2f %n", luas);
        System.out.printf("Volume balok : %.2f %n" , volume);
    }
}
