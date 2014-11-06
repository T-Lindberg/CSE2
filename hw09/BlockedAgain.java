//Thomas Lindberg
//CSE2
//hw09
//BlockedAgain
//11.03.14
//Purpose: To practice designing a nested sequence of methods calls that divdes a larger problem into subproblems


//import scanner class
import java.util.Scanner;

public class BlockedAgain {
  
  //main method
  public static void main (String []s){
    
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt();
    
    allBlocks(m);
    
  }
  //method to prompt user for input
  public static int getInt() {
    int inputNumber = 0;
    
    System.out.println("Enter an integer 1-9, inclusive: ");
    
    inputNumber = checkInt();
    
    return inputNumber;
    
  }
  //method to check if input is an int
  public static int checkInt() {
    
    Scanner myScanner = new Scanner(System.in);
    
    int inputNumber = 0;
    int range = 0;
    
    do {
      inputNumber = myScanner.nextInt();
      
      if (inputNumber != 0) {
        range = checkRange(myScanner, inputNumber);
      }
      else {
        System.out.println("That is not an appropriate integer. Try again: ");
        range = 0;
      }
    } while (range == 0);
    
    return inputNumber;
  }
  
  //method to check if input is within range
  public static int checkRange(Scanner myScanner, int inputNumber) {
    
    if ((inputNumber > 0) && (inputNumber < 10)) {
      System.out.println();
      return inputNumber;
      
    }
    else {
      System.out.println("Integer out of range [1,9], inclusive. Try again: ");
      return 0;
    }
  }
  //method to print stacks
  public static int allBlocks (int m){
    int i;
    
    //for loop that runs through until the amount of times run is equal to the input
    for (i=1;i<=m;i++){
      
      //calls block method with parameter m to formulate row portion of output
      block(i);
      //will print out all the blocks
      System.out.println();
      
    }
    
    return m;
  }
  
  //method to create blocks
  public static int block(int m){
    int n=0;
    int k;
    int count;
      //for loop that creates each row for each value of i
      for (count=1;count<=m;count++){
    
      //calls line method with parameters m and n to formulate line portion of output
      n = line(m,n);
      
      }
      
      //prints - the amount of times equal to i*2
      for (k=1;k<=(m*2-1);k++){
      System.out.print ("-");
      }
      
      return m;
      
  }
  
  //method to create length of repeating input number
  public static int line(int m, int n){
    int count2;
    
    for (count2=1; count2 <= (m*2-1); count2++){
      System.out.print (m); 
    }
    System.out.println ();
    
    
    return m;
    
    
  }
}





