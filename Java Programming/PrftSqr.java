/*find Minimum no. to be divided to make a nO. a perfect Square
n=50*/
import java.util.*;
class PrftSqr
{
    public int Sqr(int n)
    {
        int f=0;
        for(int i=1;i<=n;i++)
        {
            int a=(int)Math.pow(i,2);
            if(n==a)
            f=1;
        }
        if(f==1)
        return 1;
        else
        return 0;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        PrftSqr ob=new PrftSqr();
        System.out.println("Enter a Number");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                int d=n/i;
                int a=ob.Sqr(d);
                if(a==1)
                {
                    System.out.println("Number Should be divided by "+i+" to make it a Perfect Square");
                    break;
                }
            }
        }
    }
}