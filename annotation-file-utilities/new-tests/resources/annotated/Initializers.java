package annotator.tests;

public class Initializers {
  static {
    String s1 = new @X String();
  }

  static {
    String s2 = new @X String();
  }

  {
    Object o1 = new @X Object();
  }

  {
    Object o2 = new @X Object();
  }

  enum MyEnum {
    A;

    static {
      String s = new @X String();
    }

    {
      Object o = new @X Object();
    }
  }
}
