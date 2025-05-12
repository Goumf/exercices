import java.util.Scanner;

public class ApplicationEqua2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta;

        System.out.print("Entrer une valeur pour a : ");
        a = scanner.nextDouble();

        System.out.print("Entrer une valeur pour b : ");
        b = scanner.nextDouble();

        System.out.print("Entrer une valeur pour c : ");
        c = scanner.nextDouble();

        // Cas où a = 0 → équation de premier degré ou sans solution
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("L'équation est toujours vraie : tout réel est solution.");
                } else {
                    System.out.println("Équation impossible : aucune solution.");
                }
            } else {
                double x = -c / b;
                System.out.printf("Équation de premier degré. La solution est : x = %.2f\n", x);
            }
        } else {
            // Cas classique : équation du second degré
            delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Pas de solution réelle (delta < 0).");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Une solution double : x = %.2f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Deux solutions réelles : x1 = %.2f, x2 = %.2f\n", x1, x2);
            }
        }

        scanner.close();
    }
}
