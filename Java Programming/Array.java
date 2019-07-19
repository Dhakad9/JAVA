import java.util.*;

class Array
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the size of array ");
        int size=in.nextInt();
        
        int a[]=new int[size];
        int c=0;int p=0;int pos=0;int n=0;int nn=0;
        for(int i=0;i<a.length;i++)
        {
            n=in.nextInt();
            if(n!=0)
            {
                a[i]=n;
                c++;
            }
        }
        
        if(c==5)
        System.out.println("Element cannot be Entered");
        else
        {
            System.out.println("Enter a number to be intered");
            n=in.nextInt();
            System.out.println("Enter your choice");
            System.out.println("1=Front");
            System.out.println("2=Enter Position");
            System.out.println("3=End");
            System.out.println("4=Sorted Insertion");
            nn=in.nextInt();
            
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==0)
                {
                    pos=i;
                    break;
                }
            }        
            switch(nn)
            {
                case 1 :p=0;break;
                case 2 :
                {
                    p=in.nextInt();
                    p--;
                    break;
                }
                case 3 :p=a.length-1;break;
                case 4 :p=pos;break;
                default:System.out.println("Wrong input");
            }
         }
         
         if(pos<p)
         {
             for(int i=pos;i<a.length-1;i++)
             a[i]=a[i+1];
                        
             a[p]=n;
         }
         else if(pos>p)
         {
             for(int i=pos;i>0;i--)
             a[i]=a[i-1];
                        
             a[p]=n;
         }
         else
         a[p]=n;
        
         if(nn==4)
         {
              int l = a.length;
              for (int i = 0; i < l-1; i++)
              {
                  for (int j = 0; j < l-i-1; j++)
                  {
                      if (a[j] > a[j+1])
                      {
                          int temp = a[j];
                          a[j] = a[j+1];
                          a[j+1] = temp;
                      }
                  }
            }
         }
        System.out.println("Your final array is");
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}