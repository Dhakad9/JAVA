import java.util.*;

class Binary_Search
{
    int size;
    int a[];
    int search;
    Scanner in=new Scanner(System.in);
    public Binary_Search(int n)
    {
        size=n;
        a=new int[size];
    }
    public void input()
    {
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        a[i]=in.nextInt();
        
        System.out.println("Enter the search element:");
        search=in.nextInt();
    }
    public int search()
    {
        int f=1; 
        int z=1;
        for(int i=0,j=a.length-1,k=0;k<=a.length;k++)
        {
            z=(int)(j+i)/2;
            if(a[z]==search)
            {
                f=0;
                return (z+1);
            }
            else if(a[z]<search)
            i=z+1;
            else
            j=z-1;
        }
        return -1;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        
        Binary_Search ob=new Binary_Search(n);
        ob.input();
        int index=ob.search();
        System.out.println(index!=-1?"Search element found at "+index+" index":"Search element not found");
        
    }
}