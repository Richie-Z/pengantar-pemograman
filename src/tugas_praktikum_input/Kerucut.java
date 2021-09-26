package tugas_praktikum_input;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Kerucut {

    public static void main(String[] args) {
        double tinggi, jariJari, selimut, luasSelimut, luasPermukaan, volume;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jari-jari (r) : ");
        jariJari = input.nextDouble();
        System.out.println("Masukan tinggi (t) : ");
        tinggi = input.nextDouble();
        System.out.println("Masukan selimut (s) : ");
        selimut = input.nextDouble();

        luasSelimut = Math.PI * jariJari * selimut;
        luasPermukaan = luasSelimut + (Math.PI * (jariJari * jariJari));
        volume = (Math.PI * (jariJari * jariJari) * tinggi) / 3;

        System.out.printf("Luas selimut kerucut : %.2f %n", luasSelimut);
        System.out.printf("Luas permukaan kerucut : %.2f %n", luasPermukaan);
        System.out.printf("Volume kerucut : %.2f %n", volume);
    }
}
