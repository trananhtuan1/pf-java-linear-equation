import java.util.Scanner;

public class SolveLinearEquation {
    public static void main(String[] args) {
        System.out.println("Please input arguments");

        System.out.print("a: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("b: ");
        double b = new Scanner(System.in).nextDouble();

        double[] tapnghiem = solve(a, b);

        if (tapnghiem.length == 0) System.out.println("Phuong trinh "
                + a + " * x + " + b + " = 0" +
                " vo nghiem");
        else {
            double nghiem = tapnghiem[0];
            System.out.println("Phuong trinh co 1 nghiem: " + nghiem);
        }
    }

    public static double[] solve(double a, double b) {
        boolean conghiem = a != 0;
        if (!conghiem) return new double[]{};

        double ngiem = -b / a;
        return new double[]{ngiem};
    }
}
