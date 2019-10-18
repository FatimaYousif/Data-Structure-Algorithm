//Task 1
class Employee
{
int salary;
int hours;
//a function to set the values passed as paramaters

public void getInfo(int salary,int hours)
{
this.salary=salary;
this.hours=hours;
}

//method to work on the salary

public void AddSal()
{

	if(salary<500)
	{
		salary=salary+10;
	}
}
public void AddWork()
{
	if(hours>6)
		salary=salary+5;  //if hours are greater than 5 the salary gets incremented by 5
}

			public void display()
			{
				System.out.println("FINAL SALARY="+salary+" "+hours);
			}

}
class EmployeeEx
{
	public static void main(String args[])
	{
	Employee e=new Employee();
        //passing the salary and hours as the arguments
	e.getInfo(20000,20);
	e.display();
	// CHECKING for less than 500 salary
	e.getInfo(2,20);
	e.AddSal();
	e.display();
	}
}
