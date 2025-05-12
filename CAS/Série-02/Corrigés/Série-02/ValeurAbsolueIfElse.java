import java.util.Scanner;

public class ValeurAbsolueIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre x = ");
        double x = scanner.nextDouble();

        if (x >= 0) {
            System.out.println("|x| = " + x);
        } else {
            System.out.println("|x| = " + (-x));
        }

        scanner.close();
    }
}
