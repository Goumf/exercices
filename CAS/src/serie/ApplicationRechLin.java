package serie;

import java.util.Scanner;

public class ApplicationRechLin {

	static int max = 20;
	
	static int[] tableau = new int[max];
	
	static Scanner scan = new Scanner(System.in);
	
	
	static void AfficherTable (int[ ] t ) {
	
		// Affichage du tableau
		
		int n = t.length;
		
		for (int i = 0; i < n ; i++) {
			System.out.println(t[i] + " , ");
		
		System.out.println();
		
		}
		
	}
	static void initTable ( ) {
		
		// Remplissage automatique du tableau
		
		int n = tableau.length;
		
		for (int i = 0; i < n; i++) {
			tableau[i] = (int) (Math.random() * 100);
		}
	
	}
	static int RechSeq1( int[ ] t, int elt ) {
		
		int i = 0;
		int rang1 = -1;
		
		
		while ( i < t.length) {
			if (t[i] == elt) {
				
				System.out.println("L'élement " + elt + " se trouve au rang " + i);
				rang1 = i;
				return rang1;
			}
			else {
					i = i+1;
		
				}
		}
		System.out.println("L'élement " + elt + "n'est pas dans la liste.");
		return rang1;
		
				}
		
		
		
	
	/*static int RechSeq2( int[ ] t, int elt ) {
		
	}
	static int RechSeq3( int[ ] t, int elt ) {
		
	}*/
	public static void main(String[] args) {
		
		initTable();
		System.out.println("Tableau initial : ");
		AfficherTable(tableau );
		int rang1; //rang2, rang3;
		System.out.println("Entrez un nombre : ");
		int input = scan.nextInt();
		
		rang1 = RechSeq1 (tableau, input);
	}
	}


