package annotator.tests;

public class NewSimple {
  public void foo() {
    Object o = new @java.lang.Tainted Object();
    System.out.println(o);
  }
}
