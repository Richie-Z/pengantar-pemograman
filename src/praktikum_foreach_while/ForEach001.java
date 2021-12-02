package praktikum_foreach_while;

/**
 *
 * @author Richie-PC
 */
public class ForEach001 {

    public static void main(String[] args) {
        int angka[] = {1, 49, 50, 69, 2, 100};
        System.out.println("=============Perulangan For=============");
        for (int i = 0; i < angka.length; i++) {
            int j = angka[i];
            System.out.println(j);
        }
        System.out.println("=============Perulangan Foreach=============");
        for (int i : angka) {
            System.out.println(i);
        }
    }

}
