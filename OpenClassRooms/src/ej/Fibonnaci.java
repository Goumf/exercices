package ej;

import java.util.Scanner;

public class Fibonnaci {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez un nombre entier : ");
		int entierMax = scanner.nextInt();
		
		String number = Fibonnaci.fibonnaci(entierMax);
		
		System.out.println(number);
			
		}

		
		
	public static String fibonnaci(final int entierMax) {
		
		int lastNumber = 0 ;
		int newNumber = 1 ;
		String list = "";
	
		while(newNumber <= entierMax) {
			list += lastNumber + " ";
			newNumber = lastNumber + newNumber;
			lastNumber = newNumber;
			
		
		}
		return list;
	
	}

}
