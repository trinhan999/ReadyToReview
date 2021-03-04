import java.util.Objects;

public class StringMain {
  public static void main(String args[]) {
    String s1 = "java";
    String s2 = "java";
    String s3 = new String("java");
    String s4 = "javaScript";
    String s5 = "C#";
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
    System.out.println("do dai s1 " + s1.length());
    System.out.println("s1 - s4 " + s1.compareTo(s4));
    System.out.println("s1 - s3 " + s1.compareTo(s3));
    System.out.println("s1 - s5 " + s1.compareTo(s5));
    System.out.println("s4 chua s1 " + s4.contains(s1));
    System.out.println(s5.replace("#", "++"));
  }
}
