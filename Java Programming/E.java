import java.util.*;

class E extends A
{
    int x=100;
    public E()
    {
        super(256);
        System.out.println("Constructor of class E");
    }
    public void display()
    {
        System.out.println("I am E");
        System.out.println("X="+x);
        System.out.println("super.X="+super.x);
        super.display();
    }
    public static void main()
    {
        System.out.println("E ob=new E();\nob.display();");
        E ob=new E();
        ob.display();
        System.out.println();
        
        System.out.println("A obj=new A();\nobj.display();");
        A obj=new A();
        obj.display();
        System.out.println();
        
        System.out.println("A object=new E();\nobject.display();");
        A object=new E();
        object.display();
    }
}