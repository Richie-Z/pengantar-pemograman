package praktikum_des2;

public class FaktorialDoWhile {
    public static void main(String[] args) {
        int nilaiFaktorial = 5;
        double hasilFaktorial = 1;
        System.out.print(nilaiFaktorial + "! = ");
        if (nilaiFaktorial == 0) {
            System.out.print(" 1 x ");
        } else {
            do {
                System.out.print(nilaiFaktorial + " x ");
                hasilFaktorial *= nilaiFaktorial;
                nilaiFaktorial--;
            } while (nilaiFaktorial > 0);
        }
        System.out.println("1 = " + hasilFaktorial);
    }
}
