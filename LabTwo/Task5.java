import java.util.Scanner;
	public class Task5{  

		
		
		void secondlargest(int[] a) 
		{
       
			int Largest = 0;
			int SecondLargest = 0;
			int Index_Of_SecondLargest = 0;
			
			for(int i=0; i<a.length; i++)
			{
				if(a[i] > Largest )
				{
					SecondLargest = Largest;
					Largest = a[i];
					Index_Of_SecondLargest = i-1;
				}
				else if(a[i] > SecondLargest && a[i] < Largest)
				{
					SecondLargest = a[i];
					Index_Of_SecondLargest = i;
				}
			}
			
			System.out.println("Second Largest Element is: " + SecondLargest);
			System.out.println("It was found on Index Number " + Index_Of_SecondLargest + " Of Array");
			
		}
		
		public static void main (String[] args){  
	
			Task5 ClsObj = new Task5();
			Scanner obj=new Scanner(System.in);

	        System.out.print("Enter the size of array: ");
	        int size = obj.nextInt();
	
	        int[] array = new int[size];
	        
	        System.out.println("Enter elements: ");
	        for(int i= 0; i<size; i++ )
	        {
	        	System.out.println("Element # "+ (i+1) + " :");
	             array[i] = obj.nextInt();	
	        }
	        
	        ClsObj.secondlargest(array); 
		
	}
		}
