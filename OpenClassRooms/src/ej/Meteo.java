package ej;

public class Meteo {

	
	public static void main(String[] args) {
		Meteo.tempsJour("");
	}
	
	public static void tempsJour(final String meteo) {
		switch(meteo) {
		case "soleil" -> System.out.println("Il va faire beau.");
		case "pluie" -> System.out.println("Il va pleuvoir");
		case "nuage" -> System.out.println("Temps nuageux.");
		default -> System.out.println("Je ne sais pas.");
		}
	}
	
}
