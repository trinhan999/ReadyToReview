import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface ClosureInf{
  public int Lambdamethos(int x, int y);
}

class animal implements Cloneable {

  public animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof animal)) return false;
    animal animal = (animal) o;

    return Objects.equals(name, animal.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  protected Object clone() throws CloneNotSupportedException {
    animal cloned = (animal) super.clone();
    return cloned;
  }

}

public class ClousureLambdaStream {
  public static void main(String args[]) throws CloneNotSupportedException {
    animal a1 = new animal("cat");
    animal a2 = (animal) a1.clone();
    animal a3 = new animal("Cat");

    System.out.println(a1.equals(a2));
    System.out.println(a1.hashCode());
    System.out.println(a3.hashCode());

    List<animal> zoo = new ArrayList<>();
    zoo.add(new animal("cat"));
    zoo.add(new animal("cat"));
    zoo.add(new animal("dog"));
    zoo.add(new animal("bird"));

    ClosureInf ogj = (s1,s2) -> {
      return ( s1 + s2 ) * s1 ;
    };

    Consumer<animal> met = (n) -> {System.out.print(n.getName() + " ");};
    zoo.forEach(met);
    System.out.println();

    Stream<animal> animalStream = zoo.stream();
    zoo = animalStream.filter((a) -> a.getName() == "cat" || a.getName() == "bird").collect(Collectors.toList());
    zoo.forEach((a) -> System.out.print(a.getName() + " "));
    System.out.println();

    System.out.println(ogj.Lambdamethos(5,6));
  }
}
