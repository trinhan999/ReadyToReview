import java.util.Objects;
class Hsx implements Cloneable {
  private int iD;
  private String name;
  //region getSet
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getiD() {
    return iD;
  }

  public void setiD(int iD) {
    this.iD = iD;
  }
  //endregion

  public Hsx(String name, int iD) {
    this.name = name;
    this.iD = iD;
  }

  public Object clone() throws CloneNotSupportedException
  {
    return super.clone();
  }

}

class Car implements Cloneable {
  private String name;
  private double speed;
  private double weight;
  private Hsx hSX;

  public Car(String name, double speed, double weight, Hsx hSX) {
    this.name = name;
    this.speed = speed;
    this.weight = weight;
    this.hSX = hSX;
  }

  //region GetSet
  public Hsx gethSX() {
    return hSX;
  }

  public void sethSX(Hsx hSX) {
    this.hSX = hSX;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
  //endregion

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Car)) return false;
    Car car = (Car) o;
    return Double.compare(car.speed, speed) == 0 && Double.compare(car.weight, weight) == 0 && Objects.equals(name, car.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, speed, weight);
  }

  public Object clone() throws CloneNotSupportedException
  {
    Car c = (Car)super.clone();
    c.hSX = (Hsx) hSX.clone();
    return c;
  }
}
public class CommonMethods {
  public static void main(String args[]) throws CloneNotSupportedException {
    Hsx s1 = new Hsx("ford", 1);
    Hsx s2 = new Hsx("honda",2);
    Car c1 = new Car("c1", 100, 500, s1);
    Car c2 = (Car) c1.clone();
    Car c3 = new Car("c3", 200, 300, s1);

    System.out.println(c1.equals(c2));
    System.out.println(c1 == c2);
    System.out.println(c1.equals(c3));
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());

    c1.setSpeed(300);
    System.out.println(c2.getSpeed());
    c1.gethSX().setName("honda");
    System.out.println(c1.gethSX().getName());
    System.out.println(c2.gethSX().getName());
  }

}
