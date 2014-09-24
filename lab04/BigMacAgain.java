//Thomas Lindberg
//CSE2
//Lab04
//BigMacAgain
//9/19/14

import java.util.Scanner;

public class BigMacAgain{
    //main method required for every Java program
    public static void main(String [] args) {
       Scanner myScanner = new Scanner (System.in);
        
        System.out.println ("Enter the number of Big Macs: ");
        int nBigMacs = myScanner.nextInt();
        
        if (myScanner.hasNextInt()) {
            System.out.println (nBigMacs);
        }
            
        else{
            System.out.println ("You did not enter an int");
            return; //leaves the program
            
            
        }
    }
}