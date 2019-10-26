import java.util.*;
class Avg
{
	static float avg()
	{
		int[] arr=new int[50];
		float avg=0f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter Elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		   avg+=arr[i];
		   
	    }
		return avg/size;
	}
}

class AvgDemo
{
	public static void main(String[] args)
	{
        System.out.println("Average of Elements in array: "+Avg.avg());	
	}
}