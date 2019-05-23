package annotator.tests;

import java.util.Date;

public class TypeParamMethod {

  public <@java.lang.Tainted T> void foo(T t) {
    System.out.println(t);
  }

  public <@java.lang.Tainted T extends Date> void foo2(T t) {
    System.out.println(t);
  }

  public <T, @java.lang.Tainted U> void foo(T t, U u) {
    System.out.println(t);
    System.out.println(u);
  }

  public <T extends Date, @java.lang.Tainted U extends Date> void foo2(T t, U u) {
    System.out.println(t);
    System.out.println(u);
  }
}
