package praktikum_nov25;

public class ProgramBreak {
    public static void main(String[] args) {
        int bil = 1;
        do {
            if(bil >= 6)
                break;
            System.out.println(bil);
            bil++;
        }while(bil <= 10);
    }
}
