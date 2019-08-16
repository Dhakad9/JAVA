package INHERITANCE;

import java.util.*;
class C extends B implements A
{
    public void display()
    {
        System.out.println("Class A[interface]");
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        
        C ob=new C();
        ob.display();
        ob.output();
        System.out.println("value of abc="+ob.abc);
        System.out.println("value of xyz="+ob.xyz);
    }
} 