import java.util.*;


class HARSHtryCatch1
{
    public static int divideByZero(int a,int b)throws Exception
    {
        return a/b; //Normal division of a and b
    }
    public static void main(String args[])throws Exception
    {
        try
        {
            System.out.println(HARSHtryCatch1.divideByZero(13,7));//a is 13 and b is 7 division is possible
            System.out.println(HARSHtryCatch1.divideByZero(13,0));//a is 13 and b is 0 division not possible error occurs 
        }
        catch(ArithmeticException e)//catches the exception when any errors occurs
        {
            System.out.println("Divide by zero error");//this line runs when error occurs 
        }
        
    }
}