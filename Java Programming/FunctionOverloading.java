import java.util.*;
class FunctionOverloading 
{ 
  
    public int maths(int x, int y) 
    { 
        return (x + y); 
    } 
    public int maths(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
   
    public double maths(double x, double y) 
    { 
        return (x + y); 
    } 
  
    public static void main(String args[]) 
    { 
        FunctionOverloading ob = new FunctionOverloading(); 
        System.out.println(ob.maths(10, 17)+"\t"+ob.maths(10, 17, 30)+"\t"+ob.maths(10.5, 17.5)); 
    } 
}