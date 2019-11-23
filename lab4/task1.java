import java.util.*;
class person
{
	int age;
}
class student extends person
{
 String name;
public student(String name)
{
	this.name=name;
}
}
class toneEx
{
		public static void main(String args[])
		{
		student s1=new student("fatima");
		student s2=new student("ahmad");
		student s3=new student("sehrish");
		
		LinkedList<student> l=new LinkedList<student> ();
		
		//add
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		//peek
		student as=l.peek();
		System.out.println("top= " +as.name);  		//maryam
		
		//remove
		l.remove();   		//1st element=fatima removed
		
		//addFirst 
		student s4=new student("tahir");
		l.addFirst(s4);   
		
		//addLast
		student s5=new student("dua");
		l.addLast(s5);
 		
		//size()
		System.out.println("size= "+l.size());
		
		//get
		student s=l.get(2);
		System.out.println("get the 2nd element: "+s.name);		//sahiba
		
		//getLast
		student last=l.getLast();
		System.out.println("get the last element: "+last.name);		//sahiba
			
		//addAll
		LinkedList<student> newl=new LinkedList<student> ();
		newl.addAll(l);
		//print them
		for(student ss:l)
		System.out.print(ss.name+" ");
	
		
		//clear
		l.clear();
	
		//for (int i: arr)
		for(student ss:l)
		System.out.println(ss.name+" ");
	
		}
}