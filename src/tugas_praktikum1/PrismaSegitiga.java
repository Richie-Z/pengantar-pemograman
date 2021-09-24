package tugas_praktikum1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
//source rumus https://www.belajarmtk.com/rumus-volume-prisma-segitiga-dan-luas-permukaannya/
public class PrismaSegitiga extends BangunRuang {

    public static Scanner sc = new Scanner(System.in);
    private double alas, tinggi, tinggiPrisma, volume, luas;

    public void init() {
        System.out.println("Masukan alas (a) : ");
        this.alas = sc.nextDouble();
        System.out.println("Masukan tinggi (t) : ");
        this.tinggi = sc.nextDouble();
        System.out.println("Masukan tinggi prisma (T) : ");
        this.tinggiPrisma = sc.nextDouble();
        this.main();
    }

    public void main() {
        this.volume = super.luasPermukaan(this.alas, this.tinggi) * this.tinggiPrisma;
        this.luas = 2 * super.luasPermukaan(this.alas, this.tinggi) + (3 * this.alas * this.tinggiPrisma);

        System.out.printf("Luas permukaan prisma segitiga : %.2f %n", luas);
        System.out.printf("Volume prisma segitiga : %.2f %n", volume);
    }

    public static void main(String[] args) {
        PrismaSegitiga ps = new PrismaSegitiga();
        ps.init();
    }
}
