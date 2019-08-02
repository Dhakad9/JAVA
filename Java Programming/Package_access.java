import Package.numbers;
import java.util.*;
class Package_access
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n=in.nextInt();
        
        numbers ob=new numbers();
        System.out.println(ob.square(n));
        numbers.output();
        
    }
}