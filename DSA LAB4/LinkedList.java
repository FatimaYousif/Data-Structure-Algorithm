import java.util.Scanner;

    class Node{
        private int data;
        private Node next;
        public Node(){
            data=0;
            next=null;
        }
       public  Node(int d, Node n){
            data=d;
            this.next=n;
        }
        public void setData(int d){
         data=d;
          
        }
        public void setNext(Node n){
            next=n;
             }
         public int getData(){
            return data;
        }
        public Node getNext(){
            return next;
        }
       
    }
    class Test{
     private int size;
     private Node start;
     public Test(){
         size=0;
         start=null;
     }
     public void insertAtFirst(int val){
         Node n=new Node();
         n.setData(val);
         n.setNext(start);
         start=n;
         size++;
     }
     public void insertAtLast(int val){
         Node n,t;
         n=new Node();
         n.setData(val);
         t=start;
         if(t==null)
             start=n;
         
         else{
             while(t.getNext()!=null)
                 t=t.getNext();
                 t.setNext(n);
             
         }
         size++;
     }
     public void insertAtPos(int val, int pos){
         if(pos==1)
             insertAtFirst(val);
         else if(pos==size+1)
             insertAtLast(val);
         else if(pos>1 && pos<=size){
              Node n,t;
              n=new Node(val,null);
              t=start;
             for(int i=1; i<pos-1; i++){
                 t=t.getNext();
                 n.setNext(t.getNext());
                 t.setNext(n);
                 size++;
                 
             }
             
         }
         else
             System.out.println("Insertion is not possible");
     }
     public void deleteAtFirst(){
         if(start==null)
             System.out.println("List is already Empty");
         else {
             start= start.getNext();
         size--;
     }
     }
     public void deleteAtPos(int pos){
         if(start==null){
             System.out.println("List is Empty");}
         else if(pos<1 || pos>size)
             System.out.println("Invalid Deletion");
         else if(pos==1)
             deleteAtFirst();
         else if(pos==size)
             deleteAtLast();
         else{
             Node t,t1;
             t=start;
             for(int i=1; i<pos-1; i++){
                 t=t.getNext();
                 t1=t.getNext();
                 t.setNext(t1.getNext());
                 size--;
                 
             }
         }
     }
     public void deleteAtLast(){
         if(start==null)
             System.out.println("List is already empty");
         else if(size==1){
             start=null;
             size--;
         }
         else{
             Node t;
             t=start;
             for(int i=1; i<size-1; i++){
                 t=t.getNext();
                 t.setNext(null);
                 size--;
                 
             
         }
         }
     }
     public boolean isEmpty(){
         if(start==null){
             return true;
         }
         else 
             return false;
         
     }
     public int getSize(){
         return size;
     }
     public void viewList(){
         Node t;
         if(isEmpty()){
             System.out.println("List is Empty");
         }
         else{
             t=start;
         for(int i=1; i<=size; i++){
             System.out.println(" "+t.getData());
             t=t.getNext();
             
                     }
     }
    }
    }
    public class LinkedList {
   
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int position,element;
        Test list=new Test();
        boolean flag=true;
        while(flag){
            System.out.println("");
        System.out.println("1. Add item to the list at start");
        System.out.println("2. Add item to the list at last");
        System.out.println("3. Add item to the list at position");
        System.out.println("4. Delete first item to the list ");
        System.out.println("5. Delete last item to the list");
        System.out.println("6. Delete  item to the list at given position");
        System.out.println("7. View List");
        System.out.println("8. Exist");
        System.out.println("Enter Your Choice");
        int choice=obj.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter value of list item ");
                element=obj.nextInt();
                list.insertAtFirst(element);
                break;
            case 2:
                System.out.println("Enter value of list item ");
                element=obj.nextInt();
                list.insertAtLast(element);
                break;
            case 3:
                System.out.println("Enter position");
                position=obj.nextInt();
                System.out.println("Enter element");
                 element=obj.nextInt();
                list.insertAtPos(element, position);
                break;
            case 4:
                    list.deleteAtFirst();
                break;
            case 5:
                    list.deleteAtLast();
                break;
            case 6:
                System.out.println("Enter Position");
                position=obj.nextInt();
                list.deleteAtPos(position);
                break;
            case 7:
                list.viewList();
                break;
            case 8:
                flag=false;

            default:
                System.out.println("Invalid Choice");
        }
    }
    
}
}
    