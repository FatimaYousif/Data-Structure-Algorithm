import java.util.Arrays;
class Task2{
	//Printing method for Character Array.
	public void printArray(char[] arr){
		System.out.println("The character type array is: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

	//Printing method for String Array.
	public void printArray(String[] arr){
		System.out.println("The string type array is: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

	//Binary Search method for Character Array.
	public void binary_Search(char[] arr, char value){
		Arrays.sort(arr); //Sorting the array for proper searching.
		Task2 obj= new Task2();
		System.out.println("Sorted Array:-");
		obj.printArray(arr);

		int size=arr.length;

		int lbound=0;
		int ubound=size-1;

		//Comparisions done on the bases of ASCII values.
		while(true){
			if(ubound<lbound){
				System.out.println("");		
				System.out.println(value+" does not exist.");
				System.out.println("");
				break;
			}

			int midpoint = lbound + (ubound-lbound)/2;

			if(arr[midpoint]<value){
				lbound=midpoint+1;
			}

			else if(arr[midpoint]>value){
				ubound=midpoint-1;
			}

			else if(arr[midpoint]==value){
				System.out.println("");
				System.out.println(value+" found at index: "+midpoint);
				System.out.println("");		
				break;
			}
		}
	}

	//Binary Search method for String Array.
	public void binary_Search(String[] arr, String value){
		Arrays.sort(arr); //Sorting the array for proper searching.
		Task2 obj= new Task2();
		System.out.println("Sorted Array:-");
		obj.printArray(arr);

		int size=arr.length;

		int lbound=0;
		int ubound=size-1;

		//The comparison is based on the Unicode value of each character in the strings.
		while(true){
			if(ubound<lbound){
				System.out.println("");		
				System.out.println(value+" does not exist.");
				System.out.println("");
				break;
			}

			int midpoint = lbound + (ubound-lbound)/2;

			if(arr[midpoint].compareTo(value)<0){ //compareTo() method compares two strings lexicographically.
				lbound=midpoint+1;
			}

			else if(arr[midpoint].compareTo(value)>0){
				ubound=midpoint-1;
			}

			else if(arr[midpoint].equals(value)){ //Like compareTo(), equals() compares two strings, and returns true if equal, and false if not.
				System.out.println("");
				System.out.println(value+" found at index: "+midpoint);
				System.out.println("");		
				break;
			}
		}
	}

	public static void main (String[] args){
		Task2 obj= new Task2();

		char[] charr={'A','n','i','m','e','D','e','m','o','n','S','l','a','y','e','r'};
		String[] starr={"Tanjirou","Nezuko","Zenitsu","Inosuke","Giyuu"};

		obj.printArray(charr);
		System.out.println("\n");		
		obj.binary_Search(charr,'S');
		obj.binary_Search(charr,'a');
		obj.binary_Search(charr,'z');

		System.out.println();

		obj.printArray(starr);
		System.out.println("\n");
		obj.binary_Search(starr,"Tanjirou");
		obj.binary_Search(starr,"Giyuu");
		obj.binary_Search(starr,"Muzan");
	}
}