//MJ Keegan 15170756

public class Course2 
{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	public void Course(String courseName) 
	{
		this.courseName = courseName;
	}   
	
	/** Adds the name of the students to the array of students and increments the number of
		students present */
	public void addStudent(String student) 
	{
		if (numberOfStudents == students.length) 
		{
			String [] temp = students;
			students = new  String [students.length * 2];
			System.arraycopy(temp, 0 , students, 0, numberOfStudents);
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	/** Returns the array of student names */ 
	public String[] getStudents()
	{
		String [] temp = new String[numberOfStudents];
		System.arraycopy(students, 0 , temp, 0, numberOfStudents);
		return temp;
	}
	
	/** Returns the value of the amount of students present */
	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}  
	
	/** Return sa String of the name of a course */
	public String getCourseName() 
	{
		return courseName;
	}  
    
	/** Removes a student fom course */ 
	public void dropStudent(String student) 
	{
		int index = -1;
		for (int i = 0; i < numberOfStudents && index == -1; i++) 
		{
			if (students[i].equals(student))
				index = i;
		}
		if (index != -1) 
		{
			System.arraycopy(students, index + 1, students, index, numberOfStudents - index - 1);
			numberOfStudents--;
		}
	}
	
	/** Removes all students */
	public void clearStudents() 
	{
		students = new String[100];
		numberOfStudents = 0;
	}
}