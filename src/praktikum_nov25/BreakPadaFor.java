package praktikum_nov25;

public class BreakPadaFor {
    public static void main(String[] args) {
        int a = 3, b = 2, c = 1;
        System.out.println("Bil-A\t| Bil-B\t| Bil-C");
        System.out.println("---------------------");
        for (int bil = 0; bil <= 10; bil++) {
            a += b;
            b += c;
            c += 2;
            System.out.printf("%d\t\t|%d\t\t|%d\t\n", a, b, c);
            if (c == 13)
                break;
        }
    }
}
