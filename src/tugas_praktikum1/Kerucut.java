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
        Scanner sc = new Scanner(System.in);
        double tinggi, jari, selimut, luasSelimut, luasPermukaan, volume;

        System.out.println("Masukan jari-jari : ");
        jari = sc.nextDouble();
        System.out.println("Masukan tinggi : ");
        tinggi = sc.nextDouble();
        System.out.println("Masukan selimut : ");
        selimut = sc.nextDouble();

        luasSelimut = Math.PI * jari * selimut;
        luasPermukaan = luasSelimut + (Math.PI * (jari * jari));
        volume = (Math.PI * (jari * jari) * tinggi) / 3;

        System.out.println("Luas Selimut Kerucut : " + luasSelimut);
        System.out.println("Luas Permukaan Kerucut : " + luasPermukaan);
        System.out.println("Volume Kerucut : " + volume);
    }
}
