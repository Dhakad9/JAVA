import java.util.*;

public class InterfaceImplements implements INTERFACE,Second {
	int a;
	int b;
	public void input(){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=in.nextInt();
		b=in.nextInt();
	}
	public void display(){
		System.out.println("Name is "+name);
		System.out.println("Sum of "+a+","+b+" and "+c+"="+sum(a,b));
		System.out.println("Subtration of "+a+","+b+" and "+c+"="+subtract(a,b));
		System.out.println("Concatenation of "+a+" and "+b+"="+concat(a,b));
	}
	public int sum(int a,int b){
		return a+b+c;
	}
	public int subtract(int a,int b){
		return a-b-c;
	}
	public String concat(int a,int b){
		return a+""+b;
	}
	public static void main(String[] args){
		InterfaceImplements ob=new InterfaceImplements();
		ob.input();
		ob.display();
	}
}

/*
 * IN INTERFACE	IS JUST LIKE CLASS IT HAS ALL ITS METHODS AS PUBLIC AND ABSTRACT.
 * A CLASS CAN IMPLEMENT MULTIPLE INTERFACES. IT ALSO ACTS AS A BLUEPRINT OF THE CLASS. 
 * AN INTERFACE CAN EXTEND ONE OR MORE INTERFACE AND IT CAN ALSO HAVE CONSTANTS DECLARED IN IT.
 * 
 * we use interface abstration. We can also achieve multiple inheritance using interfaces
 * A method is called abstract method if it has a declaration but not the body.The body of the 
 * method is defined in the class implementing that interface.
 */
		
