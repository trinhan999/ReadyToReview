import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
enum CPUcore {
  I3,
  I5,
  I7,
  I9
}

@Retention(value = RetentionPolicy.SOURCE)
@Target(value = {ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@interface MyAnno {
  String description();
}

public class Enum_annotation {
  public static void main(String args[]) {
    for (CPUcore core : CPUcore.values()) {
      System.out.println(core);
    }
    System.out.println("-----------------------------------------");
    @MyAnno(description = "loai bo canh bao")
    @SuppressWarnings("deprecation")
    CPUcore c1 = CPUcore.I7;
    switch (c1) {
      case I3:
        System.out.println(c1 + " weak");
        break;
      case I5:
        System.out.println(c1 + " average");
        break;
      case I7:
        System.out.println(c1 + " strong");
        break;
      case I9:
        System.out.println(c1 + " Strongest");
        break;
    }
  }
}
