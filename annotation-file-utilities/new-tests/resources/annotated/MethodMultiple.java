package annotator.tests;

public class MethodMultiple {
  public String foo() {
    return null;
  }

  public @java.lang.UnderInitialization String foo(String s) {
    return null;
  }
}
