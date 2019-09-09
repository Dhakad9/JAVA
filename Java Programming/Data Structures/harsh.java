/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static int[] Delete(int[] arr,int index) 
    { 
        int[] b = new int[arr.length - 1]; 

        for (int i = 0, k = 0; i < arr.length; i++) 
        {  
            if (i == index)  
                continue; 
                
            b[k++] = arr[i]; 
        } 
        return b; 
    }

    static int fib(int n) 
    { 
        if (n <= 1) 
            return n; 
        return fib(n - 1) + fib(n - 2); 
    }
    
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        Codechef ob=new Codechef();
        int T=in.nextInt();

        int i=0;
        while(i<T){
            int N=in.nextInt();
            int a[]=new int[N];
            for(int j=0;j<N;j++){
                a[j]=ob.fib(j);
            }
            for(int j=0;j<a.length;j++){
                a[j]=a[j]%10;
            }
            int size=a.length;
           while(size!=1){
				size=a.length;
				
				for(int j=0;j<a.length;j++){
		 	   	if(a.length==1) break;
					a=ob.Delete(a,j);
					}
           }
           i++;
           for(int k=0;k<a.length;k++){
               System.out.println(a[k]);
            }
        }
        
    }
}