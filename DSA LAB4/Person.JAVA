import java.util.*;
class Person
{
    Person()
    {
        String name="Sameera";
    }
}

class StudentTask1 extends Person{
  public static void main(String[] args) {
    LinkedList<String>obj=new LinkedList<String>();
    System.out.println("Student:"+ obj.add("18SW03"));
    System.out.println("Size:"+ obj.size());
    System.out.println("Roll no:"+ obj.getFirst());
    System.out.println("Last:"+ obj.getLast());
    System.out.println(" "+obj.peek());
    System.out.println(" "+obj.pop());
    System.out.println(" "+obj.offerFirst("Sameera"));
    System.out.println(" "+obj.offerLast("Software"));
    System.out.println(" "+obj.pollFirst());
    System.out.println(" "+obj.pollLast());

    
  }
}