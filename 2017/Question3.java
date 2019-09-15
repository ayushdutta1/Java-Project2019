/**
Caesar Cipher is an encryption technique which is implemented as ROT13 (‘rotate by 13 places’). 
It is a simple letter substitution cipher that replaces a letter with the letter 13 places after it in the alphabets, 
with the other characters remaining unchanged.
Write a program to accept a plain text of length L, where L must be greater than 3 and less than 100.
Encrypt the text if valid as per the Caesar Cipher.

*/

import java.util.*;
class CaesarCipher_ISC2017
{
    void rot13(String w)
    {
        char ch;
        int a = 0;
        String ans = "";
        for(int i = 0; i<w.length(); i++)
        {
            ch = w.charAt(i);
            if(Character.isLetter(ch))
            {
                a = ch + 13;
                 
                if((Character.isUpperCase(ch) && a>90) || (Character.isLowerCase(ch) && a>122))
                {
                    a = a - 26;
                }
                ch = (char)a;
            }
            ans = ans + ch;
        }
        System.out.println("OUTPUT : The cipher text is :\n"+ans);
    }
     
    public static void main(String args[])
    {
        CaesarCipher_ISC2017 ob = new CaesarCipher_ISC2017();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        int L = s.length();
        if(L<4 || L>99)
        {
            System.out.println("INVALID LENGTH");
        }
        else
        {
            ob.rot13(s);
        }
    }
}
