 /*************************************************************************
  *
  * Classe utilitaire : SimpleDataInput.
  * Cette classe implemente des entrees-sorties simples sur un InputStream,
  * soit par exemple System.in.
  * En pratique, il est rare, en Java, (et d'une maniere generale, d'ailleurs)
  * d'utiliser la console pour des entrees-sorties, sinon dans les milieux
  * academiques. Cette classe peut vous etre utile pour d'autres petits
  * programmes que l'on vous demanderait de faire comme exercices.
  * Cette classe impose l'importation explicite d'un paquetage,
  * qui est java.io. On importe le package entier avec la syntaxe java.io.*.
  * Vous pouvez facilement extraire cette classe de ce fichier, et en faire
  * une classe utilitaire pour vos besoins.
  *
  *************************************************************************/
import java.io.*;

public class SimpleDataInput
{
   // Les méthodes sont toutes statiques : ceci provient du
   // fait qu'il s'agit d'un code purement algorithmique,
   // le lier à une instance n'apporte rien. Au contraire,
   // cela peut nuire à la compréhension du code.
   
    static final private int size = 20;
    static InputStream in = System.in;
    
    public static String readString()
    {
	    byte[] inBuf = new byte[size];
	    int count = 0;
	    for (int i = 0; i < size; i++) inBuf[i] = 0x0;
	    try 
    	{                           
     		count = in.read(inBuf);
	    }
    	// Une exception doit être traitée; même si nous ne
    	// savons pas encore exactement comment faire, le code
    	// suivant correspond au bloc try précédent.
    	catch(Exception e) 
    	{
    		System.out.println("Erreur E/ S");
    		e.printStackTrace();
    	}
    	// Discard CR/LF :
    	String s = new String(inBuf, 0, count - 2);
    	return s;
    }

    public static double readDouble() 
    {
    	Double d = Double.parseDouble(readString());
    	return d.doubleValue();
    }

    public static int readInt() 
    {
    	Integer d = Integer.parseInt(readString());
    	return d.intValue();         
    }
    public static long readLong() 
    {
    	Long d = Long.parseLong(readString());
    	return d.longValue();         
    }

    public static float readFloat() 
    {
    	Float d = Float.parseFloat(readString());
    	return d.floatValue();         
    }
    
    public static char readChar()
    {
    	String d = readString();
    	return d.charAt(0);
    }
}
