import java.util.LinkedList;
//Making a Person class
class Person{
	String name;
	int age;
}

//Making a Student class
class Student extends Person{
	String dept;
	int rollno;

	Student(String name, int age, String dept, int rollno){
		this.name=name;
		this.age=age;
		this.dept=dept;
		this.rollno=rollno;
	}
}

class Task1{
	public static void main(String[] args){
		//Objects defined
		Student s1=new Student("Rohat", 19, "Software", 01);
		Student s2=new Student("Muntaha", 19, "Software", 75);
		Student s3=new Student("Alwaaz", 19, "Software", 11);
		Student s4=new Student("Fatima", 19, "Software", 29);

		//Making a LinkedList for Student class.
		LinkedList<Student> list=new LinkedList<Student>();
		
		//add()
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("Objects added. ");

		//size()
		System.out.println("Size of list: "+list.size());

		//addFirst()
		Student s5=new Student("Aliza", 19, "Software", 05);
		list.addFirst(s5);

		//addLast()
		Student s6=new Student("Sameera", 20, "Software", 03);
		list.addLast(s6);

		//peek()
		Student n=list.peek();
		System.out.println("Head: "+n.name);

		//offerFirst()
		Student s7=new Student("Unsa", 20, "Software", 81);
		list.offerFirst(s7);

		//getFirst()
		Student n1=list.getFirst();
		System.out.println("First element: "+n1.name);

		//getLast()
		Student n2=list.getLast();
		System.out.println("Last Element: "+n2.name);

		//Printing the elements of the list.
		System.out.println("\nElements of the list:");
		for(Student i:list)
			System.out.print(i.name+" ");

		//clear()
		list.clear();

		//Printing the elements of the list.
		System.out.println("\n\nElements of the list:");
		for(Student i:list)
			System.out.print(i.name+" ");
	}
}