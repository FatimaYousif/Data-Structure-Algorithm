

//Binary Search for Character and String Arrays

class Search
{
	public static int binary_Search(String[]  s, String x) //method for searching string
	{
		 int l = 0, r = s.length - 1; 
        while (l <= r) { 
            int midpoint = l + (r - l) / 2; 
  
            int res = x.compareTo(s[midpoint]); 
  
            // Check if x is present at mid 
            if (res == 0) 
			{System.out.print(x+" Found at: ");
			return midpoint;} 
  
            // If x greater, ignore left half 
            if (res > 0) 
                l = midpoint + 1; 
  
            // If x is smaller, ignore right half 
            else
			r = midpoint - 1; 
        } 
  
        return -1; 
		
		
		
		
	}
	
	public static int char_search(char[] c, char find) //method for searching character
	{
        int l = 0;
        int n = c.length - 1;

         while (l <= n) {
        int midpoint = (l + n) >>> 1;
        char midVal = c[midpoint];

        if (midVal < find)
            l = midpoint + 1;
        else if (midVal > find)
            n = midpoint - 1;
        else
		{System.out.print("'"+find+"' found at: ");
		return midpoint;} // key found
    }
    return -(l + 1);  // key not found.

	}
         public static void main(String[] arg)
		{
			char[] C={'a','b','c','d','e','f'};
			String[] A={"Alwaz","Fatima","Rohat","Sammera","Aliza"};
			System.out.println(Search.binary_Search(A,"Alwaz"));
			System.out.println(Search.char_search(C,'d'));
					
		}
  
  
  
	
}