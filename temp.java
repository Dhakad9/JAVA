import java.util.*;

class temp{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		System.out.println("Enter 2 string:");
		String s1=in.nextLine();
		String s2=in.nextLine();

		System.out.println("String lenght="+s1.length());
		System.out.println("String position="+s1.charAt(0));
		System.out.println("String lenght="+s2.length());
		System.out.println("String position="+s2.charAt(0));
		System.out.println("s1 compare to s2="+s1.compareTo(s2));
		System.out.println("Equal or not="+s1.equalsIgnoreCase(s2));
		System.out.println("concatenation="+s1.concat(s2));
		System.out.println("To Upper Case="+s1.toUpperCase());
		System.out.println("To Lower Case="+s2.toLowerCase());
	}
}