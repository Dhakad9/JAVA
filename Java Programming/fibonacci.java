class fibonacci
{
    public static void main(int n)
    {
        int a=0,b=1,c=0;
        while(a<=n)
        {
            if(a==n)
            {
                System.out.println("Yes");
                break;
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(a>n)
        System.out.println("No");
    }
}