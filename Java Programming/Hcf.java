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
