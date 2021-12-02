package tugas_praktikum_for;

/**
 *
 * @author Richie-PC
 */
public class For002 {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(i + "-" + j + "-" + k);
                    counter++;
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Perulangan sebanyak = " + counter);
    }
}
