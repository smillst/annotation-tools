package annotator.tests;

import java.util.List;

public class NewMultiple {
  void foo(Object o) {
    List var = (/* @Tainted*/ @java.lang.Tainted List) o;
    System.out.println(var);
  }

  void bar(Object o) {
    List var = (/* @UnderInitialization*/ @java.lang.UnderInitialization List) o;
    System.out.println(var);
  }
}
