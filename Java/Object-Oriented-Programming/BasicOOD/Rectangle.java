public class Rectangle
{
	public double width;
	public double height;
	public MyDate date;
	
	public double rect()
	{
		width = 1;
		height = 1;
	}
	public double rect(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	public MyDate date(int day, int year, int month)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Rectangle(double width, double height, int day, int month, int year)
	{
		
		this.width = width;
		this.height = height;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public double getArea()
	{
		return (this.height * this.width);
	}
	public double getPerimeter()
	{
		return (2 * (this.height) + (2 * (this.width)));
	}
	public void updateRectangle(double width, double height, MyDate date)
	{
		
	}
}