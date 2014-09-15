//Thomas Lindberg
//CSE2
//Lab03
//9.12.14

import java.util.Scanner;
//import scanner class
//Big Mac

public class BigMac {
    //main method required for every Java program
    public static void main(String [] args) {
        
    Scanner myScanner;
    //declare instance of Scanner object
myScanner = new Scanner ( System.in);
//call Scanner constructor

System.out.print ("Enter the number of Big Macs (an integer > 0) : ");
//prompts user for number of Big Macs
int nBigMacs = myScanner.nextInt ();
//calls "nextInt()" method
System.out.print("Enter the cost per Big Mac as"+ " a double (in the form xx.xx): " );
//prompts user for cost of Big Mac
double bigMac$ = myScanner.nextDouble();
	System.out.print("Enter the percent tax as a whole number (xx): ");
//prompts user for percent tax
double taxRate = myScanner.nextDouble();
taxRate/=100; 
//user enters percent, but I want proportion  

double cost$;
int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
cost$ = nBigMacs*bigMac$*(1+taxRate);
//get the whole amount, dropping decimal fraction
dollars=(int)cost$;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 
dimes=(int)(cost$*10)%10;
pennies=(int)(cost$*100)%10;
System.out.println("The total cost of " +nBigMacs
 +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
 " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);   
    
    } //end of main method
} //end of class

