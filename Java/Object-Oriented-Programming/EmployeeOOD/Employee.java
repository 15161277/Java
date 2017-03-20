public class Employee
{
	private String name =" ";
	private int idnumber = 0;
	private String department = " ";
	private String position =" ";
	
	public Employee (String name, int idnumber, String department, String position)
	{
		this.name = name;
		this.idnumber = idnumber;
		this.department = department;
		this.position = position;
	}
	
	public Employee(String name, int idnumber)
	{
		this.name = name;
		this.idnumber = idnumber;
	}
	
	public Employee()
	{
		
	}
	
	public String toString()
	{
		return this.name + "," + this.idnumber + "," + this.department + "," + this.position;
	}
}