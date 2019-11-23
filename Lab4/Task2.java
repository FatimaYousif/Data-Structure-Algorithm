
//Creating Linked List without implementing any built in method
class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
	}
	
	Node(int data,Node next)
	{
		this.data=data;
		this.next=next;
	}
	
	public static void main(String[] args)
	{
		Node start=new Node(10);
		Node p=start;
		for(int i=0;i<=5;i++)
		{
			p=p.next=new Node(10+11+i);
		}
		
		for(p=start;p!=null;p=p.next)
		{
			System.out.println(p.data);
		}
	}
}