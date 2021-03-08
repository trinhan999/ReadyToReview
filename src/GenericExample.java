import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.List;

class GenericMethodTest {
  // generic method printArray
  public static <E> void printArray(E[] inputArray) {
    // Display array elements

    for (E element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }
}

public class GenericExample {
  public static void main(String args[]) {
    // Create arrays of Integer, Double and Character
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
    String[] stringArray = {"nhan", "phuc", "hien"};

    System.out.println("Array integerArray contains:");
    GenericMethodTest.printArray(intArray);

    System.out.println("\nArray doubleArray contains:");
    GenericMethodTest.printArray(doubleArray);

    System.out.println("\nArray characterArray contains:");
    GenericMethodTest.printArray(charArray);

    System.out.println("\nArray stringArray contains:");
    GenericMethodTest.printArray(stringArray);
  }
}
