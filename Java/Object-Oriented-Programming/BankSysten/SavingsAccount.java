public class SavingsAccount extends BankAccount
{
	public SavingsAccount()
	{
		Super()
	}
	public SavingsAccount(int iD, double balance)
	{
		Super(iD, balance);
	}
	public void Withdraw(double ammount)
	{
		double overdraftLimit = 0;
		 public void withdraw (double w) {
            if (balance - w < overdraftLimit)
                    System.out.println("You don't have enough money, fool.");
            else
                balance = balance - w;
        }
	}
}