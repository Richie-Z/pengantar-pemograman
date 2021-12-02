package praktikum_foreach_while;

/**
 *
 * @author Richie-PC
 */
public class ForEach002 {

    public static void main(String[] args) {
        String namas[] = {"Siti", "Tono", "Budi", "Richie"};
        System.out.println("=============Perulangan For=============");
        for (int i = 0; i < namas.length; i++) {
            String nama = namas[i];
            System.out.println(nama);
        }

        System.out.println("=============Perulangan Foreach============");
        for (String nama : namas) {
            System.out.println(nama);
        }
    }
}
