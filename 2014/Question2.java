/**
Inputs a matrix of order M  M and displays original matrix, checks whether the matrix is symmetric or not and also 
displays the sum of both the diagonals.
Sample Input :
1      2      3     
2      4      5     
3      5      6     
Sample Output :
ORIGINAL MATRIX
1      2      3     
2      4      5     
3      5      6     
THE GIVEN MATRIX IS SYMMETRIC
The sum of the left diagonal : 11
The sum of the right diagonal : 10
*/

import java.util.*;
public class Symmetric {
 public static void main() {
  Scanner in = new Scanner(System.in);
  intm, i, j, flag = 0, ld = 0, rd = 0;
  System.out.println("Enter size of matrix : ");
  m = in .nextInt();
  if ((m > 2) && (m < 10)) {
   inta[][] = new int[m][m];
   System.out.println("Enter Elements in the matrix : ");
   for (i = 0; i < m; i++) {
    for (j = 0; j < m; j++) {
     a[i][j] = in .nextInt();
    }
   }
   System.out.println("ORIGINAL MATRIX");
   for (i = 0; i < m; i++) {
    for (j = 0; j < m; j++) {
     System.out.print(a[i][j] + "\t");
    }
    System.out.println();
   }
   for (i = 0; i < m; i++) {
    for (j = 0; j < m; j++) {
     if (a[i][j] != a[j][i]) {
      flag = 1;
      break;
     }
    }
   }
   if (flag == 0)
    System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
   else
    System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
   for (i = 0; i < m; i++) {
    ld = ld + a[i][i];
    rd = rd + a[i][m - 1 - i];
   }
   System.out.println("The sum of the left diagonal : " + ld);
   System.out.println("The sum of the right diagonal : " + rd);
  } else
   System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
 }
}
