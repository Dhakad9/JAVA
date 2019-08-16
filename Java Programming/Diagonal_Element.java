import java.util.*;

class Diagonal_Element
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the elements of matrix");
        int a[][]=new int[3][3];
        int rd=0;
        int ld=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=in.nextInt();
            }
            ld=ld+a[i][i];
            rd=rd+a[i][a.length-1-i];
        }
        System.out.println("right diagnol="+rd);
        System.out.println("left diagnol="+ld);
    }
}