package ej;

public class Film {

	public static void main(String[] args) {
		System.out.println(Film.categorieDeFilm("Star Wars"));

	}
	public static String categorieDeFilm(final String film) {
	    String resultat = switch(film) {
        	case “Star Wars” -> “Science fiction”;
        	case “Blanche neige”, “La petite sirène” -> “Disney”;
        	case “Indiana Jones” -> {
        		String categorie = “Aventure”;
        		yield categorie;
	        }
	        default -> “Inconnu”;
	    };
	    return resultat;
	}
}
