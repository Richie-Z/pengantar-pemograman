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
public class LimasSegitiga extends BangunRuang {

    public static Scanner sc = new Scanner(System.in);
    private double alas, tinggi, tinggiLimas, volume, luas;

    public void init() {
        System.out.println("Masukan alas (a) : ");
        this.alas = sc.nextDouble();
        System.out.println("Masukan tinggi (t) : ");
        this.tinggi = sc.nextDouble();
        System.out.println("Masukan tinggi prisma (T) : ");
        this.tinggiLimas = sc.nextDouble();
        this.main();
    }

    public void main() {
        this.volume = (super.luasPermukaan(this.alas, this.tinggi) * this.tinggiLimas) / 3;
        this.luas = 2 * super.luasPermukaan(this.alas, this.tinggi) * 4;

        System.out.printf("Luas permukaan limas segitiga : %.2f %n", luas);
        System.out.printf("Volume limas segitiga : %.2f %n", volume);
    }

    public static void main(String[] args) {
        LimasSegitiga ls = new LimasSegitiga();
        ls.init();
    }
}
