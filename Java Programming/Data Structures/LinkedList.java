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
	public void printlist(){
		Node n=head;
		while(n!=null){
			System.out.println(n.data+"\t");
			n=n.next;
		}
	}
	public void insertNode(int newData){
		Node newNode=new Node(newData);
		newNode.next=head;
		head=newNode;
	}
	public boolean ifEmpty(LinkedList l){
		if(l.head==null)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		System.out.println("Linked List Implementation");
		LinkedList list=new LinkedList();

			if(list.ifEmpty(list))
				System.out.println("Node Empty");

		list.head=new Node(30);
		Node second=new Node(20);
		Node third=new Node(10);

		list.head.next=second;
		second.next=third;

		list.printlist();
		System.out.println("Enter a element to be inserted at front");
		int element=in.nextInt();
		list.insertNode(element);
		System.out.println("Node Inserted");
		list.printlist();
	}
}