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
