import java.util.*;

public class java_col_main {
  public static void main(String args[]) {
    ArrayList<Integer> num = new ArrayList<Integer>();
    for (int i = 0; i < 20; i++) {
      num.add((int) (Math.random() * 11));
    }
    System.out.println(num);
    Collections.sort(num);
    System.out.println(num);

    System.out.println("--------------------------------");
    LinkedList<Integer> num1 = new LinkedList<Integer>();
    for (int i = 0; i < 20; i++) {
      num1.add((int) (Math.random() * 11));
    }
    System.out.println(num1);
    Collections.sort(num1);
    Collections.reverse(num1);
    System.out.println(num1);

    System.out.println("--------------------------------");
    HashMap<Integer, String> number = new HashMap<Integer, String>();
    number.put(1, "mot");
    number.put(2, "hai");
    number.put(3, "ba");
    number.put(4, "bon");
    number.put(5, "nam");
    System.out.println(number.get(2));
    System.out.println("size :" + number.size());
    number.remove(4, "bon");
    System.out.println("size :" + number.size());

    System.out.println("--------------------------------");
    for (String i : number.values()) {
      System.out.println(i);
    }

    System.out.println("--------------------------------");
    for (int i : number.keySet()) {
      System.out.println(i);
    }

    System.out.println("--------------------------------");
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Iterator<String> carsSset = cars.iterator();
    while (carsSset.hasNext()) {
      System.out.println(carsSset.next());
    }

    System.out.println("--------------------------------");
    cars.remove("Ford");
    carsSset = cars.iterator();
    while (carsSset.hasNext()) {
      System.out.println(carsSset.next());
    }
  }
}
