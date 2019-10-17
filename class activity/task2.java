import java.util.*;
class Area
{
double len,brea;
public void setDim(double len,double brea)
	
	{
	this.len=len;
	this.brea=brea;
	}
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
					a.setDim(l,b);
					System.out.println("AREA=" +a.area());
			}
}