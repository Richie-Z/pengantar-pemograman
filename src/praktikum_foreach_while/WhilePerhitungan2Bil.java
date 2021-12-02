package praktikum_foreach_while;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class WhilePerhitungan2Bil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int counter = 0;
        while (running) {
            System.out.println("PERHITUNGAN 2 BILANGAN");
            System.out.print("Masukan bilangan 1 : ");
            int bil1 = sc.nextInt();
            System.out.print("Masukan bilangan 2 : ");
            int bil2 = sc.nextInt();

            System.out.println("Hasil tambah : " + (bil1 + bil2));
            
            System.out.println("\n\nApakah anda ingin keluar ?");
            System.out.print("Jawab [y/n] ");
            running = !sc.next().equalsIgnoreCase("y");
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak : " + counter);
    }
}
