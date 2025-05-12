public class Test
{
	
  public static void main(String[] args)
  {
    Figure f1, f2, f3;
    f1 = new Triangle(10, 15);
    f2 = new Rect(20, 30);
    f3 = new Ellipse(30, 35);
    System.out.println("Surface du triangle : " + f1.surface());
    System.out.println("Surface du rectangle : " + f2.surface());
    System.out.println("Surface de l'ellipse : " + f3.surface());
  }
}
