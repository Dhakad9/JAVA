import java.util.*;
class series
{
    public int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        f=f*i;
        return f;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        series ob=new series();
        System.out.println("Enter a Number");
        int x=in.nextInt();
        int sign=1;double s=1.0;
        for(int i=2;i<=20;i+=2)
        {
            int a=ob.fact(i);
            double x1=Math.pow(x,i);
            sign=sign*-1;
            s=s+((x1/a)*sign);
        }
        System.out.println("Sum="+s);
    }
}