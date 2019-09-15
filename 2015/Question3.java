/**
Write a program to accept a sentence which may be terminated by either ‘.’ or ‘?’ only. 
The words are to be separated by a single blank space. Print an error message if the input does not terminate with ‘.’ or ‘?’.
You can assume that no word in the sentence exceeds 15 characters, so that you get a proper formatted output.

Perform the following tasks:
(i) Convert the first letter of each word to uppercase.
(ii) Find the number of vowels and consonants in each word and display them with proper headings along with the words.
*/

import java.util.*;
public class Vowels_Consonants {
 public static void main() {
  Scanner in = new Scanner(System.in);
  String s, w[], u = "";
  inti, j, v = 0, co = 0;
  char c;
  System.out.println("Enter Your Sentence : ");
  s = in .nextLine();
  if ((s.charAt(s.length() - 1) == '.') || (s.charAt(s.length() - 1) == '?')) {
   u = u + Character.toUpperCase(s.charAt(0));
   for (i = 1; i < s.length(); i++) {
    if ((s.charAt(i) == ' ') && (Character.isLetter(s.charAt(i + 1))))
     u = u + ' ' + Character.toUpperCase(s.charAt(++i));
    else
     u = u + s.charAt(i);
   }
   System.out.println("New Sentance : " + u);
   w = u.split("[.? ]+");
   System.out.println("Words\t\tVowels\tConsonants");
   for (i = 0; i < w.length; i++) {
    for (j = 0; j < w[i].length(); j++) {
     c = w[i].charAt(j);
     if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U'))
      v++;
     else
      co++;
    }
    System.out.println(w[i] + "\t\t" + v + "\t" + co);
    v = 0;
    co = 0;
   }
  } else
   System.out.println("Invalid Input");
 }
}

