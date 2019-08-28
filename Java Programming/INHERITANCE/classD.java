package Inheritance;
import java.util.*;

class classD implements classB,classC
{
    public void out()
    {
        System.out.println("Class A");
    }
    public void outpt()
    {
        System.out.println("class B");
    }
    public void outpu()
    {
        System.out.println("class C");
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        
        classD obj=new classD();
        obj.out();
        obj.outpu();
        obj.outpt();
    }
}