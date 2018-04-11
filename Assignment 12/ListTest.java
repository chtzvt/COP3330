// Exercise 21.21 Solution: ListTest.java
// Program recursively searches a list of numbers.
import java.util.Random;

public class ListTest {
   public static void main(String[] args) {
      List<Integer> list = new List<>();
      int number;
      Random randomNumber = new Random();

      // create objects to store in the List
      for (int i = 0; i <25; i++) {
         number = randomNumber.nextInt(101);
         list.insertAtFront(number);
      }

      list.print();
      
      Integer searchResult = list.search(34);

      // display result of searching 34
      if (searchResult != null) {
         System.out.println("Value found: 34");
      }
      else {
         System.out.println("Value not found: 34");
      }
      
      searchResult = list.search(50);

      // display result of searching 50
      if (searchResult != null) {
         System.out.println("Value found: 50");
      }
      else {
         System.out.println("Value not found: 50");
      }
      
      searchResult = list.search(72);

      // display result of searching 72
      if (searchResult != null) {
         System.out.println("Value found: 72");
      }
      else {
         System.out.println("Value not found: 72");
      }
   }
}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
