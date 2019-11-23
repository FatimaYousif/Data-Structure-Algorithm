class Node
{
int data;
Node next;
	Node(int data)
	{
	this.data=data;
	}
}
class LinkedList
{
	Node start;
	
	//inserting in the end of the linked list
	public void insert(int data)
	{
	Node n=new Node(data);
	if(start==null)
		start=n;
	else
	{
	Node s=start;
	while( s.next != null)
	{
		s=s.next;
	}
	n.next=s.next;
	s.next=n;
	}
	}
	
	//inserting at start
	public void insertAtstart(int data)
	{
	Node n=new Node(data);
	n.next=start;
	start=n;
	}

	//insertion in any position in the linkedlist	
	public void insertAnywhere(int data,int index)
	{
	Node p=start;
	Node n=new Node(data);
	if(index==0)
	{
		insertAtstart(data);
	}
	else{
		for(int i=0;i<index-1;i++)
			{
			p=p.next;
			}
			n.next=p.next;
			p.next=n;
	}
	}
	
	//deletion from anywhere of the linked list
	 public void deleteAnywhere(int index)
	{
		Node n=start;
	for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
			n.next=n.next.next;
	}
	 
	 
	//deletion in the start of linked list
	 public void deleteAtStart()
	{
		start=start.next;
	}
	
	//deletion in the end of linked list
	 public void deleteAtEnd()
	{
		Node p=start;
		Node toBeLast=start; 	//the second last node
		while(p.next != null)
		{
			toBeLast=p;			//before actually incrementing the node to last so to make it SECOND LAST node and assign it in the toBeLast node
			p=p.next;
		}
		toBeLast.next=null;
	}
	
	//to display elements in the linked list 
	public void show()
	{
	for(Node p=start; p != null; p=p.next)
	System.out.print(p.data+ " ");
	}
}
class LinkedListEx
{
	public static void main(String args[])
	{
	LinkedList l=new LinkedList();
	l.insert(5);
	l.insert(4);
	l.insert(3);
	l.insert(2);
	l.insert(1);
	l.show();
	System.out.println();
	
	//insert at start
	l.insertAtstart(10);
	l.show();
	System.out.println();
	
	//insertAnywhere
	l.insertAnywhere(22,0);
	l.show();
	System.out.println();
	
	//del at start
	l.deleteAtStart();
	l.show();
	System.out.println();
	
	//del anywhere
	l.deleteAnywhere(1);
	l.show();
	System.out.println();
	
	//del in the end
	l.deleteAtEnd();
	l.show();
	}
}