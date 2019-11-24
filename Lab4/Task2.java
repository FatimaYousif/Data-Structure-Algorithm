//Class for Nodes
class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
	}

	Node(int data, Node next){
		this.data=data;
		this.next=next;
	}
}

//Customized class for LinkedList.
class MyLinkedList{
	Node start;

	//Addition of node at the end of list.
	public void add(int data){
		Node n=new Node(data);
		if(start==null)
			start=n;

		else{
			Node s=start;
			while(s.next!=null){
				s=s.next;
			}

			n.next=s.next;
			s.next=n;
		}
	}

	//Addition of node at a specified index.
	public void add(int data,int index){
		Node p=start;
		Node n=new Node(data);

		if(index==0){
			add(data);
		}

		else{
			for(int i=1; i<index-1; i++){
				p=p.next;
			}
		
			n.next=p.next;
			p.next=n;
		}
	}

	//Addition of node at first.
	public void addFirst(int data){
		Node n=new Node(data);
		n.next=start;
		start=n;
	}

	//Deletion of node at the end of list.
	public void remove(){
		Node p=start;
		Node sLast=start; //2nd last node of the list
		
		while(p.next!=null)
		{
			sLast=p;
			p=p.next;
		}
		sLast.next=null;
	}

	//Deletion of node at a specified index.
	public void remove(int index){
		Node n=start;
		for(int i=1; i<index-1; i++){
			n=n.next;
		}
		n.next=n.next.next;
	}

	//Deletion of node at first.
	public void removeFirst(){
		start=start.next;
	}

	public int size(){ 
	Node temp=start; 
        int count=0; 
        while(temp!=null) 
        { 
            count++; 
            temp=temp.next; 
        } 
        return count; 
    } 	

	//Displaying the elements of the linked list 
	public void print(){
		System.out.println("The elements of the list: ");
		for(Node p=start; p!=null; p=p.next)
			System.out.print(p.data+ " ");
		System.out.println();
	}

}

class Task2{
	public static void main(String[] args){
		MyLinkedList list=new MyLinkedList();
	
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.print();

		System.out.println("\nAdding 4 at first");
		list.addFirst(4);
		list.print();

		System.out.println("\nAdding 10 at index 3");
		list.add(10,3);
		list.print();

		System.out.println("\nSize of list: "+list.size());

		System.out.println("\nRemoving element at index 4");
		list.remove(4);
		list.print();

		System.out.println("\nRemoving element from the end");
		list.remove();
		list.print();

		System.out.println("\nRemoving first element");
		list.removeFirst();
		list.print();
	}
}