public class Exemple02
{
	
	public static void main(String[] arg) 
	{
		// main est un membre statique !
   		System.out.print("Entrer un double : ");
   		// Appel d'une méthode statique dans une autre classe :
   		double x = SimpleDataInput.readDouble();

   		System.out.print("Entrer un long : ");
   		// Appel d'une méthode statique dans une autre classe :
   		long y = 0;
   		try
   		{
   			y = SimpleDataInput.readLong();
   		}
   		catch(Exception e)
   		{
   			System.out.println("Erreur dans la lecture d'un long");
   		}

   		System.out.print("Entrer un int : ");
   		// Appel d'une méthode statique dans une autre classe :
   		int z = SimpleDataInput.readInt();

   		System.out.print("Entrer un float : ");
   		// Appel d'une méthode statique dans une autre classe :
   		float w = SimpleDataInput.readFloat();

   		System.out.print("Entrer un char : ");
   		// Appel d'une méthode statique dans une autre classe :
   		char c = SimpleDataInput.readChar();

   		System.out.print("Entrer un String : ");
   		// Appel d'une méthode statique dans une autre classe :
   		String s = SimpleDataInput.readString();

   		System.out.println(x);
   		System.out.println(y);
   		System.out.println(z);
   		System.out.println(w);
   		System.out.println(c);
   		System.out.println(s);
   }
}
