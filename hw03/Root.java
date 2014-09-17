//Thomas Lindberg
//CSE2
//9.15.14
//hw03
//Root.java

import java.util.Scanner;
//import scanner class

public class Root {
    //main method required for every Java program
    public static void main(String [] args) {
        
    Scanner myScanner;
    //declare instance of Scanner object
    myScanner = new Scanner ( System.in);
    //call Scanner constructor

    System.out.print ("Enter a double and I will print out its cube root: ");
    //prompts user for number to cube root
    double guess = myScanner.nextDouble ();
    //calls "nextDouble ();" method
    double guess1 = guess/3;
    
    
    guess1 = (2*guess1*guess1*guess1+guess)/(3*guess1*guess1);
    guess1 = (2*guess1*guess1*guess1+guess)/(3*guess1*guess1);
    guess1 = (2*guess1*guess1*guess1+guess)/(3*guess1*guess1);
    guess1 = (2*guess1*guess1*guess1+guess)/(3*guess1*guess1);
    guess1 = (2*guess1*guess1*guess1+guess)/(3*guess1*guess1);
    //calculations to improve accuracy
    
    System.out.println ("The cube root is: "+guess1);
    //print out cube root approximation
    
    guess1 = guess1*guess1*guess1;
    
    System.out.println ("Value of crude guess when cubed: "+guess1);
    
    //print out value of approximation when cubed
    }
}
