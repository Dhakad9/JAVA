import java.util.*;

class A
{
    int x;
    private int xyz=13;
    protected int abc=17;
    public A()
    {
        System.out.println("Constructor of class A");
        x=13;
    }
    public A(int b)
    {
        x=b;
    }
    public void display()
    {
        System.out.println("I am A");
    }
    
}