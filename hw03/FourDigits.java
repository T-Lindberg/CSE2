//Thomas Lindberg
//CSE2
//9.15.14
//hw03
//FourDigits.java

import java.util.Scanner;
//import scanner class

public class FourDigits {
    //main method required for every Java program
    public static void main(String [] args) {
        
    Scanner myScanner;
    //declare instance of Scanner object
    myScanner = new Scanner ( System.in);
    //call Scanner constructor

    System.out.print ("Enter a double: ");
    double inputNumber = myScanner.nextDouble ();
    //prompts user for a double
    
    
    inputNumber = (int)(inputNumber*10000)%10000;
    //calculation to compute four digits right of decimal point
    
    System.out.println ("The four digits are: "+ (int)inputNumber);
    //prints calculation
    
    
    
    }
}