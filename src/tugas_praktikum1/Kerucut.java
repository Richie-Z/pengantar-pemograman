/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Kerucut {

    public static void main(String[] args) {
        double tinggi, jariJari, selimut, luasSelimut, luasPermukaan, volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan jari-jari (r) : ");
        jariJari = sc.nextDouble();
        System.out.println("Masukan tinggi (t) : ");
        tinggi = sc.nextDouble();
        System.out.println("Masukan selimut (s) : ");
        selimut = sc.nextDouble();

        luasSelimut = Math.PI * jariJari * selimut;
        luasPermukaan = luasSelimut + (Math.PI * (jariJari * jariJari));
        volume = (Math.PI * (jariJari * jariJari) * tinggi) / 3;

        System.out.printf("Luas selimut kerucut : %.2f %n", luasSelimut);
        System.out.printf("Luas permukaan kerucut : %.2f %n", luasPermukaan);
        System.out.printf("Volume kerucut : %.2f %n", volume);
    }
}
