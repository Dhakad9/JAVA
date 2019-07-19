import java.util.*;
class digit
{
    public int prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        digit ob=new digit();
        System.out.println("Enter a Number");
        int n=in.nextInt();
        int s=0;
        for(int i=n;i>0;i=i/10)
        {
            int rem=i%10;
            int a=ob.prime(rem);
            if(a==1)
            s=s+rem;
        }
        System.out.println("Sum of Prime Digits="+s);
    }
}