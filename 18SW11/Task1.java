import java.util.*;
class MyArray
{
	public static void main(String[] args)
	{
		int[] arr=new int[100]; //Declaration of Array
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter Elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	}
}
