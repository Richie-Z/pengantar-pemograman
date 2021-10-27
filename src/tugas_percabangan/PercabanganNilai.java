package tugas_percabangan;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class PercabanganNilai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai [0-100] : ");
        int nilai = sc.nextInt();

        if (nilai >= 0 && nilai <= 20) {
            System.out.println("Nilai anda E");
        } else if (nilai >= 21 && nilai <= 40) {
            System.out.println("Nilai anda D");
        } else if (nilai >= 41 && nilai <= 60) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 61 && nilai <= 80) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 81 && nilai <= 100) {
            System.out.println("Nilai anda A");
        } else {
            System.out.println("Nilai salah,input harus 0-100");
        }

    }

}
