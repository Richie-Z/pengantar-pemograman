package praktikum_des2;

public class FaktorialWhile {
    public static void main(String[] args) {
        int nilaiFaktorial = 5;
        double hasilFaktorial = 1;
        System.out.print(nilaiFaktorial + "! = ");
        while (nilaiFaktorial > 0) {
            System.out.print(nilaiFaktorial + " x ");
            hasilFaktorial *= nilaiFaktorial;
            nilaiFaktorial--;
        }
        System.out.println("1 = " + hasilFaktorial);
    }
}
