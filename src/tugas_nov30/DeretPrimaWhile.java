package tugas_nov30;

import java.util.Scanner;

public class DeretPrimaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Bilangan : ");
        int bil = sc.nextInt(),
                bilPembagi = (bil / 2) + 1;
        boolean isPrima = true;
        while (bilPembagi > 1) {
            if (bil % bilPembagi == 0) {
                isPrima = false;
                System.out.printf("%d bukanlah bilangan prima\n", bil);
                break;
            }
            bilPembagi--;
        }
        if (isPrima) System.out.printf("%d adalah bilangan prima\n", bil);
    }
}
