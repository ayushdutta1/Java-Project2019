/**
Inputs a matrix of order M  M and displays original matrix and image of original matrix.
Sample Input : 
1      2      3      
4      5      6      
7      8      9      
Sample Output : 
ORIGINAL MATRIX
1      2      3      
4      5      6      
7      8      9      
MIRROR IMAGE MATRIX
3      2      1      
6      5      4      
9      8      7
*/

import java.util.*;
public class Square_Matrix
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int m,i,j;
        System.out.println("Enter size of matrix : ");
        m=in.nextInt();
        if((m>2)&&(m<20))
        {
            int a[][]=new int[m][m];
            int b[][]=new int[m][m];
            System.out.println("Enter Elements in the matrix : ");
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    a[i][j]=in.nextInt();
                }
            }
            System.out.println("ORIGINAL MATRIX");
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    b[i][m-j-1]=a[i][j];
                }
            }
            System.out.println("MIRROR IMAGE MATRIX");
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(b[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else
        System.out.println("SIZE OUT OF RANGE");
    }
}     
