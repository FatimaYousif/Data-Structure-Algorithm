
//BINARY SEARCH

class BinSearchString
{
		public void binary_Search()
		{
		String a[]={"drake","post malone","tyga","kylie","travis"};
		int size=a.length;
		String x="drake";
		int lb=0;
		int ub=a.length-1;
			
		//first display
		System.out.println("THE ARRAY ELEMENTS ARE= ");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]+" ");
		}
		
		System.out.println();
	
		while(true)
		{
		if(ub<lb)
		{
		System.out.print(x+ " not found");
		break;
		}
		int mp=(ub-lb)/2;
		
		if(a[mp].compareTo(x)<0)
		lb=mp+1;
		else if(a[mp].compareTo(x)>0)
		ub=mp-1;
		else if(a[mp].equals(x))
		{
		System.out.print(x+ " found at location "+mp);
		break;
		}
		}
		}
		
}

class BinSearchChar
{
		public void binary_Search()
		{
		//for character's array
		char a[]={'d','p','t','k','t'};
		int size=a.length;
		char x='t';
		int lb=0;
		int ub=a.length-1;
			
		//first display
		System.out.println("THE ARRAY ELEMENTS ARE= ");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]+" ");
		}
		
		System.out.println();
	
		while(true)
		{
		if(ub<lb)
		{
		System.out.print(x+ " not found");
		break;
		}
		int mp=(ub-lb)/2;

		if(a[mp] <x)
		lb=mp+1;
		else if(a[mp] >x)
		ub=mp-1;
		else if(a[mp]==x)
		{
		System.out.print(x+ " found at location "+mp);
		break;
		}
		}
		}
		
}

class Two
{
	public static void main(String args[])
	{	
	//binary search  for strings
	
	BinSearchString s=new binSearchString();
	s.binary_Search();
	
	System.out.println();
		
	//binary search  for char
	BinSearchChar c=new binSearchChar();
	c.binary_Search();
		
	}
}