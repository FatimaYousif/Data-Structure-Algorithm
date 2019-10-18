//task 3

import java.util.*;
class Area
{
double len,brea;

//constructor to initalize the data members
	Area(double len,double brea)
	{
	this.len=len;
	this.brea=brea;
	}
//returnArea method that returns area of rectangle in double
	public double returnArea()
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
					System.out.println("ENTER LENGTH=");
					double l=sc.nextDouble();
					System.out.println("ENTER BREADTH=");
					double b=sc.nextDouble();
					Area a=new Area(l,b);   //length and breadth taken as i/p are passed as constructor's arguments.
					System.out.println("AREA=" +a.returnArea());  // area gets printed 
			}
}
