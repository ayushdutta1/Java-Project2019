/**
Inputs a sentence in upper case and display palindromic words and the number of palindromic words present in sentence.
Sample Input : 
MADAM ARORA WILL COME AT NOON.
Sample Output : 
PALINDROMIC WORDS ARE : 
MADAM ARORA NOON 
NUMBER OF PALINDROMIC WORDS : 3
*/

import java.util.*;
public class Palindrome
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String s,w[],wrd="",str="";
        int i,j,p=0;
        char c;
        System.out.println("ENTER YOUR SENTENCE : ");
        s=in.nextLine();
        if((s.charAt(s.length()-1)=='?')||(s.charAt(s.length()-1)=='.')||(s.charAt(s.length()-1)=='!'))
        {
            w=s.split("[?!. ]+");
            for(i=0;i<w.length;i++)
            {
                for(j=0;j<w[i].length();j++)
                {
                    c=w[i].charAt(j);
                    wrd=c+wrd;
                }
                if(w[i].equals(wrd))
                {
                    str=str+w[i]+" ";
                    p++;
                }
                wrd="";
            }
            if(p>0)
            {
                System.out.println("PALINDROMIC WORDS ARE : ");
                System.out.println(str);
                System.out.println("NUMBER OF PALINDROMIC WORDS : "+p);
            }
            else
            {
                System.out.println("NO PALINDROMIC WORDS");
            }
        }
        else
        System.out.println("INVALID INPUT");
    }
}
