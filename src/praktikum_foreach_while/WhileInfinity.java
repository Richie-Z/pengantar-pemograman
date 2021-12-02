package praktikum_foreach_while;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class WhileInfinity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int counter = 0;
        while(running){
            System.out.println("Apakah anda ingin keluar ?");
            System.out.print("Jawab [y/n] ");
            running = !sc.next().equalsIgnoreCase("y");
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak : "+ counter);
    }
}
