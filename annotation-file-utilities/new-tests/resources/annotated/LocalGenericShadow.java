package annotator.tests;

import java.util.List;


public class LocalGenericShadow {
  public List<String> foo = null;

  public void method() {
    @java.lang.UnderInitialization List<Integer> foo = null;
    System.out.println(foo);
  }
}
