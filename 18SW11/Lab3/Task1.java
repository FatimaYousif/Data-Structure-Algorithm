

//Linear Search for String and character array

class Search
{
	public static int linear_Search(String[] s, String target)  //method for searching String
	{
		int i;
		boolean result;
		for(i=0;i<s.length;i++)
		{
			if(s[i]==target) 
			{				
				System.out.print(target+" Found at: ");
			    result=true;
				break;
			}
			
		}
		
		return i; //returning positing of searched character
		
	}
	
	public static int char_Search(char[] c, char search) //method for searching character
	{
		int i;
		for(i=0;i<c.length;i++)
		{
			if(c[i]==search)
			{
					System.out.print("Character '"+search+"' found at: ");
					break;
			}
			
		}
		return i; //returning positing of searched character
	}
	
	public static void main(String[] args)
	{
		//char Array
		char[] ch={'a','e','i','o','u'};
		
		//String Array
		String[] str={"Aliza","Rohat","Fatima","Sameera","Alwaz"};
		
		System.out.println(Search.linear_Search(str,"Alwaz"));
		System.out.println(Search.char_Search(ch,'e'));
	}
}
