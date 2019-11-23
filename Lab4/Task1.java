import java.util.*;

class Person
{
	String name,rollno;
}

class Student extends Person
{
	
	public static void main(String[] args)
	{
		//Creating linkedlist
		LinkedList <String> ls =new LinkedList<>();
		
		ls.add("18SW11");
		
		ls.addFirst("Alwaz"); //insert specified element at first in the list.
		
		ls.addLast("Software Engineering");  //insert specified element at last in the list.
		
		System.out.println("Name: "+ls.element()); //retrieves the first element from list.
		
		System.out.println("Rollno: "+ls.get(1)); //returns the element at specified position
		
		System.out.println(ls.contains("Alwaz")); //return true if specified element is present in list.
		
		System.out.println("Add At last: " +ls.offer("Batch 18")); //retrieves the first element from list.
	    
		System.out.println(ls.getFirst()); //returns first element from list.
		
		System.out.println(ls.indexOf("18SW11")); //retuns index of specified element.
		
		System.out.println(ls.poll()); //retrieves and removes the head.
		
		
		System.out.println("Student Data: "+ls); //Displaying List.
		
		
	}
}