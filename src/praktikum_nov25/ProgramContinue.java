package praktikum_nov25;

public class ProgramContinue {
    public static void main(String[] args) {
        for (int bil = 0; bil <= 10; bil++) {
            if (bil == 6)
                continue;
            if (bil == 8)
                continue;
            System.out.println(bil);
        }
    }
}
