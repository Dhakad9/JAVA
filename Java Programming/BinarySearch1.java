import java.util.*;
class BinarySearch1
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 10 Numbers");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        a[i]=in.nextInt();
        
        System.out.println("Enter 1 Number");
        int b=in.nextInt();
        int f=1; 
        
        for(int i=0,j=9;j>=0;j--)
        {
            if(a[j-i]==b)
            {
                System.out.println("Element Found="+b+"location="+(j-i+1));
                f=0;
            }
        }
        if(f==1)
        System.out.println("element not found");
    }
}