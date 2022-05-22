package uas;

import java.util.Scanner;

/**
 * @author Immanuel Richie De Harjo Zakaria - 2142101927
 */

public class SoalPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai X : ");
        int x = sc.nextInt();
        System.out.print("Masukan nilai Y : ");
        int y = sc.nextInt();
        double hasilPangkat = 1;
        for (int i = 1; i <= y; i++) {
            hasilPangkat *= x;
        }
        System.out.printf("Hasil %d pangkat %d adalah = %.2f", x, y, hasilPangkat);
    }
}

class SoalPerulanganWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai X : ");
        int x = sc.nextInt();
        System.out.print("Masukan nilai Y : ");
        int y = sc.nextInt();
        double hasilPangkat = 1;
        int i = 1;
        while (i <= y) {
            hasilPangkat *= x;
            i++;
        }
        System.out.printf("Hasil %d pangkat %d adalah = %.2f", x, y, hasilPangkat);
    }
}

class SoalPerulanganDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai X : ");
        int x = sc.nextInt();
        System.out.print("Masukan nilai Y : ");
        int y = sc.nextInt();
        double hasilPangkat = 1;
        int i = 1;
        do {
            hasilPangkat *= x;
            i++;
        } while (i <= y);
        System.out.printf("Hasil %d pangkat %d adalah = %.2f", x, y, hasilPangkat);
    }
}