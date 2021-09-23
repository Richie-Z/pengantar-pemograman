/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_1;

/**
 *
 * @author Richie-PC
 */
public class Pertambahan {

    public static int perkalian(int jumlah, int n) {
        if (n < 0) {
            System.out.println("minus gabisa");
            return 0;
        }
        int hasil = 0;
        for (int i = n; i >= 1; i--) {
            hasil += jumlah;
        }
        return hasil;
    }

    public static int pembagian(int jumlah, int n) {

        if (n * 2 > jumlah) {
            System.out.println("Ga Bisa");
            return 0;
        }
        int current = 0, hasil = 1;
        while (current == jumlah) {
            current = n * hasil;
            hasil += 1;
        }
        return hasil;
    }

    public static void main(String[] args) {
        int a = 100, b = 50;
        System.out.println(Pertambahan.perkalian(100, -4));
        System.out.println(Pertambahan.pembagian(100, 4));
    }
}
