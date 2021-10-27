package tugas_percabangan;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Percabangan02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = sc.next();

        System.out.print("Nilai : ");
        int nilai = sc.nextInt();

        System.out.print("Jumlah tidak hadir : ");
        int jumlahTidakHadir = sc.nextInt();

        boolean p = nilai >= 70,
                q = jumlahTidakHadir < 5;

        if (p && q) {
            System.out.printf("Selamat %s anda dinyatakan lulus %n", nama);
        } else {
            System.out.printf("Maaf %s anda dinyatakan tidak lulus %n", nama);
        }
    }

}
