import java.util.Arrays;
class MyArray
{
	public static void main(String args[])
	{
		//Declared and defined two Arrays
		int[] arr={100,200,300,500,400};
		int[] arr1={100,200,300,500,400};
		
		//method for checking equality of Arrays.
		System.out.println("Equals Method in Array\n");
		boolean retval=Arrays.equals(arr,arr1);
		System.out.println("Array1 and Array2 are equal= "+retval);
	}
}