import java.util.Scanner;

public class ApplicationRechLin {

    static final int MAX = 20;
    static int[] table = new int[MAX];

    // Initialise le tableau avec des valeurs aléatoires entre 0 et 99
    static void initTable() {
        for (int i = 0; i < table.length; i++) {
            table[i] = (int) (Math.random() * 100);
        }
    }

    // Affiche le contenu du tableau
    static void afficherTable(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);
            if (i < t.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    // Recherche linéaire avec while et court-circuit logique
    static int recherche1(int[] t, int elt) {
        int i = 0;
        while (i < t.length && t[i] != elt) i++;
        return (i < t.length) ? i : -1;
    }

    // Recherche linéaire avec & (non court-circuité)
    static int recherche2(int[] t, int elt) {
        int i = 0;
        while (i < t.length - 1 & t[i] != elt) i++;
        return (t[i] == elt) ? i : -1;
    }

    // Recherche avec boucle for
    static int recherche3(int[] t, int elt) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == elt) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        initTable();
        System.out.println("Tableau généré :");
        afficherTable(table);
        System.out.println();

        System.out.print("Entrez la valeur à chercher : ");
        int x = scanner.nextInt();

        int r1 = recherche1(table, x);
        int r2 = recherche2(table, x);
        int r3 = recherche3(table, x);

        if (r1 != -1) {
            System.out.println("Valeur trouvée à la position (0-based) :");
            System.out.println("Recherche 1 : index " + r1);
            System.out.println("Recherche 2 : index " + r2);
            System.out.println("Recherche 3 : index " + r3);
        } else {
            System.out.println("Valeur non trouvée dans le tableau.");
        }

        scanner.close();
    }
}
