package ej;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int somme = Addition.addition(6, 8);                               /*il s'agit d'attribuer la valeur int retournée à une variable
																		     et d'afficher la variable dans la console*/
		
		System.out.println(somme);
	}
	
	public static int addition(final int entier1, final int entier2) {
		return entier1 + entier2;                                           //la fonction va me retourner une valeur int
	}

}
