/**
Inputs a sentence in upper case and remove all the extra space present in a sentence. Also inputs a word with its position in a sentence and display the new string.
Sample Input :
SHUBHAM HIS PUBLISHES HIS PROGRAMS AT SHARMA TUTORIALS JAMSHEDPUR.
Enter a word to be deleted :
HIS
Enter a position of word in a sentence :
2
Sample Output :
SHUBHAM PUBLISHES HIS PROGRAMS AT SHARMA TUTORIALS JAMSHEDPUR
*/

import java.util.*;
public class Sentence {
 public static void main() {
  Scanner in = new Scanner(System.in);
  String s, w[], wrd, str = "";
  inti, p = 0;
  System.out.println("ENTER YOUR SENTENCE : ");
  s = in .nextLine();
  if ((s.charAt(s.length() - 1) == '?') || (s.charAt(s.length() - 1) == '.') || (s.charAt(s.length() - 1) == '!')) {
   w = s.split("[.?! ]+");
   for (i = 0; i < w.length; i++) {
    if (w[i].equals("")) {
     str = str;
    } else {
     str = str + w[i] + " ";
    }
   }
   str = str.trim();
   System.out.println("Enter a word to be deleted : ");
   wrd = in .nextLine();
   System.out.println("Enter a position of word \"" + wrd + "\" in a sentence : ");
   p = in .nextInt();
   w = str.split(" ");
   str = "";
   if ((p - 1) < w.length) {
    if (w[p - 1].equalsIgnoreCase(wrd)) {
     for (i = 0; i < w.length; i++) {
      if (i == (p - 1))
       i++;
      str = str + w[i] + " ";
     }
    }
    str = str.trim();
    System.out.println("New Sentence : " + str);
   }
  } else
   System.out.println("Invalid Input");
 }
}
