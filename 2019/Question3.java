/**
Write a program to accept a sentence which may be terminated by either '.', '?' or '!'
only. The words are to be entered by s asingle blank space and re in UPPER CASE.

Perform the following tasks:
(a) Check for validity for the entered senctence.
(b) Convert the non-palidrome words of the sentence into palidrome words by

      concatenating the word by its revers (excluding the last character).
      Example: The reverse of the word HELP would be LEH (ommiting the
      last alphabet) and by concatenating both, the new palidrome word is HELPLEH.
      Thus the word HELP become HELPLEH

  Note: The words which end with repeated alphabets, for exaple ABB would
             becoem ABBA and not ABBBA and XAZZZ becomes XAZZZAX.

(c) Display the original sentence along with converted sentence.
*/

import java.io.*;
public class ISC2019Q3 {
 public static void main(String[] args) throws IOException {
  String Sentence;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the sentence:");
  Sentence = br.readLine();
  Sentence = Sentence.toUpperCase();
  while (Sentence.charAt(Sentence.length() - 1) != '?' && Sentence.charAt(Sentence.length() - 1) != '.' && Sentence.charAt(Sentence.length() - 1) != '!') {
   System.out.println("INVALID INPUT:,TRY AGAIN");
   Sentence = br.readLine();
  }
  Palindrome obj = new Palindrome(Sentence);
  obj.wordCount();
  obj.wordExtractor();
  System.out.println("INPUT:" + Sentence);
  System.out.println("OUTPUT:");
  obj.display();
  br.close();
 }
}
class Palindrome {
 public void display() {
  for (int i = 0; i < word_counter; i++) {
   if (IsPalindrome(word_Storage[i]))
    System.out.print(word_Storage[i] + " ");
   else
    System.out.print(ConvertToPalindrome(word_Storage[i]) + " ");
  }
 }
 private String ConvertToPalindrome(String s) {
  int counter;
  for (counter = s.length() - 1; counter > 0; counter--) {
   if (s.charAt(counter) != s.charAt(counter - 1))
    break;
  }
  counter -= 1;
  for (int i = counter; i >= 0; i--)
   s += s.charAt(i);
  return (s);
 }
 private boolean IsPalindrome(String s) {
  flag = true;
  for (int i = 0; i < s.length(); i++)
   if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
    flag = false;
    break;
   }
  return (flag);
 }
 public void wordExtractor() {
  int k = 0;
  for (int i = 0; i < msg.length(); i++) {
   word_Storage[k] = "";
   while (msg.charAt(i) != ' ' && msg.charAt(i) != '?' && msg.charAt(i) != '.' && msg.charAt(i) != '!') {
    word_Storage[k] += msg.charAt(i);
    i++;
   }
   k++;
  }
 }
 public void wordCount() {
  for (int i = 0; i < msg.length(); i++)
   if (msg.charAt(i) == ' ')
    word_counter++;
  word_counter += 1;
  word_Storage = new String[word_counter];
 }

 Palindrome(String Sentence) {
  msg = Sentence;
  word_counter = 0;
 }
 private boolean flag;
 private int word_counter;
 private String msg;
 private String[] word_Storage;
}
