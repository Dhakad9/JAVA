import java.util.*;

class recursion{
	int recursiveFunction(int n){
		if(n==1)//base condition
			return 1;
		return n+recursiveFunction(n-1);
	}
	public static void main(String[] args) {
		recursion ob=new recursion();
		int sum=0;
		System.out.println(Math.sqrt(-9));
		System.out.println(ob.recursiveFunction(5));
	}
}