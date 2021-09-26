package tugas_praktikum_input;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Kubus {

    public static void main(String[] args) {
        double rusuk, luas, volume;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan rusuk (s) :");
        rusuk = input.nextDouble();

        luas = 6 * (rusuk * rusuk);
        volume = rusuk * rusuk * rusuk;
        System.out.printf("Luas Kubus : %.2f %n", luas);
        System.out.printf("Volume Kubus : %.2f %n", volume);
    }
}
