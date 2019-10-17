
class Employee
{
int salary;
int hours;
public void getInfo(int salary,int hours)
{
this.salary=salary;
this.hours=hours;
}
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
		salary=salary+5;
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
	e.getInfo(20000,20);
	e.display();
	//for less than 500 salary
	e.getInfo(2,20);
	e.AddSal();
	e.display();
	}
}