package praktikum_nov25;

public class ProgramNestedFor {
    public static void main(String[] args) {
        int a, b;
        for (a = 0; a <= 5 ; a++) {
            System.out.println();
            for (b = a; b <=5 ; b++) {
                System.out.print(a);
            }
        }
        System.out.println();
    }
}
