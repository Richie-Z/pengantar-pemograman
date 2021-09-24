package tugas_praktikum1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
//source rumus https://gurubelajarku.com/limas-segi-empat/
public class LimasSegiempat extends BangunRuang {

    public static Scanner sc = new Scanner(System.in);

    private String currentType = "";
    private double tinggiLimas, tinggiAlas;

    public LimasSegiempat(String ct) {
        this.currentType = ct.toLowerCase();
    }

    public void init() {
        System.out.println("Masukan tinggi limas (T) : ");
        this.tinggiLimas = sc.nextDouble();
        System.out.println("Masukan tinggi alas (tΔ) : ");
        this.tinggiAlas = sc.nextDouble();

        double sisi, panjang, lebar, jajarAlas, jajarTinggi;
        switch (currentType) {
            case PERSEGI:
                System.out.println("Masukan sisi persegi (s) : ");
                sisi = sc.nextDouble();
                this.main(sisi);
                break;
            case PERSEGI_PANJANG:
                System.out.println("Masukan panjang persegi panjang (p) : ");
                panjang = sc.nextDouble();
                System.out.println("Masukan lebar persegi panjang (l) : ");
                lebar = sc.nextDouble();
                this.main(panjang, lebar);
                break;
            case JAJAR_GENJANG:
                System.out.println("Masukan alas jajar genjang (a) : ");
                jajarAlas = sc.nextDouble();
                System.out.println("Masukan tinggi jajar genjang (t) : ");
                jajarTinggi = sc.nextDouble();
                this.main(jajarAlas, jajarTinggi);
                break;
            case SEGITIGA:
                this.main();
                break;
            default:
                System.out.println("Terjadi error silahkan ulangi program");
        }
    }

    public void main(double... v) {
        double luas = this.luasAlas(v) + (4 * super.luasPermukaan(this.tinggiLimas, this.tinggiAlas));
        double volume = (this.luasAlas(v) * this.tinggiLimas) / 3;

        System.out.printf("Luas limas segitiga dengan tipe %s : %.2f %n", this.currentType, luas);
        System.out.printf("Volume limas segitiga dengan tipe %s : %.2f %n", this.currentType, volume);

    }

    public double luasAlas(double... v) {
        if (this.currentType.equals(SEGITIGA)) {
            return super.luasPermukaan(this.tinggiLimas, this.tinggiAlas);
        } else if (this.currentType.equals(PERSEGI)) {
            return v[0] * v[0];
        } else if (this.currentType.equals(PERSEGI_PANJANG) || this.currentType.equals(JAJAR_GENJANG)) {
            return v[0] * v[1];
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.printf("Pilih tipe limas segiempat %s : %n", Arrays.toString(TIPE));
        String pilihan = sc.nextLine();
        boolean contains = Arrays.stream(TIPE).anyMatch(s -> s.equalsIgnoreCase(pilihan));
        if (contains) {
            LimasSegiempat ls = new LimasSegiempat(pilihan);
            ls.init();
        } else {
            System.out.println("Pilihan tidak sesuai!!");
        }
    }
}
