/**
A Composite Magic number is a positive integer which is composite as well as a magic number.

Composite number:
A composite number is a number that has more than two factors.
For example: 10
Factors are: 1, 2, 5, 10

Magic number:
A magic number is a number in which the eventual sum of the digits is equal to 1
For example: 28=2+8=10=1+0=1

Accept two positive integers m and n, where m is less than n as user input. 
Display the number of Composite magic integers that are in the range between m and n (both inclusive) and
output them along with the frequency, in the format specified below.
*/

import java.util.*;
public class Composit_Magic
{
intisComposit(int a)
    {
inti,f=0,r=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            f++;
        }
        if(f>2)
        r=1;
        return r;
    }
intisMagic(int b)
    {
intt,r=0,s=0,l;
        t=b;
for(;t!=0;)
        {
            l=t%10;
            s=s+l;
            t=t/10;
            if((s>9)&&(t==0))
            {
                t=s;
                s=0;
            }
        }
        if(s==1)
        r=1;
        return r;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
Composit_Magicob=new Composit_Magic();
intm,n,i,f=0;
System.out.println("Enter Starting Range : ");
        m=in.nextInt();
System.out.println("Enter Ending Range : ");
        n=in.nextInt();
        if(m<n)
        {
System.out.println("THE COMPOSIT MAGIC INTEGERS ARE : ");
            for(i=m;i<=n;i++)
            {
                if((ob.isComposit(i)==1)&&(ob.isMagic(i)==1))
                {
System.out.print(i+" ");
                    f++;
                }
            }
System.out.println();
System.out.println("FREQUENCY OF COMPOSIT MAGIC INTEGERS : "+f);
        }
        else
System.out.println("INVALID INPUT");
    }
}

