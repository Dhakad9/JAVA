import java.util.*;

class Lcm_hcf
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter number 1");
        int x=in.nextInt();
        System.out.println("Enter number 2");
        int y=in.nextInt();
        
        Lcm ob1=new Lcm(x,y);
        Hcf ob2=new Hcf(x,y);
        System.out.println("Lcm of two numbers is "+ob1.calculate());
        System.out.println("Hcf of two numbers is "+ob2.calculate());
        
    }
}