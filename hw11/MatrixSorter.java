//Thomas Lindberg
//CSE2
//hw11
//MatrixSorter
//12/04/14
//Purpose:To practice manipulating arrays and multidimensional arrays, writing methods that have array parameters, and in searching and sorting arrays

//import classes
import java.util.Random;
import java.util.Arrays;


public class MatrixSorter {
    
    //main method required for every java program
    public static void main (String arg[]) {
        
        //initialize array
        int mat3d[][][];
        
        //call method to populate array
        mat3d = buildMat3d();
        
        //call method to print array
        show(mat3d);
        
        //call method to find minimum 
        System.out.println("The smallest entry in the 3D matrix is "+ findMin(mat3d));
        System.out.println();
        System.out.println("After sorting the 3rd matrix we get");
        
        //call method to sort third slab
        sort(mat3d[2]);
        
        //call method to print array
        show(mat3d);   
      }
      
    //create method int to populate array  
    public static int[][][] buildMat3d() {
        //declare random
        Random myRandom = new Random();
        int mat3d[][][];
        
        //initialize new array
        mat3d = new int [3][7][9];
        
        //for loop to iterate over slabs
        for (int s = 0; s < 3; s++) {
            
          //for loop to iterate over rows
          for (int rows = 0; rows < 3+s*2; rows ++) {
              
            //for loop to iterate over columns
            for (int j = 0; j < (s+rows+1); j ++) {
                
              //populate selection with a random int 1-99
              mat3d[s][rows][j] = (myRandom.nextInt(99) + 1);
              
            }
          }
        }
        //return populated matrix
        return mat3d;
      }
     //initialize method to print matrix
     public static void show(int[][][] mat3d) {
         
        //for loop to print matrix
        for (int s = 0; s < 3; s ++) {
          System.out.println("---------------------------Slab " + (s+1));
          for (int rows = 0; rows < 3+s*2; rows ++) {
            for (int j = 0; j < mat3d[s][rows].length; j++) {
              if (mat3d[s][rows][j] > 0) {
              System.out.print(mat3d[s][rows][j] + "  ");
              }
            }
            System.out.println();
          }
        }
      }
     //initialize method to find minimum number in matrix
     public static int findMin(int[][][] mat3d) {
        int min = 100;
        
        //finds minimum
        for (int s = 0; s < 3; s ++) {
          for (int rows = 0; rows < 3+s*2; rows ++) {
            for (int j = 0; j < (s+rows+1); j++) {
              if (mat3d[s][rows][j] < min) {
                min = mat3d[s][rows][j];
              }
            }
          }
        }
        
        return min;
      }
      
    //initialize method to sort given slab
    public static void sort(int[][] mat3d) {
        //for loops to check and sort each row in ascending order
        for (int k = 0; k < 3; k ++) {
          for (int i = 0; i < 3+k*2; i ++) {
            for (int j = 1; j < i+k+1; j++)
              for (int n = 0; n < i+k+1; n++) {
              if (mat3d[i][n] > mat3d[i][j]) {
                int temp = mat3d[i][n];
                mat3d[i][n] = mat3d[i][j];
                mat3d[i][j] = temp;
              }
            }
          }
        }
        int k = 2;
          //for loops to sort the rows in third slab in ascending order
          for (int i = 1; i < 3+k*2; i ++) {
            for (int n = 0; n < 3+k*2; n ++) {
              if (mat3d[n][0] > mat3d[i][0]) {
                int temp[] = mat3d[n];
                mat3d[n] = mat3d[i];
                mat3d[i] = temp;
              }
          }
        }
      }
}