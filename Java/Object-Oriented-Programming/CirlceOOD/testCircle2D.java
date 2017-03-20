public class testCircle2D
{
	public static void main(String [] args)
	{
		Circle2D c1 = new Circle2D();
		Circle2D c2 = new Circle2D();
		System.out.println(c1.contains(1, 2));
		System.out.println(c1.contains(c2));
		System.out.println(c2.overlaps(new Circle2D(4,5,6)));
		System.out.println(c1);
		System.out.println(c1.toString());

		
	}
}