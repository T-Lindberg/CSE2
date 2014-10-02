//Thomas Lindberg
//CSE2
//hw05
//BoolaBoola
//9.30.14
//Purpose: To practice using boolean expressions

//import scanner class
import java.util.Scanner;
//import random class
import java.util.Random;
public class BoolaBoola {
    
    //main method required for every java program
    public static void main(String [] args) {
        
        //declare scanner and random
        Scanner myScanner = new Scanner (System.in);
        Random myRandom = new Random();  
        //delclare variables
        boolean val1 = myRandom.nextBoolean();  
        boolean val2 = myRandom.nextBoolean();  
        boolean val3 = myRandom.nextBoolean();  
        boolean sign1 = myRandom.nextBoolean();  
        boolean sign2 = myRandom.nextBoolean();  
        boolean answer;  
        String input;
        
        //randomized sign1 and sign2 and matched system out prints that would print different && and || depending on whether sign1 or sign2 is true or false
        if (sign1 == true) {  
          if (sign2 == true) {   
            System.out.println("Does " + val1 + " && " + val2 + " && " + val3 + " have the value true(t/T) or false(f/F)?"); 
            answer = val1 && val2 && val3;
          }  
          else {   System.out.println("Does " + val1 + " && " + val2 + " || " + val3 + " have the value true(t/T) or false(f/F)?");  
            answer = val1 && val2 || val3;
          }
        }
        else{
          if (sign2 == true) {
            System.out.println("Does " + val1 + " || " + val2 + " && " + val3 + " have the value true(t/T) or false(f/F)?"); 
            answer = val1 || val2 && val3;
          }
          else {
            System.out.println("Does " + val1 + " || " + val2 + " || " + val3 + " have the value true(t/T) or false(f/F)?"); 
            answer = val1 || val2 || val3;
          }
        }
        
        input = myScanner.next();
        
        //determines whether user input is correct or wrong using switch and nested if statements
        boolean inputBoolean;
        switch (input) {
          case "f":  inputBoolean = false;
          if (answer == false){
              System.out.println ("Correct");
          }
          else {
              System.out.println ("Wrong, try again");
          }
          break;
          case "F":  inputBoolean = false;
          if (answer == false){
              System.out.println ("Correct");
          }
          else {
              System.out.println ("Wrong, try again");
          }
          break;
          case "t":  inputBoolean = true;
          if (answer == true){
              System.out.println ("Correct");
          }
          else {
              System.out.println ("Wrong, try again");
          }
          break;
          case "T":  inputBoolean = true;
          if (answer == true){
              System.out.println ("Correct");
          }
          else {
              System.out.println ("Wrong, try again");
          }
          break;
          default: System.out.println("Wrong; try again");
          break;
        }
        
        
    }
} 
                