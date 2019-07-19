import java.util.*;
class BinarySearch2
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
        int z=1;
        for(int i=0,j=9,k=0;k<=9;k++)
        {
            z=(int)(j+i)/2;
            if(a[z]==b)
            {
                f=0;
                System.out.println("Element Found="+b+"\n Location="+(z+1));
                break;
            }
            else if(a[z]<b)
            i=z+1;
            else
            j=z-1;
        }
        if(f==1)
        System.out.println("element not found");
    }
}