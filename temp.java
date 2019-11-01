import java.util.*;

class temp{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter some values [char, String, String ]");
		char a=in.nextLine().charAt(0);
		System.out.println("[Character] You entered = "+a);
		String s1=in.nextLine();
		System.out.println("[String] You entered = "+s1);
		String s2=in.nextLine();
		System.out.println("[String] You entered = "+s2);
	}
}