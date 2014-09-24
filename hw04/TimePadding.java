//Thomas Lindberg
//CSE2
//hw04
//TimePadding
//9/23/14

import java.util.Scanner;

public class TimePadding {
    //main method required for every program
    public static void main(String [] args) {
        //declare scaner
       Scanner myScanner = new Scanner (System.in);
       //prompt user for input
       System.out.println ("Enter a positive integer giving the number of seconds that have passed during the day: ");
       //declare user input
       int seconds = myScanner.nextInt ();
       
       //if user input valid
       if (seconds >= 0){
           int temp = 0;
           int days = seconds/216000;
           temp = days*216000;
           int hours = (seconds-temp)/3600;
           temp += hours*3600;
           int minutes = (seconds-temp)/60;
           temp += minutes*60;
           int paddedseconds = seconds-temp;
           //calculations to determine days,hours,minutes,seconds values
           
           if (days == 0){
               System.out.print ("The time is ");
               //condition if there are no days
               if (hours < 10) {
                   System.out.print("0" + hours + ":");
                }
                else {
                       System.out.print(hours + ":");
                }
                if (minutes < 10) {
                    System.out.print("0" + minutes + ":");
                }
                else {
                    System.out.print(minutes + ":");
                }
                if (paddedseconds < 10) {
                     System.out.println("0" + paddedseconds);
                }
                else {
                     System.out.println(paddedseconds);
                }
           }
           
           else {
              System.out.println ("The time is "+days+":"+hours+":"+minutes+":"+paddedseconds); 
           }
           //prints padded time values with 0s
       }  
       else if (seconds < 0) {
           System.out.println ("Seconds cannot be negative");
           //condition if seconds entered are negative
       }
       
    }
    
}