import java.util.*;

class BinaryTree{
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int d){
			data=d;
			left=right=null;
		}
	}
	Node root;
	public Node getRoot(){
		return root;
	}
	void preorderDisplay(Node n){
		if(n==null)
			return;
		System.out.print(n.data+"\t");
		preorderDisplay(n.left);
		preorderDisplay(n.right);
	}
	void inorderDisplay(Node n){
		if(n==null)
			return;
		inorderDisplay(n.left);
		System.out.print(n.data+"\t");
		inorderDisplay(n.right);
	}
	void postorderDisplay(Node n){
		if(n==null)
			return;
		postorderDisplay(n.left);
		postorderDisplay(n.right);
		System.out.print(n.data+"\t");
	}
	void insertNode(int d){
		root=insert(root,d);
	}
	Node insert(Node root,int data){
		if(root==null)
			return new Node(data);

		if(data<root.data)
			root.left=insert(root.left,data);
		else if(data>root.data)
			root.right=insert(root.right,data);
		else
			return root;

		return root;
	}
	boolean search(int s){
		Node n=root;
		while(n!=null){
			if(n.data==s)
				return true;
			else if(n.data<s)
				n=n.right;
			else if(n.data>s)
				n=n.left;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		BinaryTree bt=new BinaryTree();

		System.out.println("Enter the number of nodes to enter");
		int n=in.nextInt();

		System.out.println("Enter the Nodes");
		for(int i=0;i<n;i++)
			bt.insertNode(in.nextInt());

		System.out.println("Pre-order display:\t"); bt.preorderDisplay(bt.getRoot());System.out.println();
		System.out.println("In-order display:\t");  bt.inorderDisplay(bt.getRoot());System.out.println();
		System.out.println("Post-order display:\t");bt.postorderDisplay(bt.getRoot());System.out.println();
	
		System.out.println(bt.search(5));
		System.out.println(bt.search(50));
	}
}