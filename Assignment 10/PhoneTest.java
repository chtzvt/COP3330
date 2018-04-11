// Exercise 15.7 Solution: PhoneTest.java
// Testing the Phone class.
import java.util.Scanner;
import java.util.NoSuchElementException;

public class PhoneTest {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      Phone application = new Phone();
      System.out.print(
         "Enter phone number (digits greater than 1 only): ");

      try {
         application.calculate(scanner.nextInt());
      }
      catch (NoSuchElementException elementException) {
         System.err.println("Error inputting data.");
      }
   }
}

/*************************************************************************
* (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
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
