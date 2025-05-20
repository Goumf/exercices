package serie;

import java.util.Arrays;

public class serie5 {

	static int[] tableau;
	
	public static void main(String[] args) {
		
		afficheTableau(3);
		attribuValeurTableau(3);
	}
	
	public static int[] initTableau(final int nbrCellule) {
		
		int[] tableau = new int[nbrCellule];
		
		for (int i = 0 ; i < tableau.length; i++) {
			tableau[i] = i;
		}
	return tableau;
	}
	
	public static void afficheTableau(final int nbrCellule) {
		
		System.out.println(Arrays.toString(initTableau(nbrCellule)));
	}
	
	public static int[] attribuValeurTableau(final int nbrCellule) {
		initTableau(3);
		tableau[tableau.length] = 1;
				
	
	return tableau;

}

}
