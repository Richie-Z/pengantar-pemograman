package tugas_percabangan;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Percabangan04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int bilangan = sc.nextInt();
        if (bilangan > 0) {
            System.out.println("Bilangan Positif");
        } else if (bilangan < 0) {
            System.out.println("Bilangan Negatif");
        } else {
            System.out.println("Bilangan Nol");
        }
    }
}
