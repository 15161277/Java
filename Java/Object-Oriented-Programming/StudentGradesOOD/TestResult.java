public class TestResult
{
	private double[] testScore = new double[3];
	
	
	public void setScore(int i, double value)
	{
		testScore[i] = value;
	}
	
	public double getScore(int i)
	{
		return testScore[i];
	}
	
	public double getAverage()
	{
		double total = getTotal ();
		return (total / 3);
	}
	
	public double getTotal()
	{
		double total = 0;
		for(int i = 0; i < 3; i++)
		{
			total = testScore[i] + total;
		}
		
		return total;
	}
	
	public String getGrade()
	{
		int[] scores = {0,1,30,35,40,48,52,56,60,64,72,80};
		String[] grades = {"NG","F","D2","D1","C3","C2","C1","B3","B2","B1","A2","A1"}; 
		String result = "";
		for(int x=0; x<scores.length;x++)
		{
			if(testScore[x] < scores[x])
			{
				result = grades[x-1];
			}
		}
		
		return result;
	}
}