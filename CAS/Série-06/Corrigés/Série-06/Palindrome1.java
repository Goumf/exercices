public class Palindrome1
{
	
	public static void main(String[] argv)
	{
		String entree;
		String resultat;
		
		if(argv.length > 0)
		{
			entree = argv[0];
			resultat = inverse(entree);
			System.out.println("L'entree est : " + entree + "\n");
			System.out.println("L'inverse de " + entree + " est " + resultat);
			
			if(entree.equals(resultat))
			{
				System.out.println(entree + " est un palindrome");
			}
			else
			{
				System.out.println(entree + " n'est pas un palindrome");
			}
		}
		else
		{
			System.out.println("Erreur");
		}

		System.out.println();
	}
	
	static String inverse(String s)
	{
		char[] envers;
		int j;
		
		envers = new char[s.length()];
		j = s.length()-1;
		
		for(int i = 0; i < s.length(); i++)
		{
			envers[i] = s.charAt(j);
			j--;
		}
		return new String(envers);
	}
}
