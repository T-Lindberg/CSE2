//Thomas Lindberg
//CSE2
//9.15.14
//hw03
//Bicycle.java

import java.util.Scanner;
//import scanner class

public class Bicycle {
    //main method required for every java program
    public static void main(String [] args) {
        
        Scanner myScanner;
        //declare instance of scanner object
        
        myScanner = new Scanner (System.in);
        //call scanner constructor
        
        System.out.print ("Enter number of counts: ");
        int nCounts = myScanner.nextInt ();
        //prompts user for number of counts
        System.out.print ("Enter number of seconds: ");
        int nSeconds = myScanner.nextInt ();
        //prompts user for number of seconds
        
        double wheelDiameter=27.0, //Diameter of the wheel
        PI=3.14159, // the constant value of PI
        feetPerMile=5280, // number of feet per mile
        inchesPerFoot=12, // number of inches per foot
        secondsPerMinute=60; // number of seconds per minute
        double distanceTraveled, averageMilesPerHour;
        
        distanceTraveled = nCounts*wheelDiameter*PI;
        distanceTraveled /= (inchesPerFoot*feetPerMile);
        averageMilesPerHour = (distanceTraveled/nSeconds*3600);
        //computation of distance traveled and average miles
        
        
        System.out.println ("Distance traveled was: " +(int) (distanceTraveled*100)/100.0+ " miles");
        System.out.println ("Average miles per hour was: "+ (int) (averageMilesPerHour*100)/100.0+ " miles per hour");
        
        //prints out a more visually appealing computation
        
        
        
    }
}
