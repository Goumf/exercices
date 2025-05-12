import java.util.Scanner;

public class Palindrome2 {

    public static void main(String[] argv) {
        Scanner entree = new Scanner(System.in); 

        System.out.print("Entrez une chaine : ");
        String chaine = entree.nextLine();

        if (chaine.length() > 0) {
            String resultat = inverse(chaine);

            System.out.println("L'entree est : " + chaine);
            System.out.println("L'inverse de \"" + chaine + "\" est \"" + resultat + "\"");

            if (chaine.equals(resultat)) {
                System.out.println("\"" + chaine + "\" est un palindrome");
            } else {
                System.out.println("\"" + chaine + "\" n'est pas un palindrome");
            }
        } else {
            System.out.println("Erreur : chaine vide");
        }

        entree.close();
    }

    static String inverse(String s) {
        char[] envers = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            envers[i] = s.charAt(s.length() - 1 - i);
        }
        return new String(envers);
    }
}
