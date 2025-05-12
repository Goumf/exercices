package ej;

public class Affiche {

	public static void main(String[] args) {
		int somme = Affiche.addition(2, 3);
		System.out.println(somme);
		
		int produit = Affiche.multiplication(5, 8);
		System.out.println(produit);

	}
	public static int addition(final int entier1 , final int entier2) {
		return entier1 + entier2; 			
				
	}
	
	public static int multiplication(final int entier2 , final int entier3) {
		return entier2 * entier3;
	}
}