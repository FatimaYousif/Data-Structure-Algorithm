//task 4

class Account
{
protected double balance;

//deposit method to set the amount in parameter to balance aka the instance variable
public void deposit(double in_amount)
	{
	balance=in_amount;
	}

//withdraw method shows the withdrawal amount and the balance left after withdrawal
public void withdraw(double in_amount)
	{
	System.out.println("THE WITHDRAWAL AMOUNT IS="+in_amount);
	System.out.println("THE BALANCE AFTER WITHDRAWAL IS="+(balance-in_amount));
	}
}

// a child class of Account class(parent class)
class savingAccount extends Account
{
	private double defaultInterestRate=2.5;

//method that returns the new balance after the added interest.
	public double interestRate()
	{
	double n=balance+defaultInterestRate*balance; //n=new monthly amount with the interest
	return n;
	}

//method to change the interest rate and re-setting it to the value passed as the parameters.
	public void setDefaultInterestRate(double in_rate)
	{
	defaultInterestRate=in_rate;
	}

//Shows the Balance after the monthly interest is applied to the balance
	public void applyMonthlyInterest()
	{
	double n=balance+defaultInterestRate*balance; //n=new monthly amount with the interest
	System.out.println("THE amount along with MONTHLY INTEREST IS="+n);
	}
}
