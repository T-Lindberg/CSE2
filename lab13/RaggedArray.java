import java.util.Random;

public class RaggedArray {
  public static void main (String [] args) {
    Random myRandom = new Random();
    int myArray[][] = new int[5][17];
    System.out.println("The array before sorting");
    for (int i = 0; i < 5; i ++) {
      for (int j = 0; j < i*3+5; j ++) {
        myArray[i][j] = myRandom.nextInt(40);
        System.out.print(myArray[i][j] + "  ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("The array after sorting");
    for (int i = 0; i < 5; i ++) {
      for (int j = 1; j < i*3+5; j ++) {
        for (int k = 0; k < i*3+5; k ++) {
          if (myArray[i][k] > myArray[i][j]) {
            int temp = myArray[i][k];
            myArray[i][k] = myArray[i][j];
            myArray[i][j] = temp;
          }
        }
      }
    }
    for (int i = 0; i < 5; i ++) {
      for (int j = 0; j < i*3+5; j ++) {
        System.out.print(myArray[i][j] + "  ");
      }
      System.out.println();
    }
  }
}