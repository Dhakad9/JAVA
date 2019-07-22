import java.util.*;

class Selection_Sort
{
    int size;
    int a[];
    
    Scanner in=new Scanner(System.in);
    public Selection_Sort(int n)
    {
        size=n;
        a=new int[size];
    }
    public void input()
    {
        System.out.println("Enter the elements of the array in ascending order or descending order:");
        for(int i=0;i<size;i++)
        a[i]=in.nextInt();
        
       
    }
    public void sort()
    {
        for (int i = 0; i < n-1; i++) 
		{ 
			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_idx]) 
					min_idx = j; 

			
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        
        Selection_Sort ob=new Selection_Sort(n);
        ob.input();
        ob.sort();
        
        
    }
}
