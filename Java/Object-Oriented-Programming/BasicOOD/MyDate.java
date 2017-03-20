public class MyDate
{
	public int day;
	public int month;
	public int year;
	
	public MyDate()
	{
		day = 1;
		month = 1;
		year = 2016;
	}
	public MyDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDate()
	{
		return this.day;
	}
	
	
	
}