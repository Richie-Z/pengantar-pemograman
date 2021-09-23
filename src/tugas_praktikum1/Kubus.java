package tugas_praktikum1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Kubus {

    public static void main(String[] args) {
        double rusuk, luas, volume;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan rusuk (s) :");
        rusuk = sc.nextDouble();

        luas = 6 * (rusuk * rusuk);
        volume = rusuk * rusuk * rusuk;
        System.out.printf("Luas Kubus : %.2f %n", luas);
        System.out.printf("Volume Kubus : %.2f %n", volume);
    }
}
