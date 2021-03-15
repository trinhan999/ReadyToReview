class Propagation {
  void m() {
    int data = 50 / 0; // unchecked exception occurred
  }

  void n() {
    m();
  }

  void p() {
    try {
      n();
    } catch (Exception e) {
      //e.printStackTrace();
      System.out.println("Exception handled");
    }
  }
}

class CustomException extends Exception {

  public CustomException(String message) {
    super(message);
  }

  public CustomException(String message, Throwable cause) {
    super(message, cause);
  }
}

public class ExceptionsExample {
  public static void main(String[] args) throws Exception {
    Propagation obj = new Propagation();
    obj.p();
    System.out.println("Normal flow...");

    try {
      throw new NumberFormatException("Exception");
    } catch (NumberFormatException ex) {
      //ex.printStackTrace();
      throw new CustomException("NullPointerEx", ex);
    } catch (Exception e) {
      throw new Exception("Exception", e);
    }
  }
}
