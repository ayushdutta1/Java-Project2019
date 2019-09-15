/**
ISC COMPUTER SCIENCE PRACTIACAL SOLVED
Design a program to accept a day number (between 1 and 366), year(in 4 digits) from the user to generate and display the corresponding date. Also, accept ‘N’ ( 1<= N <= 100) from the user to compute and display  the future date corresponding to ‘N’ days after the generated date. Display an error message if the value of the day number, year and N are not within the limit or not according to the condition specified.
Test your program with the following data and some random data:
INPUT:

EXAMPLE 1: DAY NUMBER:                  255
                        YEAR:                                  2018
                        DATE AFTER (N DAYS):    22
OUTPUT:       DATE:                                   12 TH SEPTEMBER, 2018
                        DATE AFTER 22 DAYS      4 TH OCTOBER, 2018
*/

import java.util.*;
public class ISC2019Q1 {
    public static void main(String[] args) {
       int day_num;
             int yr;
             int N;
        Scanner in = new Scanner(System.in);
        DaysCalculation date = new DaysCalculation();
        do {
                    System.out.println("Enter a day number (between 1 and 366)");
                    day_num = in.nextInt();
                    if(day_num < 1 || day_num > 366)
                                 System.out.println("INVALID DAY NUMBER:");
                    }while(day_num < 1 || day_num > 366);
            
             do {
                    System.out.println("Enter the year");
                    yr = in.nextInt();
                    if(Integer.toString(yr).length()!=4)
                                 System.out.println("INVALID YEAR:");
                    }while(Integer.toString(yr).length()!=4);
             do {
                    System.out.println("Enter the value of N:");
                    N = in.nextInt();
                    if(N < 1 || N > 100)
                                 System.out.println("INVALID DAY NUMBER (between 1 and 100):");
                    }while(N < 1 || N > 100);
        date.setDate(day_num,yr,N);  
        System.out.println("OUTPUT:");
        date.dateSpecifier(); 
        in.close();
        }   
    }
class DaysCalculation {
    public void setDate(int dayNumber, int year, int dayAfter) {
        this.dayNumber = dayNumber;
        this.year = year;
        this.dayAfter = dayAfter;
        }
    public void dateSpecifier() {
        int m = 0,k=1;
        for(int i = 1; i <= dayNumber; i++) {
            if( checkLeap(year) == true ? k > ldays[m] : k > mdays[m] ) {
                k = 1;
                m++;
                }
            k++;   
            }
        String prefix;   
        prefix = (k-1)%10 == 1 ? "st" : (k-1)%10 == 2 ? "nd" : (k-1)%10 == 3 ? "rd" : "th";
        System.out.println("DATE:     "+(k-1)+prefix+" "+months[m]+" ,"+year); 
        for (int i = 1; i <= dayAfter; i++) {
            if( checkLeap(year) == true ? k > ldays[m] : k > mdays[m] ) {
                k = 1;
                m++;
                if(m > 11) {
                    year++;
                    m = 0;
                    }
                }
            k++;   
            }
        prefix = (k-1)%10 == 1 ? "st" : (k-1)%10 == 2 ? "nd" : (k-1)%10 == 3 ? "rd" : "th";
        System.out.println("DATE AFTER "+dayAfter+" DAYS:"+(k-1)+""+prefix+" "+months[m]+"  ,"+year);       
        }   
    private boolean checkLeap(int year) {
        if(year%400==0)
           leap=true;
        else if (year%100==0)
           leap=false;
        else if (year%4==0)
           leap=true;
        else
           leap=false;
           return leap;
        }    
    private boolean flag;
    private static boolean leap;   
    private int dayNumber,year;
    private int dayAfter;
    String[] months = {"January","Feburary","March","April","May","June","July","August","Sepetember","October","November","December"};
    int[] mdays={31,28,31,30,31,30,31,31,30,31,30,31};
    int[] ldays={31,29,31,30,31,30,31,31,30,31,30,31};   
    }
