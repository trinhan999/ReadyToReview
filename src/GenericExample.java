import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class GenericMethodTest {
  // generic method printArray
  public static <E> void printArray(E[] inputArray) {
    // Display array elements

    for (E element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }

  public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
    return Arrays.stream(a)
        .map(mapperFunction)
        .collect(Collectors.toList());
  }
}

public class GenericExample {
  public static void main(String args[]) {
    // Create arrays of Integer, Double and Character
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    String[] stringArray = {"nhan", "phuc", "hien"};

    List<String> stringList = GenericMethodTest.fromArrayToList(intArray, Object::toString);

    for (String s : stringList) {
      System.out.printf(s);
    }
    System.out.println();

    System.out.println("Array integerArray contains:");
    GenericMethodTest.printArray(intArray);

    System.out.println("\nArray doubleArray contains:");
    GenericMethodTest.printArray(doubleArray);

    System.out.println("\nArray stringArray contains:");
    GenericMethodTest.printArray(stringArray);
  }
}

