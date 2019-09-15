/**
Write a program to declare a square matrix A[ ][ ] of order MxM where ‘M’ is the number of rows and the number of columns,
such that M must be greater than 2 and less than 10. Accept the value of M as user input. Display an appropriate message for
an invalid input. Allow the user to input integers into this matrix. Perform the following tasks:

(a) Display the original matrix.
(b) Rotate the matrix 90° clockwise.
(c) Find the sum of the elements of the four corners of the matrix.
*/

import java.util.*;
class Q2_ISC2015
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int m=sc.nextInt();
         
        if(m<3 || m>9)
            System.out.println("Size Out Of Range");
        else
        {
            int A[][]=new int[m][m];
 
            /* Inputting the matrix */
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print("Enter an element : ");
                    A&#91;i&#93;&#91;j&#93;=sc.nextInt();
                }
            }
             
            /* Printing the original matrix */
            System.out.println("*************************");
            System.out.println("The Original Matrix is : ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(A&#91;i&#93;&#91;j&#93;+"\t");
                }
                System.out.println();
            }
            System.out.println("*************************");
             
            /*Rotation of matrix begins here */
            System.out.println("Matrix After Rotation is : ");
            for(int i=0;i<m;i++)
            {
                for(int j=m-1;j>=0;j--)
                {
                    System.out.print(A[j][i]+"\t");
                }
                System.out.println();
            }
            System.out.println("*************************");
 
            int sum = A[0][0]+A[0][m-1]+A[m-1][0]+A[m-1][m-1]; // Finding sum of corner elements
            System.out.println("Sum of the corner elements = "+sum);
        }
    }
}
