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
public class Silinder {

    public static void main(String[] args) {
        double jariJari, tinggi, luasSelimut, luasPermukaan, volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan jari-jari (r) : ");
        jariJari = sc.nextDouble();
        System.out.println("Masukan tinggi (t) : ");
        tinggi = sc.nextDouble();

        luasSelimut = 2 * Math.PI * jariJari * tinggi;
        luasPermukaan = luasSelimut + (2 * Math.PI * (jariJari * jariJari));
        volume = Math.PI * (jariJari * jariJari) * tinggi;

        System.out.printf("Luas selimut silinder : %.2f %n", luasSelimut);
        System.out.printf("Luas permukaan silinder : %.2f %n", luasPermukaan);
        System.out.printf("Volume silinder : %.2f %n", volume);
    }
}
