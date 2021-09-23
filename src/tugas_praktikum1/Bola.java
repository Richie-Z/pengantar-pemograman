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
public class Bola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double jari, luas, volume;

        System.out.println("Masukan jari-jari : ");
        jari = sc.nextDouble();

        luas = 4 * Math.PI * (jari * jari);
        volume = 4 / 3 * Math.PI * (jari * jari * jari);

        System.out.println("Luas Bola : " + luas);
        System.out.println("Volume Bola : " + volume);
    }
}
