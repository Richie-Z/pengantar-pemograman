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
public class Lengkap {

    public Scanner sc = new Scanner(System.in);

    public int pangkat(int carry, int key) {
        int newCarry = 1;
        for (int i = 0; i < key; i++) {
            newCarry *= carry;
        }
        return newCarry;
    }

    public void kubus() {
        System.out.println("Masukan Rusuk :");
        int rusuk = this.sc.nextInt();
        int luas = 6 * this.pangkat(rusuk, 2);
        int volume = this.pangkat(rusuk, 3);
        System.out.println("Luas Kubus : " + luas);
        System.out.println("Volume Kubus : " + volume);
    }

    public void balok() {
        String[] need = {"Panjang", "Lebar", "Tinggi"};
        int[] val = {0, 0, 0};
        int key = 0, luas, volume;
        for (String s : need) {
            System.out.printf("Masukan %s : %n", s);
            val[key] = sc.nextInt();
            key++;
        }
        luas = (2 * val[0] * val[1]) + (2 * val[0] * val[2]) + (2 * val[1] * val[2]);
        volume = val[0] * val[1] * val[2];
        System.out.println("Luas balok : " + luas);
        System.out.println("Volume balok : " + volume);
    }

    public void limasSegiempat() {
        System.out.println("");
    }

    public void silinder() {
        double jari, tinggi;
        System.out.println("Masukan Jari-Jari : ");
        jari = this.sc.nextDouble();
        System.out.println("Masukan Tinggi : ");
        tinggi = this.sc.nextDouble();
        
    }

    public static void main(String[] args) {
        Lengkap l = new Lengkap();
        l.balok();
    }
}
