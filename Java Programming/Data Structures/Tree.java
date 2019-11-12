import java.util.*;

class Tree{
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	Node addNode(int data){
		Node newNode=new Node(data);
		return newNode;
	}
	void displayPreorder(Node n){
		if(n==null)
			return;
		System.out.print(n.data+"\t");
		displayPreorder(n.left);
		displayPreorder(n.right);
	}
	void displayInorder(Node n){
		if(n==null)
			return;
		displayInorder(n.left);
		System.out.print(n.data+"\t");
		displayInorder(n.right);
	}
	void displayPostorder(Node n){
		if(n==null)
			return;
		displayPostorder(n.left);
		displayPostorder(n.right);
		System.out.print(n.data+"\t");
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		Tree tree=new Tree();
		tree.root=tree.addNode(1);
		tree.root.left=tree.addNode(2);
		tree.root.right=tree.addNode(3);
		tree.root.left.left=tree.addNode(4);
		tree.root.left.right=tree.addNode(5);

		System.out.println("Pre-Order dispalay :\t");
		tree.displayPreorder(tree.root);
		System.out.println();
		System.out.println("In-Order dispalay :\t");
		tree.displayInorder(tree.root);
		System.out.println();
		System.out.println("Post-Order dispalay :\t");
		tree.displayPostorder(tree.root);
	}
}