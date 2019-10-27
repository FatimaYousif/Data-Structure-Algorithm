import java.util.*;
class Three
{
	public static void main(String arg[])
	{
	//array of double values
	double a[]={12.3, 3.47, 5.6, 4.8, 9.0};
	
	//SORT METHOD : SORTS THE ARRAY IN EITHER ASCENDING OR DESCENDING ORDER
	Arrays.sort(a);
	
	//toString METHOD : CONVERTS THE ARRAY INTO STRING and that is later to be displayed
	System.out.print(Arrays.toString(a));
	
	
	System.out.println();
	
	//binarySearch method : searches for the specific element from a SORTED ARRAY and returns INDEX
	System.out.println(Arrays.binarySearch(a,3.47));    //at 0 index after the array is sorted
	
	//for the element that doesn't exist in the array
	System.out.println(Arrays.binarySearch(a,2));    //at -ve index after the array is sorted because the element is not present
	
 	//EQUALS METHOD
	double b[]={5.5, 3.47, 3.6, 0.8, 4.0};
	System.out.println(Arrays.equals(a,b));			//as a and b are unequal so FALSE WOULD BE PRINTED 
	
	//FILL METHOD
	double d[]=new double[5];
	Arrays.fill(d,4.4);
	
	System.out.print(Arrays.toString(d));
	
	System.out.println();
	
	//copyOf METHOD
	double copy[]=new double[5];
	copy=Arrays.copyOf(a,4);
	
	System.out.print(Arrays.toString(copy));
	System.out.println();
	
	//copyOfRange METHOD
	double copyor[]=new double[5];
	copyor=Arrays.copyOfRange(a,3,5);
	
	System.out.print(Arrays.toString(copyor));
	System.out.println();
	
	
	
	}
}