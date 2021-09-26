package tugas_praktikum_input;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Bola {

    public static void main(String[] args) {
        double jariJari, luas, volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan jari-jari (r) : ");
        jariJari = sc.nextDouble();

        luas = 4 * Math.PI * (jariJari * jariJari);
        volume = (4 * Math.PI * (jariJari * jariJari * jariJari))/ 3;

        System.out.printf("Luas bola :  %.2f %n", luas);
        System.out.printf("Volume bola :  %.2f %n", volume);
    }
}
