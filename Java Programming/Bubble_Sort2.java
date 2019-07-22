import java.util.*;

class Bubble_Sort2
{
    int size;
    int a[];
    
    Scanner in=new Scanner(System.in);
    public Bubble_Sort2(int n)
    {
        size=n;
        a=new int[size];
    }
    public void input()
    {
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        a[i]=in.nextInt();
    }
    public void sort()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
                for(int k:a)
        System.out.println(k+"\t");
        
        System.out.println("\n");
            }
            System.out.println("\n");
        }
    }
    public void display()
    {
        System.out.println("Sorted Array:");
        for(int i:a)
        System.out.println(i+"\t");
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        
        Bubble_Sort2 ob=new Bubble_Sort2(n);
        ob.input();
        ob.sort();
        ob.display();
        
    }
}
