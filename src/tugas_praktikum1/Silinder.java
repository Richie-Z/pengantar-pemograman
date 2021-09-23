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
        Scanner sc = new Scanner(System.in);
        double jari, tinggi, luasSelimut, luasPermukaan, volume;
        System.out.println("Masukan jari-jari : ");
        jari = sc.nextDouble();
        System.out.println("Masukan tinggi : ");
        tinggi = sc.nextDouble();
        luasSelimut = 2 * Math.PI * jari * tinggi;
        luasPermukaan = luasSelimut + (2 * Math.PI * (jari * jari));
        volume = Math.PI * (jari * jari) * tinggi;

        System.out.println("Luas Selimut Silinder : " + luasSelimut);
        System.out.println("Luas Permukaan Silinder : " + luasPermukaan);
        System.out.println("Volume Silinder : " + volume);
    }
}
