//Thomas Lindberg
//CSE2
//Lab04
//BigMacAgain
//9/19/14
//how you can use selection statements to run code only under specific conditions

import java.util.Scanner;

public class BigMacAgain{
    //main method required for every Java program
    public static void main(String [] args) {
       Scanner myScanner = new Scanner (System.in);
        
        System.out.println ("Enter the number of Big Macs: ");
        int nBigMacs = myScanner.nextInt();
        
        if (myScanner.hasNextInt()) {
            
        }
        
            if (nBigMacs > 0) {
                double price = 2.22;
                double cost = nBigMacs * price;
                System.out.println ("You ordered" +nBigMacs+ "for a cost of: "+cost);
            }
            else {
                System.out.println ("Number of Big Macs not greater than 0");
            }
            
        else{
            System.out.println ("You did not enter an int");
        }
    }
}