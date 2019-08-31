import java.util.*;

class LinkedList
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node (int d){
			data=d;
			next=null;
		}
	}
	public boolean ifEmpty(LinkedList l){
		if(l.head==null)
			return true;
		return false;
	}
	public void printlist(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"\t");
			n=n.next;
		}
		System.out.println();
	}
	public void insertNodeAtFront(int newData){
		Node newNode=new Node(newData);
		newNode.next=head;
		head=newNode;
	}
	public void insertNodeAtEnd(int newData){
		Node newNode=new Node(newData);
		if(head==null){
				head=new Node(newData); 
				return;
		}

		newNode.next=null;

		Node last=head;
		while(last.next!=null)
			last=last.next;

		last.next=newNode;
	}
	public void insertAtAnyPosition(int element,int pos){
    	Node newNode = new Node(element);
 
 	   if (pos == 0){
    	    newNode.next = head;
        	head = newNode;
    	}
    	else
    	{
        	Node n = head;
        	while (--pos>0){
            	n = n.next;
        	}
        newNode.next = n.next;
        n.next = newNode;
    	}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		System.out.println("Linked List Implementation");
		LinkedList list=new LinkedList();

			if(list.ifEmpty(list))
				System.out.println("Node Empty");
			else
				System.out.println("Node have elements");

		list.head=new Node(40);
		Node second=new Node(30);
		Node third=new Node(20);

		list.head.next=second;
		second.next=third;
		
		System.out.println("Original Linked List");
		list.printlist();
		int element;
		System.out.println("Enter a element to be inserted at front");
		element=in.nextInt();
		list.insertNodeAtFront(element);
		System.out.println("Node Inserted");
		list.printlist();

		System.out.println("Enter a element to be inserted at end");
		element=in.nextInt();
		list.insertNodeAtEnd(element);
		System.out.println("Node Inserted");
		list.printlist();

		System.out.println("Enter a element and position where to be inserted");
		element=in.nextInt();
		int pos=in.nextInt();
		list.insertAtAnyPosition(element,pos);
		list.printlist();


			if(list.ifEmpty(list))
				System.out.println("Node Empty");
			else
				System.out.println("Node have elements");
	}
}