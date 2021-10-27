package tugas_percabangan;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Percabangan03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah dia suka kamu [y/n] ? "); //n :')
        boolean diaSukaKamu = sc.next().equalsIgnoreCase("y");
        String jawaban = (diaSukaKamu) ? "Ya, dia suka kamu " : "Kamu terlalu baik buat dia";
        System.out.println(jawaban);

        System.out.print("Masukan angka : ");
        int bilangan = sc.nextInt();
        String bilanganPositifNegatif = (bilangan > 0) ? "Bilangan Positif"
                : (bilangan < 0) ? "Bilangan Negatif" : "Bilangan Nol";
        System.out.println(bilanganPositifNegatif);
    }
}
