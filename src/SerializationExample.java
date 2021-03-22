import java.io.*;

class Person implements Serializable {
  private static final long serialVersionUID = 1L;
  static String country = "ITALY";
  private int age;
  private String name;
  transient int height;

  //region GetSet
  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public static String getCountry() {
    return country;
  }

  public static void setCountry(String country) {
    Person.country = country;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
  //endregion

}
public class SerializationExample {
  public static void main(String args[])  throws IOException, ClassNotFoundException {
    Person person = new Person();
    person.setAge(20);
    person.setName("Joe");

    FileOutputStream fileOutputStream
        = new FileOutputStream("D:/yourfile.txt");
    ObjectOutputStream objectOutputStream
        = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(person);
    objectOutputStream.flush();
    objectOutputStream.close();

    System.out.println(person.getAge() + person.getName());

    FileInputStream fileInputStream
        = new FileInputStream("D:/yourfile.txt");
    ObjectInputStream objectInputStream
        = new ObjectInputStream(fileInputStream);
    Person p2 = (Person) objectInputStream.readObject();
    objectInputStream.close();

    System.out.println(p2.getAge() + p2.getName());
  }
}
