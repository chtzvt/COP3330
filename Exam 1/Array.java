import java.util.Scanner;
import java.util.Arrays;

public class Array {
  private static int[][] t;
  
  public static void main(String[] args) {
    
    // [3 points] Write code to prompt the user to input the number of rows and columns for this array t.
    System.out.printf("Welcome to the Array program!%nPlease enter the following values:%n");
    
    Scanner s = new Scanner(System.in);

    System.out.print("How many rows are in the array? ");
    int rows = s.nextInt();

    System.out.print("How many columns are in the array? ");
    int cols = s.nextInt();
    
    // [3 points] Write a statement that declares and creates t (using rows and cols from step 1.).
    t = new int[rows][cols];
    
    // [3 points] Print out how many elements does t have.
    System.out.printf("%nYour new array has %d rows and %d columns.%n", t.length, t[0].length);
    System.out.printf("Your new array has %d elements.%n", (t.length * t[0].length));
    
    // [2 points] Write a single statement that sets the element of t in row 0 and column 1 to zero.
    t[0][1] = 0;
    
    // [3 points] Write a nested for statement that initializes each element of t to zero.
    for(int row[] : t)
      for(int entry : row)
        entry = 0;
        
    // [3 points] Write a nested for statement that inputs the values for the elements of t from the user.
    System.out.printf("%nPlease enter in the following values for the array:%n");
    for(int i = 0; i < t.length; i++){
      for(int j = 0; j < t[i].length; j++){
        System.out.printf("\tWhat value should be placed in row %d, column %d? ", i, j);
        t[i][j] = s.nextInt();
      }
    }
    
    // [3 points] Write a series of statements that determines and displays the smallest value in t.
    int smallest = t[0][0];
    for(int row[] : t)
      for(int entry : row)
        smallest = (entry < smallest) ? entry : smallest;
        
    System.out.printf("%nThe smallest value in your array is %d.%n", smallest);
    
    // [3 points] Write a single printf statement that displays the elements of the first row of t.
    System.out.printf("The first row of your array looks like this: %s%n", Arrays.toString(t[0]));
    
    // [3 points] Write a statement that totals the first 2 elements of the third column of t. Do not use iteration.
    int sum = t[0][2] + t[1][2];
    
    
    
    
  }
  
  // [3 points] Write a method, call it sum, that returns the sum of any two elements of the array t passed in as parameters.
  private static int sum(int elem1, int elem2){
    return elem1 + elem2;
  }

}
