import java.util.*;

class This_keyword
{
    int x;
    int y;
    int z;
   
    public This_keyword(int z)
    {
        this.z=z;
    }
    public This_keyword(int x,int y)
    {
        this(25);
        this.x=x;
        this.y=y;
    }
    public void display(int x,int y)
    {
        System.out.println("Without this keyword \n  x="+x+"\ty="+y);
        this.this_display();
    }
    public void this_display()
    {
        System.out.println("With this keyword  \n x="+this.x+"\ty="+this.y);
    }
    public static void main(String []args)
    {
        This_keyword ob=new This_keyword(13,17);
        ob.display(5,24);
        System.out.println("Value of z="+ob.z);
    }
}