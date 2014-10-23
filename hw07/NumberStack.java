//Thomas Lindberg
//CSE2
//Hw07
//NumberStack
//10.20.14
//Purpose: To practice with writing while, for, and do-while loops.

//import scanner
import java.util.Scanner;

public class NumberStack {
    
    //main method required for every java program
    public static void main(String [] args){
        
        //declare scanner
        Scanner myScanner = new Scanner (System.in);
        
        //prompt user for input
        System.out.println ("Enter an integer between 1 and 9: ");
        
        //initializing variables
        int input = myScanner.nextInt ();
        int i=0;
        int j=0;
        int k=0;
        int n=0;
        int m=0;
        //conditions for input    
        if ((input<1) || (input>9)){
            System.out.println ("Invalid Input");
            
        }
        
        //statement to construct stacks
        else{
        
        System.out.println ("Using for loops: ");
        
            //for loop that runs through until the amount of times run is equal to the input 
            for (i=1;i<=input;i++){
                
                
                //for loop that creates each row for each value of i
                for (j=1;j<=i;j++){
                    
                    
                    //for loop that reprints i the amount of times equal to i*2-1
                    for (k=1;k<=(i*2-1);k++){
                        
                        System.out.print(i);
                        
                    }
                    
                    System.out.println();
                }
               
                //prints - the amount of times equal to i*2
                for (k=1;k<=(i*2-1);k++){
                    System.out.print ("-");
                }
                System.out.println ();
                
            }
            
        
        System.out.println ("Using for while loops: ");
            
        i=1;
        j=1;
        k=1;
        
            //while loop that runs through until the amount of times run is equal to the input 
            while (i<=input){
                j=1;
                //while loop that creates the same amount of rows equal to the i value
                
                while (j<=i){
                    
                   k=1;
                    //while loop that reprints i the amount of times equal to i*2-1
                    
                    while (k<=(i*2-1)){
                        
                        System.out.print(i);
                        k++;
                    }
                
                System.out.println();
                j++; 
                
                }
                k =1;
                //while loop that prints - the amount of times equal to i*2-1
                while (k<=(i*2-1)){
                    
                    System.out.print("-");
                    k++;
                    
                    
                }
                System.out.println();
                i++;
            }
            
            
            System.out.println ("Using for do-while loops: ");
            
        i=1;
        j=1;
        k=1;
        
            //do-while loop that runs through until the amount of times run is up to the input
            
            do {
                j=1;
                //do-while loop that creates the same amount of rows equal to the i value
                
                do {
                    
                   k=1;
                    //do-while loop that reprints i the amount of times up to i*2-1
                    
                    do{
                        
                        System.out.print(i);
                        k++;
                    }while (k<(i*2));
                
                System.out.println();
                j++; 
                
                } while (j<=i);
                k =1;
                
                //do-while loop that prints - the amount of times up to i*2
                do{
                    
                    System.out.print("-");
                    k++;
                    
                    
                }while (k<(i*2));
                System.out.println();
                i++;
            } while (i<=input);
            
            
        
        }
    
    }
}