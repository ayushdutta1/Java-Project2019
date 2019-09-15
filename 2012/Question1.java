/**
Prime Palindrome Number ranges between the integers M and N.
Sample Input : 
M = 100
N = 1000
Sample Output :
THE PRIME PALINDROME INTEGERS ARE :
101 131 151 181 191 313 353 373 383 727 757 787 797 919 929
FREQUENCY OF PRIME PALINDROME INTEGERS : 15
*/

import java.util.*;
public class Prime_Palindrome
{
    int isPrime(int n)
    {
        int i,f=0,r=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            f++;
        }
        if(f==2)
        r=1;
        return r;
    }
    int isPalindrome(int m)
    {
        int i,t,s=0,l,r=0;
        t=m;
        for(;t!=0;)
        {
            l=t%10;
            s=s*10+l;
            t=t/10;
        }
        if(s==m)
        r=1;
        return r;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        Prime_Palindrome ob=new Prime_Palindrome();
        int m,n,i,f=0;
        System.out.println("Enter Starting Range : ");
        m=in.nextInt();
        System.out.println("Enter Ending Range : ");
        n=in.nextInt();
        if((m<3000)&&(n<3000))
        {
            System.out.println("THE PRIME PALINDROME INTEGERS ARE : ");
            for(i=m;i<=n;i++)
            {
                if((ob.isPrime(i)==1)&&(ob.isPalindrome(i)==1))
                {
                    System.out.print(i+" ");
                    f++;
                }
            }
            System.out.println();
            System.out.println("FREQUENCY OF PRIME PALINDROME INTEGERS : "+f);
        }
        else
        System.out.println("OUT OF RANGE");
    }
}
