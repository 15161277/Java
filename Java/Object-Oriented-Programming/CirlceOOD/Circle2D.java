public class Circle2D
{
	private double x;
	private double y;
	private double radius;
	
	public Circle2D()
	{
		this.x = 0.0;
		this.y = 0.0;
		this.radius = 1.0;
	}
	
	public Circle2D(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double getArea()
	{
		return (3.14 * ((this.radius) * (this.radius)));
	}
	public double getPerimeter()
	{
		return (2 * (3.14 * (this.radius)));
	}
	public boolean contains(double x1, double x2)
	{
		MyPoint p = new MyPoint(x,y);
		return (p.distance(x1, x2) < radius);
		/*ouble d;
		d =  Math.sqrt(Math.hypot(x - this.getX(), y - this.getY()));
		if (d < radius)
		{
			return true;
		}
		else
		{
			return false;
		}*/
		
	}
	public boolean contains(Circle2D circle)
	{
		double x1 = circle.getX();
		double y1 = circle.getY();
		double r = circle.getRadius();
		double d = Math.sqrt(Math.hypot(x - this.getX(), y - this.getY()));
		if((d + radius) < r)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean overlaps(Circle2D circle)
	{
		double x1 = circle.getX();
		double y1 = circle.getY();
		double r = circle.getRadius();
		double d =  Math.sqrt(Math.hypot(x - this.getX(), y - this.getY()));
		if (d < (r + radius))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public String toString() 
	{
		return "Circle[radius=" + radius + "]";
	}
	
	
}
