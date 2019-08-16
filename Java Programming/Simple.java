class ABC
{  
    public void msg()
    {
        System.out.println("Hello java");
    }  
}  
public class Simple extends ABC
{  
    /*void msg()
    {
        System.out.println("Hello CODER");
    } */
    
    public static void main(String args[])
    {  
        Simple obj=new Simple();  
        obj.msg();  
    }  
}