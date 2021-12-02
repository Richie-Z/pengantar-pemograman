package tugas_praktikum_for;

/**
 *
 * @author Richie-PC
 */
public class For003 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0)
                System.out.println("Bilangan Genap!");
            else
                System.out.println("Bilangan Ganjil!");
            counter++;
        }
        System.out.println("Perulangan sebanyak = "+counter);
    }
}
