package annotator.tests;

import java.util.List;

public class ConstructorParamMultiple {
  public ConstructorParamMultiple(
      /* @Tainted*/ @java.lang.Tainted Object a,
      /* @Tainted*/ @java.lang.Tainted List</* @UnderInitialization*/ @java.lang.UnderInitialization Integer> b,
      /* @Tainted*/ @java.lang.Tainted int c) {

  }
}
