/**
The names of the teams participating in a competition should be displayed on a banner vertically,
to accommodate as many teams as possible in a single banner. Design a program to accept the names of N teams,
where 2 < N < 9 and display them in vertical order, side by side with a horizontal tab (i.e. eight spaces).
*/

import java.util.*;
public class ISC2018Q3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String ar[];
        int n, i, j;
        System.out.println("Enter the number of names: ");
        n = sc.nextInt();
        ar = new String[n];
        System.out.println("Enter the names: ");
        for(i=0;i<n;i++)
        {
            ar[i] = sc.nextLine();
        }
        int max = 0;

        for(i=0;i<n;i++)
        {
            if(max<ar[i].length())
            max = ar[i].length();       //Finding the length of the string
        }
        System.out.println("OUTPUT:" );
        for(i=0;i<max;i++)
        {
            for(j=0;j<n;j++)
            {
                /*character will be extracted only when i has a value less
                 * than the length of the string else only tabular space will be printed
                 */ 
                if(i<ar[j].length())
                    System.out.print(ar[j].charAt(i)+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
