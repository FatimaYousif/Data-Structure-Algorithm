class Task1{
	//Printing method for Character Array.
	public void printArray(char[] arr){
		System.out.println("The character type array is: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}

	//Printing method for String Array.
	public void printArray(String[] arr){
		System.out.println("The string type array is: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}

	//Linear Search method for Character Array.
	public int linearSearch(char[] arr, char value){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == value )
				return i; //Returns index where value is found.
		}
		return -arr.length; //Returns a negative number to show that value does not exist.
	}

	//Linear Search method for String Array.
	public int linearSearch(String[] arr, String value){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == value )
				return i; //Returns index where value is found.
		}
		return -arr.length; //Returns a negative number to show that value does not exist.
	}

	public static void main (String[] args){
		Task1 obj= new Task1();

		char[] charr={'A','n','i','m','e','D','e','m','o','n','S','l','a','y','e','r'};
		String[] starr={"Tanjirou","Nezuko","Zenitsu","Inosuke","Giyuu"};

		obj.printArray(charr);
		System.out.println("'S' is at index: "+obj.linearSearch(charr,'S'));
		System.out.println("'a' is at index: "+obj.linearSearch(charr,'a'));
		System.out.println("'z' is at index: "+obj.linearSearch(charr,'z'));

		System.out.println();

		obj.printArray(starr);
		System.out.println("'Tanjirou' is at index: "+obj.linearSearch(starr,"Tanjirou"));
		System.out.println("'Giyuu' is at index: "+obj.linearSearch(starr,"Giyuu"));
		System.out.println("'Muzan' is at index: "+obj.linearSearch(starr,"Muzan"));
	}
}