package tugas_percabangan;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Percabangan01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah belanja anda adalah : ");
        int jumlah = sc.nextInt();
        if (jumlah >= 100000) {
            System.out.println("Selamat anda mendapatkan sebuah bonus");
        }
        System.out.println("Terimakasih sudah berbelanja di tempat kami");
    }
}
