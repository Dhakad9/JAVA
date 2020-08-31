import java.util.*;

public class PalindromeWords
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter a String:-");
		String s=in.nextLine();
		s=s+" ";
		int l=s.length();
		String s1="",s2="";
		System.out.println("Palindrome Words:");
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				if(s1.equals(s2))
					System.out.println(s1+"\t"+s2);
				s2="";
				s1="";
			}
			else
			{
				s1=s1+ch;
				s2=ch+s2;
			}
		}
	}
}
