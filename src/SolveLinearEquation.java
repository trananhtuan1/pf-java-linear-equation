import java.util.Scanner;

public class SolveLinearEquation {
    public static void main(String[] args) {
        System.out.println("Please input arguments");

        System.out.print("a: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("b: ");
        double b = new Scanner(System.in).nextDouble();

        if (a == 0) System.out.println("Phuong trinh "
                + a + " * x + " + b + " = 0" +
                " vo nghiem");

    }
}
