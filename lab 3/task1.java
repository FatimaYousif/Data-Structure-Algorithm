//LINEAR SEARCH

class One
{
	public static void main(String args[])
	{
	//for string's array
	String a[]={"drake","post malone","tyga","kylie","travis"};
	String find="kylie";
	
	//first display
		System.out.println("THE ARRAY ELEMENTS ARE= ");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]+" ");
		}
		
		System.out.println();
		
	//linear search  for strings
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==find)
		{
		System.out.println("linear search for "+find+" is on "+i +" index");
		break;
		}
		
	}
	
	//for character's array
	char b[]={'d','p','t','k','t'};
	char find2='p';
	
	//first display
		System.out.println("THE ARRAY ELEMENTS ARE= ");
		for(int i=0;i<b.length;i++)
		{
		System.out.println(b[i]+" ");
		}
		
		System.out.println();
		
	//linear search  for strings
	for(int i=0;i<b.length;i++)
	{
		if(b[i]==find2)
		{
		System.out.println("linear search for "+find2+" is on "+i +" index");
		break;
		}
		
	}
	
		
	}
}