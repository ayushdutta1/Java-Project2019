/**
A Goldbach number is a positive even integer that can be expressed as the sum of two odd primes.
Note: All even integer numbers greater than 4 are Goldbach numbers. Example: 6 = 3 + 3
10 = 3 + 7
10 = 5 + 5
Hence, 6 has one odd prime pair 3 and 3. Similarly, 10 has two odd prime pairs, i.e. 3 and 7, 5 and 5.
Write a program to accept an even integer ‘N’ where N > 9 and N < 50. Find all the odd prime pairs whose sum is equal to the number ‘N’.
Test your program with the following data and some random data: Example 1:
INPUT: N = 14
OUTPUT: PRIME PAIRS ARE:
3, 11
7, 7
Example 2: INPUT: N = 30
OUTPUT: PRIME PAIRS ARE
7, 23
11, 19
13, 17
Example 3: INPUT: N = 17
OUTPUT: INVALID INPUT. NUMBER IS ODD.
Example 4: INPUT: N = 126
OUTPUT: INVALID INPUT. NUMBER OUT OF RANGE.
*/

import java.util.*;
public class Goldbach
{
    boolean isPrime(int n)
    {
        if(n<=1)        //All numbers that are less than or equal to one are  non-prime
            return false;

        int i;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)  //If any number between 2 and n/2 divides n then n is non prime
                return false;
        }
        /*If any return statement is encountered it terminates the function immediately
         * therefore the control will come here only when the above return statements are not executed 
         * which can happen only when the number is a prime number.
         */
        return true;
    }
    
    void print(int n)
    {
        int i, j;
        for(i=2;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                //If i and j are both prime and i+j is equal to n then i and j will be printed
                if(isPrime(i)&&isPrime(j)&&i+j==n)
                System.out.println(i+", "+j);
            }
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the limit: ");
        n = sc.nextInt();
        if(n%2==1)
        {       //Checking for invalid input and terminating the program
            System.out.println("INVALID INPUT. NUMBER IS ODD.");
            System.exit(0);
        }
        if(n<=9||n>=50)
        {       //Checking for 2nd invalid input and terminating the program
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
            System.exit(0);
        }
        Goldbach ob = new Goldbach();       //Creating object
        System.out.println("Prime Pairs are: ");
        ob.print(n);
    }
}
