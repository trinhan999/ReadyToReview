import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class human implements Comparable<human> {
  private String name;
  private int age;
  private double height;

  public human(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }


  public int compareTo(human m) {
    return Comparator.comparing(human::getName)
        .thenComparing(human::getAge).thenComparing(human::getHeight).compare(this, m);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}

public class Compare {
  public static void main(String args[]) {
    ArrayList<human> mk = new ArrayList<>();
    mk.add(new human("nhan", 23, 1.72));
    mk.add(new human("phuc", 30, 1.72));
    mk.add(new human("nhan", 17, 1.82));

    Collections.sort(mk);
    for (human h : mk) {
      System.out.println(h.getName()+" "+h.getAge()+" "+h.getHeight());
    }
  }
}
