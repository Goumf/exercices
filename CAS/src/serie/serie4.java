package serie;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class serie4 {

	public static void main(String[] args) {
		
		
		int nbrPlaceTableau = 20;
		
		int saisie = 0;
		
		boolean dansTableau = false; 
		
		int[] tableauEntier = new int[nbrPlaceTableau];
		
		Random rand = new Random();
		
		for (int i = 0; i < nbrPlaceTableau; i ++) {
			tableauEntier[i] = rand.nextInt(100);
		}
		
		Scanner entree = new Scanner(System.in) ;
		System.out.println(Arrays.toString(tableauEntier));	
		
		while (dansTableau == false) {
			
			System.out.println("Entrez un nombre entier : ");
			saisie = entree.nextInt();
			
					
			for (int i = 0; i < tableauEntier.length; i ++) {
				if (tableauEntier[i] == saisie) {
					dansTableau = true;
					break;
				}
				else {
						continue;
					}
					}
				}
				
		if (dansTableau) {
			System.out.println("La valeur " + saisie + " est dans le tableau.");
			}
		else {
			System.out.println("La valeur " + saisie + " n'est pas dans le tableau.");
			}
		
		
		
		System.out.println(saisie);
		
		
	}
	
	}



