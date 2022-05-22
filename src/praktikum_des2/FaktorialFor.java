package praktikum_des2;

public class FaktorialFor {
    public static void main(String[] args) {
        int nilaiFaktorial = 10;
        double hasilFaktorial = 1;
        for (int i = nilaiFaktorial; i > 0; i--) {
            System.out.print(i + " x ");
            hasilFaktorial *= i;
        }
        System.out.println("1 = " + hasilFaktorial);
    }
}
