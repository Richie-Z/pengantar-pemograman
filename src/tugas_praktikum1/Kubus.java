package tugas_praktikum1;

import java.util.Scanner; 
/**
 *
 * @author Richie-PC
 */
public class Kubus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Rusuk :");
        int rusuk = sc.nextInt();
        int luas = 6 * (rusuk * rusuk);
        int volume = rusuk * rusuk * rusuk;
        System.out.println("Luas Kubus : " + luas); 
        System.out.println("Volume Kubus : " + volume); 
    }
}
