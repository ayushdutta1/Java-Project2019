/**
Write a program to accept a sentence which may be terminated by either’.’, ‘?’or’!’ only. The words may be separated by more than one blank space and are in UPPER CASE.

Perform the following tasks:

(a) Find the number of words beginning and ending with a vowel.

(b) Place the words which begin and end with a vowel at the beginning, followed by the remaining words as they occur in the sentence.
*/

import java.util.*;
class ISC2016_Q3
{
    boolean isVowel(String w) // Function to check if a word begins and ends with a vowel or not
    {
        int l = w.length();
        char ch1 = w.charAt(0); // Storing the first character
        char ch2 = w.charAt(l-1); // Storing the last character
        if((ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U') && 
        (ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
 
    public static void main(String args[])
    {
        ISC2016_Q3 ob = new ISC2016_Q3();
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        s = s.toUpperCase();
        int l = s.length();
        char last = s.charAt(l-1); // Extracting the last character
 
        /* Checking whether the sentence ends with '.' or '?' or not */
        if(last != '.' && last != '?' && last != '!')
        {
            System.out.println("Invalid Input. End a sentence with either '.', '?' or '!' only");
        }
        else
        {
            StringTokenizer str = new StringTokenizer(s," .?!");
            int x = str.countTokens();
            int c = 0;
            String w = "", a = "", b = "";
 
            for(int i=1; i<=x; i++)
            {
                w = str.nextToken(); // Extracting words and saving them in w
 
                if(ob.isVowel(w))
                {
                    c++; // Counting all words beginning and ending with a vowel
                    a = a + w + " "; // Saving all words beginning and ending with a vowel in variable 'a'
                }
                else
                    b = b + w + " "; // Saving all other words in variable 'b'   
            }
            System.out.println("OUTPUT : \nNUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + c);
            System.out.println(a+b);
 
        }
    }
}
