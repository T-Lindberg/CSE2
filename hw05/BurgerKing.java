//Thomas Lindberg
//CSE2
//hw05
//BurgerKing
//9.30.14
//Purpose: To practice with selection statements, operators, and boolean expressions

//import scanner first
import java.util.Scanner;

public class BurgerKing {
    
    //main method required for every java program
    public static void main(String [] args) {
        
        //declare scanner
        Scanner myScanner = new Scanner (System.in);
       
       //prompt user for input
        System.out.println ("Enter a letter to choose what you want: ");
        System.out.println ("Burger (B or b)");
        System.out.println ("Soda (S or s)");
        System.out.println ("Fries (F or f)");
        
        //declare variables outside switch statement
        String choice = myScanner.next();
        String burgerChoice;
        String sodaChoice;
        String friesChoice;
        
        //switch statement to set outputs for user inputs
        switch (choice) {
            case "B":   System.out.println ("Enter A or a for all the toppings");
                        System.out.println ("C or c for cheese");
                        System.out.println ("N or n for none of the above");
                        burgerChoice = myScanner.next();
                        //nested switch statement to further specify output from user input
                            switch (burgerChoice) {
                                case "A":   System.out.println ("You ordered a burger with all the toppings");
                                break;
                                case "a":   System.out.println ("You ordered a burger with all the toppings");
                                break;
                                
                                case "C":   System.out.println ("You ordered a burger with cheese");
                                break;
                                case "c":   System.out.println ("You ordered a burger with cheese");
                                break;
                                
                                case "N":    System.out.println ("You ordered a plain burger");
                                break;
                                case "n":   System.out.println ("You ordered a plain burger");
                                
                                break;
                            }
                            break;
                        
            case "b":   System.out.println ("Enter A or a for all the toppings");
                        System.out.println ("C or c for cheese");
                        System.out.println ("N or n for none of the above");
                        burgerChoice = myScanner.next();
                            //nested switch statement to further specify output from user input
                            switch (burgerChoice) {
                                case "A":   System.out.println ("You ordered a burger with all the toppings");
                                break;
                                case "a":   System.out.println ("You ordered a burger with all the toppings");
                                break;
                                
                                case "C":   System.out.println ("You ordered a burger with cheese");
                                break;
                                case "c":   System.out.println ("You ordered a burger with cheese");
                                break;
                                
                                case "N":   System.out.println ("You ordered a plain burger");
                                break;
                                case "n":   System.out.println ("You ordered a plain burger");
                                
                                break;
                            }
                            break;
                        
            case "S":   System.out.println ("Enter P or p for pepsi");
                        System.out.println ("C or c for Coke");
                        System.out.println ("S or s for Sprite");
                        System.out.println ("M or m for Mountain Dew");
                        sodaChoice = myScanner.next();
                            //nested switch statement to further specify output from user input
                            switch (sodaChoice) {
                                case "P": System.out.println ("You ordered a Pepsi");
                                break;
                                case "p": System.out.println ("You ordered a Pepsi");
                                break;
                                
                                case "C": System.out.println ("You ordered a Coke");
                                break;
                                case "c": System.out.println ("You ordered a Coke");
                                break;
                                
                                case "S": System.out.println ("You ordered a Sprite");
                                break;
                                case "s": System.out.println ("You ordered a Sprite");
                                break;
                                
                                case "M": System.out.println ("You ordered a Mountain Dew");
                                break;
                                case "m": System.out.println ("You ordered a Mountain Dew");
                                break;
                            }
                            break;
                        
            case "s":   System.out.println ("Enter P or p for pepsi");
                        System.out.println ("C or c for Coke");
                        System.out.println ("S or s for Sprite");
                        System.out.println ("M or m for Mountain Dew");
                        sodaChoice = myScanner.next();
                        //nested switch statement to further specify output from user input
                            switch (sodaChoice) {
                                case "P": System.out.println ("You ordered a Pepsi");
                                break;
                                case "p": System.out.println ("You ordered a Pepsi");
                                break;
                                
                                case "C": System.out.println ("You ordered a Coke");
                                break;
                                case "c": System.out.println ("You ordered a Coke");
                                break;
                                
                                case "S": System.out.println ("You ordered a Sprite");
                                break;
                                case "s": System.out.println ("You ordered a Sprite");
                                break;
                                
                                case "M": System.out.println ("You ordered a Mountain Dew");
                                break;
                                case "m": System.out.println ("You ordered a Mountain Dew");
                                break;
                            }
                            break;
                        
            case "F":   System.out.println ("L or l for large fries");
                        System.out.println ("S or s for small fries");
                        friesChoice = myScanner.next();
                            //nested switch statement to further specify output from user input
                            switch (friesChoice) {
                                case "L": System.out.println ("You ordered large fries");
                                break;
                                case "l": System.out.println ("You ordered large fries");
                                break;
                                
                                case "S": System.out.println ("You ordered small fries");
                                break;
                                case "s": System.out.println ("You ordered small fries");
                                break;
                            }
                            break;
            case "f":   System.out.println ("L or l for large fries");
                        System.out.println ("S or s for small fries");
                        friesChoice = myScanner.next();
                            //nested switch statement to further specify output from user input
                            switch (friesChoice) {
                                case "L": System.out.println ("You ordered large fries");
                                break;
                                case "l": System.out.println ("You ordered large fries");
                                break;
                                
                                case "S": System.out.println ("You ordered small fries");
                                break;
                                case "s": System.out.println ("You ordered small fries");
                                break;
                            }
                            break;
                            
            default:    System.out.println ("Did not enter any of B, b, S, s, F or f");
        }
    }
}