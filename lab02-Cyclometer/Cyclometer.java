//Thomas Lindberg
//9/05/2014
//CSE2
//lab02
//Program should: print the number of minutes, number of counts, the distance for each trip, and the distance for two trips

public class Cyclometer{
    //main method required for every Java program
    
    public static void main(String [] args) {
        
        int secsTrip1=480; //number of seconds in Trip 1
        int secsTrip2=3220; //number of seconds in Trip 2
        int countsTrip1=1561; //number of counts in Trip 1
        int countsTrip2=9037; //number of counts in Trip 2
        
        double wheelDiameter=27.0, //Diameter of the wheel
        PI=3.14159, // the constant value of PI
        feetPerMile=5280, // number of feet per mile
        inchesPerFoot=12, // number of inches per foot
        secondsPerMinute=60; // number of seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; //initializes variables
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        
        //run the calculations; store the values. Document your calculation here
        //Calculates minutes and number of counts during trips
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;
        //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was " +totalDistance+" miles");
        //print out the output data
    }
    //end of main method
    
} //end of class

