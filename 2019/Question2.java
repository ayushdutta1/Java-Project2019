/**
Write a program to declare a single dimensioan array a[] and a square matrix b[][]
of size N, where N > 2 and N < 10. Allow the user to input positive integers into
the single dimensinal array.
Perform the following task on the matrix:

(a) Sort the elements of the single dimensional array in ascending order using any sorting technique
      and display the sorted elements.

(b)  Fill the matrix b[][] in the following format.
       If the array a[] ={5,2,8,1} then after sorting, a[]={1,2,5,8}
       then the matrix b[][] would fill as below:
                1   2   5   8
                1   2   5   1
                1   2   1   2
                1   1   2   5

(c)  Display the filled matrix in the above format.

To undersatnd the logic of creation of the two dimensional array, take 
2,5,6,10,23 to be the elements of single dimensional array after sorting.

As per condition, the two dimensional array must be of size 5x5.
Now the position of elements of single dimensional array is 0,1,2,3,4

We now mark the position of the two dimensiona array:

(0,0)    (0,1)    (0,2)    (0,3)    (0,4)   
2[0]     5[1]     6[2]     10[3]    23[4]

(1,0)    (1,1)    (1,2)    (1,3)    (1,4)  
2[0]     5[1]     6[2]     10[3]     2[1]

(2,0)    (2,1)    (2,2)    (2,3)    (2,4)  
2[0]     5[1]      6[2]    2[1]      5[2]

(3,0)    (3,1)    (3,2)    (3,3)    (3,4)  
2[0]     5[1]      2[0]     5[1]     6[2]

(4,0)    (4,1)    (4,2)    (4,3)    (0,4)   
 2[0]    2[0]      5[1]     6[2]    10[3]

where (i,j) represent row-coloumn position and 
val[k] represent value at position k in single dimensiona array.

It is easy to see that whenever i+j > 5 ( order of the matrix)
in any row, from that position onwards(along the row), elements
from position 0 onwards (from single dim array) starts filling the row.

So whenever i+j> 5 in any row we need to move the counter again at 
position 0 in the single dim array.

For this see that i+j-5 (in general i+j-order) will help the purpose.

For example, for the third row,
(3,0)    (3,1)    (3,2)    (3,3)    (3,4)  
2[0]     5[1]      2[0]     5[1]     6[2]

From position (3,2) onwards,
i+j-order =       3+2-5,   3+3-5,   3+4-5
                    0        1        2
which gives positions from the starting point in the single dim-array!
Thus the code!

for(int i = 0; i < order; i++) {
                for(int j = 0; j < order; j++) {
                        if(i+j < order)
                          Mat[i][j]=single_dim_array[j];
                        else
                          Mat[i][j]=single_dim_array[(i+j)-order];
                  }
           }
 */
 
 
 
 import java.util.*;
public class ISC2019Q2 {
       public static void main(String[] args) {
             int N;
             Scanner in = new Scanner(System.in);
             do {
                 System.out.println("Enter the value of N:");
                 N = in.nextInt();
                 if(N <= 2 || N >= 10)
                              System.out.println("INVALID INPUT:");
                 }while(N < 1 || N > 366);
             Matrix obj = new Matrix(N);
             System.out.println("Enter the elements of single dimensional array:");
             obj.inputSingleDimArray();
             obj.SortMatrix();
             obj.inputElementsToTwoDimMatrix();
             obj.displayMatrix();
             in.close();
             }
       }
     
class Matrix{
       Matrix(int N){
             order = N;
             single_dim_array = new int[order];
             Mat = new int[order][order];
       }
       public void inputElementsToTwoDimMatrix() {
           for(int i = 0; i < order; i++) {
                for(int j = 0; j < order; j++) {
                        if(i+j < order)
                          Mat[i][j]=single_dim_array[j];
                        else
                          Mat[i][j]=single_dim_array[(i+j)-order];
                  }
           }
         
     }
      
       public void inputSingleDimArray() {
          Scanner in = new Scanner(System.in);
          for(int i=0;i<order;i++) {
                single_dim_array[i]=in.nextInt();
                if(single_dim_array[i] <= 0) {
                     System.out.println("Only positive values allowed,enter the value again:");
                     i--;
                     continue;
                 }
              }
          in.close();
       }
       public void SortMatrix() {
             int temp;
             for (int i =0;i<order;i++) {
             for(int j=i;j<order;j++) {
                     if(single_dim_array[i] > single_dim_array[j]) {
                           temp = single_dim_array[j];
                         single_dim_array[j]=single_dim_array[i];
                         single_dim_array[i]=temp;
                         }
                  }
              }        
        }
     
       public void displayMatrix() {
            System.out.println("SINGLE DIMENSIONAL ARRAY AFTER SORTING:");
            for(int k=0;k<order;k++)
               System.out.print(" "+single_dim_array[k]);
            System.out.println();
            System.out.println("TWO DIMENSIONAL MATRIX:");
             for(int i = 0; i < order; i++) {
                    for(int j = 0; j < order; j++) {
                          System.out.print(Mat[i][j]+"  ");
                    }
                    System.out.println();
             }
       }
     
       private int[][] Mat;
       private int[] single_dim_array;
       private int order;
       }
