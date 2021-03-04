public class StaticFinal {
  public static final int STEP = 5;
  public static int count = 0;

  StaticFinal() {
    count += STEP;
  }

  static void prin() {
    System.out.println(count);
  }
}

class SFMain {
  public static void main(String args[]) {
    StaticFinal x = new StaticFinal();
    StaticFinal.prin();
    StaticFinal y = new StaticFinal();
    y.prin();
  }
}