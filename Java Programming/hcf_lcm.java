import java.util.*;

class Lcm
{
    int x;
    int y;
    public Lcm(int a,int b)
    {
        x=a;
        y=b;
    }
    public int calculate()
    {
        int i=x>y?x:y;
        while(true)
        {
            if(i%x==0 && i%y==0)
            {
                break;
            }
            i++;
        }
        return i;
    }
}

class Hcf 
{
    int x;
    int y;
    public Hcf(int a,int b)
    {
        x=a;
        y=b;
    }
    public int calculate()
    {
        int hcf = 1;
        for(int i = 1; i <= x && i <= y; ++i)
        {
            if(x % i==0 && y % i==0)
                hcf = i;
        }
        return hcf;
    }
}

class hcf_lcm
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter number 1");
        int x=in.nextInt();
        System.out.println("Enter number 2");
        int y=in.nextInt();
        
        Lcm ob1=new Lcm(x,y);
        Hcf ob2=new Hcf(x,y);
        System.out.println("Lcm of two numbers is "+ob1.calculate());
        System.out.println("Hcf of two numbers is "+ob2.calculate());
        
    }
}