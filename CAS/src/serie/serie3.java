package serie;

import java.util.Scanner;

public class serie3 {

	public static void main(String[] args) {
		
		Scanner nombre = new Scanner(System.in); 
		
		
		System.out.println("Entrez un nombre : ");
		double A = nombre.nextDouble();
		
		System.out.println("Entrez un nombre : ");
		double B = nombre.nextDouble();
		
		System.out.println("Entrez un nombre : ");
		double C = nombre.nextDouble();
		
		if (A == 0) {
			if (B == 0) {
				if (C == 0) {
					System.out.println("Tout réel est la solution.");
				}
					else {
						System.out.println("Solution impossible.");
					}
			}
				else {
					double X1 = -C/B;
					System.out.println(X1);
				}
			}

			else {
				double delta = B*B -4*A*C;
				if (delta < 0) {
					System.out.println("Solution impossible");
				}
					else {
						if (delta == 0) {
							double X1 = - B / (2*A) ;
							System.out.println(X1);
						}
							else {
								double X1 = (-B + Math.sqrt(delta))/(2 * A);
								double X2 = (-B - Math.sqrt(delta))/ (2* A);
								System.out.println(X1);
								System.out.println(X2);
							}
						
					}
				}
			}
}
					
	

