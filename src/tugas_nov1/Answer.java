package tugas_nov1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai awal : ");
        int nilaiAwal = sc.nextInt();
        System.out.print("Masukan nilai akhir : ");
        int nilaiAkhir = sc.nextInt();
        if (nilaiAwal > nilaiAkhir) {
            for (int i = nilaiAwal; i >= nilaiAkhir; i--) {
                System.out.println(i);
            }
            return;
        }
        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
            System.out.println(i);
        }
    }
}
