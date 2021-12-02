package tugas_nov30;

import java.util.Scanner;

public class DeretPrimaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Bilangan : ");
        int bil = sc.nextInt(),
                bilPembagi = (bil / 2) + 1;
        boolean isPrima = true;
        for (int i = bilPembagi; i > 1; i--)
            if (bil % i == 0) {
                isPrima = false;
                System.out.printf("%d bukan bilangan prima\n", bil);
                break;
            }
        if (isPrima) System.out.printf("%d adalah bilangan prima\n", bil);
    }
}
