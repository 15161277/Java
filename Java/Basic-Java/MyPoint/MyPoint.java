public class MyPoint
{
	public double x;
	public double y;
	public MyPoint()
	{
		x = 0;
		y = 0;
	}
	public MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public double distance(MyPoint point)
	{
		double distance;
		distance =  Math.sqrt(Math.hypot(x - this.getX(), y - this.getY())); 
		return distance;
		
	}	
	public double distance(double x, double y)
	{
		return Math.hypot(x - this.getX(), y - this.getY()); 
	}
}
	
	
	
