import java.util.Scanner;

public class SolveLinearEquation {
    public static void main(String[] args) {
        boolean wantToSolve = true;

        while (wantToSolve) {
            System.out.println("Please input arguments");

            double[] arguments = getArgumentsFromKeyboard();
            double[] tapnghiem = solve(arguments[0], arguments[1]);
            printTapNghiem(arguments[0], arguments[1], tapnghiem);

            wantToSolve = askUserToContinue();
        }

        System.out.println("Thanks you!");
    }

    public static boolean askUserToContinue() {
        System.out.println("Are you want to contine? (Y/n)");
        String answer = new Scanner(System.in).nextLine();
        if (answer.equals("y") || answer.equals("Y")) return true;
        return false;
    }

    public static double[] getArgumentsFromKeyboard() {
        double a = printMessageAndGetDoubleFromKeyboard("a: ");
        double b = printMessageAndGetDoubleFromKeyboard("b: ");
        return new double[]{a, b};
    }

    public static double printMessageAndGetDoubleFromKeyboard(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextDouble();
    }

    public static double[] solve(double a, double b) {
        boolean conghiem = a != 0;
        if (!conghiem) return new double[]{};

        double ngiem = -b / a;
        return new double[]{ngiem};
    }

    public static void printTapNghiem(double a, double b, double[] tapnghiem) {
        if (tapnghiem.length == 0) System.out.println("Phuong trinh "
                + a + " * x + " + b + " = 0" +
                " vo nghiem");
        else {
            double nghiem = tapnghiem[0];
            System.out.println("Phuong trinh co 1 nghiem: " + nghiem);
        }
    }
}
