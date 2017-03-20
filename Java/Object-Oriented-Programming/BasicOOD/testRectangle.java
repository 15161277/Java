public class testRectangle
{
	public static void main(String[] args)
	{
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(26,9,2016);
		Rectangle rect1 =  new Rectangle(5,4);
		Rectangle rect2 = new Rectangle(10,12,23,9,2016);
		double area = rect2.getArea();
		rect1.updateRectangle(20,10,date2);
	}
}