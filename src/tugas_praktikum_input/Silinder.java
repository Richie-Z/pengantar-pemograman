package tugas_praktikum_input;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Silinder {

    public static void main(String[] args) {
        double jariJari, tinggi, luasSelimut, luasPermukaan, volume;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jari-jari (r) : ");
        jariJari = input.nextDouble();
        System.out.println("Masukan tinggi (t) : ");
        tinggi = input.nextDouble();

        luasSelimut = 2 * Math.PI * jariJari * tinggi;
        luasPermukaan = luasSelimut + (2 * Math.PI * (jariJari * jariJari));
        volume = Math.PI * (jariJari * jariJari) * tinggi;

        System.out.printf("Luas selimut silinder : %.2f %n", luasSelimut);
        System.out.printf("Luas permukaan silinder : %.2f %n", luasPermukaan);
        System.out.printf("Volume silinder : %.2f %n", volume);
    }
}
