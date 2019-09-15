/**
Inputs a matrix of order M  N and displays original matrix, largest and smallest number and arranged matrix in ascending order.
Sample Input :
1      2      3      5
6      4      9      3
8      7      3      6
Sample Output :
ORIGINAL MATRIX
1      2      3      5     
6      4      9      3     
8      7      3      6     
LARGEST NUMBER : 9 IN ROW 1 AND COLUMN 2
SMALLEST NUMBER : 1 IN ROW 0 AND COLUMN 0
REARRANGED MATRIX
1      2      3      3     
3      4      5      6     
6      7      8      9
*/

import java.util.*;
public class Matrix
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        int m,n,i,j,t=0,r=0,c=0;
        System.out.println("Enter no of rows : ");
        m=in.nextInt();
        System.out.println("Enter no of columns : ");
        n=in.nextInt();
        if((m>2)&&(m<20)&&(n>2)&&(n<20))
        {

            int a[][]=new int[m][n];
            System.out.println("Enter Elements in the matrix : ");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=in.nextInt();
                }
            }
            System.out.println("ORIGINAL MATRIX");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i][j]>t)
                    {
                        t=a[i][j];
                        r=i;
                        c=j;
                    }
                }
            }
            System.out.println("LARGEST NUMBER : "+t+" IN ROW "+r+" AND COLUMN "+c);
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i][j]<t)
                    {
                        t=a[i][j];
                        r=i;
                        c=j;
                    }
                }
            }
            System.out.println("SMALLEST NUMBER : "+t+" IN ROW "+r+" AND COLUMN "+c);
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    for(r=0;r<m;r++)
                    {
                        for(c=0;c<n;c++)
                        {
                            if(a[i][j]<a[r][c])
                            {
                                t=a[i][j];
                                a[i][j]=a[r][c];
                                a[r][c]=t;
                            }
                        }
                    }
                }
            }
            System.out.println("REARRANGED MATRIX");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else
        System.out.println("SIZE OUT OF RANGE");
    }
}
