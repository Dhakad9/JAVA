import java.util.*;
class Alphabets
{
    /*store 10 alphabets in capital letters in an array and print the consecutive letter pairs.*/
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 10 Alphabets:-");
        char c[]=new char[10];
        for(int i=0;i<=9;i++)
        c[i]=in.next().charAt(0);
        for(int i=0;i<9;i++)
        {
            if(c[i+1]-c[i]==1)
            System.out.println(c[i]+","+c[i+1]);
        }
        System.out.println("Output2");
        int a[]={1,8,4,25,10};
        System.out.println(a[0+1]+a[3]+1);
    }
}