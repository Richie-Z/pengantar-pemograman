package praktikum_foreach_while;

import java.util.Random;

/**
 *
 * @author Richie-PC
 */
public class WhileRandom {

    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(100);
        int counter = 1;
        while (randNumber != 60) {
            System.out.println(randNumber);
            randNumber = rand.nextInt(100);
            counter++;
        }
        System.out.println("Ketemu Random Number : " + randNumber);
        System.out.println("Jumlah Perulangan : " + counter);
    }
}
