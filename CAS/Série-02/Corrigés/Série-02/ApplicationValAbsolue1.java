// Implantation en Java avec un if ... else

public class ApplicationValAbsolue1
{
	
	public static void main(String[] args)
	{
		float x = 6;
		System.out.println("Avec un if ... else");
		System.out.print("Entrer un nombre x : ");
		x = SimpleDataInput.readFloat();
		if(x < 0)
		{
			System.out.println("|x| = " + (-x));
		}
		else
		{
			System.out.println("|x| = " + (x));
		}
	}
}