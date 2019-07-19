import java.util.*;

class Arrays
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the size of array ");
        int size=in.nextInt();
        
        int a[]=new int[size];
        int c=0;int p=0;int pos=0;int n=0;int nn=0;
        for(int i=0;i<a.length;i++)
        a[i]=in.nextInt();
        
        System.out.println("Enter your choice");
        System.out.println("1=Front");
        System.out.println("2=Enter Position");
        System.out.println("3=End");
        System.out.println("4=Particular Element Deletion");
        nn=in.nextInt();
            
                   
        switch(nn)
        {
            case 1 :pos=0;break;
            case 2 :
            {
                pos=in.nextInt();
                pos--;
                break;
            }
            case 3 :pos=a.length-1;break;
            case 4 :
            {
                System.out.println("Enter element to be deleted");
                int del=in.nextInt();
                boolean check=false;
                
                for(int i=0;i<a.length;i++)
                {
                    if(a[i]==del)
                    {
                        pos=i;
                        check=true;
                        break;
                    }
                    }
                if(check==false)
                {
                    System.out.println("No Such Element");
                    System.out.println("Your final array is");
                    for(int i=0;i<a.length;i++)
                    System.out.println(a[i]);
                    System.exit(0);
                    }
                    break;
                }
                default:System.out.println("Wrong input");
        }
         
        for(int i=pos;i<a.length-1;i++)
        a[i]=a[i+1];
                        
        a[a.length-1]=0;
        System.out.println("Your final array is");
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}