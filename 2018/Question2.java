/**
Write a program to declare a matrix A[ ] [ ] of order (M xN) where ‘M’ is the number of rows and ‘N’ is the number of columns such that the values of both ‘M’ and ‘N’ must be greater than 2 and less than 10. Allow the user to input integers into this matrix. Perform the following tasks on the matrix:
(a) Display the original matrix.
(b) Sort each row of the matrix in ascending order using any standard sorting technique.
(c) Display the changed matrix after sorting each row. Test your program for the following data and some random data.
*/

import java.util.*;
public class TwoDArr
{
    void sort(int a[])      //Taking  single dimension array as parameter
    {
        int i, j, n = a.length, tmp;        //a.length gives the number of values in the 1D array
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)            //Sorting using bubble sort technique
            {
                if(a[j]>a[j+1])
                {
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    void display(int a[][])     //Taking 2D array as parameter
    {
        int i, j;
        for(i=0;i<a.length;i++)     //a.length here gives the number of rows
        {
            for(j=0;j<a[i].length;j++)  //a[i] gives one row at a time. a[i].length gives the number of values in each row
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void sort2D(int a[][])
    {       //As arrays are reference data types any changes made to the formal parameter in this function.
        //Will be reflected in the original parameter.
        int i, j;
        for(i=0;i<a.length;i++)
        {
            sort(a[i]);     //Taking each row and passing each to sort function as a single dimension array
        }
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        TwoDArr obj = new TwoDArr();
        int a[][], m, n, i, j;
        System.out.println("Enter the number of rows: ");
        m = sc.nextInt();       //Input the size
        System.out.println("Enter the number of columns: ");
        n = sc.nextInt();
        if(m<3||m>9||n<3||n>9)
        {
            System.out.println("Matrix out of range");
            System.exit(0);     //Terminating the program
        }
        a = new int[m][n];      //Allocating memory
        System.out.println("Enter the values for the matrix: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        obj.display(a);     //Displaying array before sorting
        obj.sort2D(a);      //Calling sort function
        System.out.println("Matrix after sorting rows: ");
        obj.display(a);     //Display after sort function has executed
    }
}
