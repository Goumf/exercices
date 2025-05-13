package serie;

import java.util.Scanner;



public class valabsol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);  // méthode native de Java qui permet de lire les saisies claviers de l'utilisateur  

        System.out.print("Entrez un nombre x = ");  // pour afficher le texte (comme input)
        double x = scanner.nextDouble();            // input (Double c'est une sorte de chiffre) - entrer un chiffre

        if (x >= 0) {
            System.out.println("|x| = " + x);
        } else {
            System.out.println("|x| = " + (-x));
        }

        scanner.close();
    }
}
