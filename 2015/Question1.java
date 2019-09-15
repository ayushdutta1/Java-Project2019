/**
whose digits add up to N. For example, if M = 100 and N = 11, then the smallest integer greater than 
100 whose digits add up to 11 is 119.
Write a program to accept the numbers M and N from the user and print the smallest required number whose sum of
all its digits is equal to N. Also, print the total number of digits present in the required number. The program should check for the validity of the inputs and display an appropriate message for an invalid input.
*/

import java.util.*;
class Q1_ISC2015
{
    int sumDig(long n) // Function to find sum of digits of a number
    {
        int sum = 0, d;
        while(n>0)
        {
            d = (int)(n%10);
            sum = sum + d;
            n = n/10;
        }
        return sum;
    }
     
    int countDig(long n) // Function to count the number of digits in a number
    {
        String s = Long.toString(n);
        int len = s.length();
        return len;
    }
     
    public static void main()throws Exception
    {
        Q1_ISC2015 ob = new Q1_ISC2015();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of 'm' from 100 to 10000 : ");
        int m = sc.nextInt();
        System.out.print("Enter a value of n from 1 to 99 : ");
        int n = sc.nextInt();
         
        if(m<100 || m>10000 || n<1 || n>99)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            long i = (long)m; // Required number can be out of range of 'int'
            /* The required number must be greater than 'm', 
               so loop will go on as long as that number is not obtained.*/
            while(ob.sumDig(i)!=n) 
            {
                i=i+1;
            }
            System.out.println("The required number = "+i);
            System.out.println("Total number of digits = "+ob.countDig(i));
        }
    }
}
