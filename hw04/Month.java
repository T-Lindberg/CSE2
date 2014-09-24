//Thomas Lindberg
//CSE2
//hw04
//Month
//9/23/14

import java.util.Scanner;

public class Month {
    //main method required for every program
    public static void main(String [] args) {
        //declare scanner
       Scanner myScanner = new Scanner (System.in);
       //prompt user for input
       System.out.println ("Enter an int for the month (1-12): ");
       int month = myScanner.nextInt ();
       //conditions for range of input
       if (month > 0) {
           //conditions for organizing and printing months with appropriate days
           if (month <=12) {
               if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                   System.out.println ("The month has 30 days");
               }
                else if (month == 2) {
                   System.out.println ("Enter an int giving the year: ");
                   int year = myScanner.nextInt ();
                   
                   if (year > 0) {
                       
                       if (year%4 == 0){
                           System.out.println ("The month has 29 days");
                       }
                       
                       else {
                           System.out.println ("The month has 28 days");
                       }
                   }
                   else {
                       System.out.println ("Invalid year");
                   }
                }
                else {
                    System.out.println ("The month has 31 days");
                }
                
            }
            else {
                System.out.println ("Int is not less than 12");
              }
           }
       
       else {
           System.out.println ("You did not enter an int between 1 and 12");

       }
    }
}

        
           
           
       