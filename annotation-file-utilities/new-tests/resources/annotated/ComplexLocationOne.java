package annotator.tests;

import java.util.List;
import java.util.Map;

public class ComplexLocationOne {
  public @java.lang.A List< @java.lang.B Map<@java.lang.C Integer, @java.lang.D String @java.lang.E []>> field;
  public List< Outer<@java.lang.A Integer, @java.lang.B String[]>.@java.lang.C Inner<@java.lang.D Integer, @java.lang.E String[]>> entries;
  class Outer<W, X> { class Inner<Y, Z> {} }
}
