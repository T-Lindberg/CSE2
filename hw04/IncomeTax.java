//Thomas Lindberg
//CSE2
//hw04
//IncomeTax
//9/23/14

import java.util.Scanner;

public class IncomeTax {
    //main method required for every program
    public static void main(String [] args) {
        //declare scanner 
       Scanner myScanner = new Scanner (System.in);
       //prompt user for input
        System.out.println ("Enter thousands of dollars of income: ");
        int income = myScanner.nextInt();
        
        double tax = 0;
        income *= 1000;
        //conditions under which income is taxed accordingly
        if (income >= 0){
            if (income < 20) {
                tax = .05;
                System.out.println ("The tax rate on $"+income+" is 5%, and the tax is $"+(int)(tax*income));
            }
            else if (income <40) {
                tax = .07;
                System.out.println ("The tax rate on $"+income+" is 7%, and the tax is $"+(int)(tax*income));
            }
            else if (income <78) {
                tax = .12;
                System.out.println ("The tax rate on $"+income+" is 12%, and the tax is $"+(int)(tax*income));
            }
            else {
                tax = .14;
                System.out.println ("The tax rate on $"+income+" is 14%, and the tax is $"+(int)(tax*income));
            }
        }
        //conditions if int entered does not meet requirements
        else if (income < 0) {
            System.out.println ("You did not enter a positive int");
        }
        else {
            System.out.println ("You did not enter an int");
        }
    }  
}
