//Task 2

//importing util package to use Scanner class
import java.util.*;

class Area
{
double len,brea;

//a setter method to intialize the instance variables
public void setDim(double len,double brea)
	
	{
	this.len=len;
	this.brea=brea;
	}

//this method is to return area in double
	public double area()
	{
	double z=len*brea;
	return z;
	}
}
class AreaEx
{
			public static void main(String args[])
			{
					Scanner sc=new Scanner(System.in);
					Area a=new Area();
					System.out.println("ENTER LENGTH=");
					double l=sc.nextDouble();
					System.out.println("ENTER BREADTH=");
					double b=sc.nextDouble();

 //length and breadth taken from the console are passed as arguments to setter method.
					a.setDim(l,b);

					System.out.println("AREA=" +a.area()); //the area gets printed in double. 
			}
}
