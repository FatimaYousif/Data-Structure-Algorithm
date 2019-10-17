import java.util.*;
class Area
{
double len,brea;
	Area(double len,double brea)
	{
	this.len=len;
	this.brea=brea;
	}
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
					Area a=new Area(l,b);
					System.out.println("AREA=" +a.returnArea());
			}
}