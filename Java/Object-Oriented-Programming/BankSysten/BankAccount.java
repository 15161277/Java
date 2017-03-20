public class BankAccount
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private GregorianCalender dataCreated;
	
	public account()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dataCreated = new GregorianCalendar();
	}
	public account(int id,double balance)
	{
		this.();
		this.id = id;
		this.balance = balance;
	}
	public int getID()
	{
		return this.id;
	}
	public void setId(int newId)
	{
		id = newId;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setBalance(double newbalance)
	{
		balance = newBalance;
	}
	public double getAnnualInterestRate()
	{
		return this.annualInterestRate;
	}
	public GregorianCalendar getdateCreated()
	{
		return dateCreated;
	}
	public void withdraw(double amountWithdraw)
	{
		this.balance -= amountWithdraw;
	}
	public void deposit(double amount)
	{
		this.balance += amount
	}
	public double getMonthlyInterestRate()
	{
		return balance * annualInterestRate / 1200;
	}
}