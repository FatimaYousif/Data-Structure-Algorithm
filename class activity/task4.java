import java.util.*;
class Account
{
protected double balance;
Scanner sc=new Scanner(System.in);
public void deposit(double in_amount)
	{
	balance=in_amount;
	}
public void withdraw(double in_amount)
	{
	System.out.println("THE WITHDRAWAL AMOUNT IS="+in_amount);
	System.out.println("THE BALANCE AFTER WITHDRAWAL IS="+(balance-in_amount));
	}
}

class savingAccount extends Account
{
	private double defaultInterestRate=2.5;
	public double interestRate()
	{
	double n=balance+defaultInterestRate*balance; //n=new monthly amount with the interest
	return n;
	}
	public void setDefaultInterestRate(double in_rate)
	{
	defaultInterestRate=in_rate;
	}
	public void applyMonthlyInterest()
	{
	double n=balance+defaultInterestRate*balance; //n=new monthly amount with the interest
	System.out.println("THE amount along with MONTHLY INTEREST IS="+n);
	}
}