/**
To arrange the words of a sentence in an alphabetical order.
Sample Input : 
SHUBHAM RUNS SHARMA TUTORIALS JAMSHEDPUR.
Sample Output :LENGTH : 5
REARRANGED SENTENCE
JAMSHEDPUR RUNS SHARMA SHUBHAM TUTORIALS
*/

import java.util.*;
public class Arrange
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String s,w[],t,n="";
        int l,i,j;
        System.out.println("Enter your Sentence : ");
        s=in.nextLine();
        if((s.charAt(s.length()-1)=='?')||(s.charAt(s.length()-1)=='.')||(s.charAt(s.length()-1)=='!'))
        {
            w=s.split("[.?! ]+");
            l=w.length;
            for(i=0;i<l-1;i++)
            {
                for(j=i+1;j<l;j++)
                {
                    if(w[i].compareTo(w[j])>0)
                    {
                        t=w[i];
                        w[i]=w[j];
                        w[j]=t;
                    }
                }
            }
            System.out.println("LENGTH : "+l);
            System.out.println("REARRANGED SENTENCE");
            for(i=0;i<l;i++)
            {
                n=n+w[i]+" ";
            }
            System.out.println(n);
        }
        else
        System.out.println("INVALID INPUT");
    }
}
