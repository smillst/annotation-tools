package annotator.tests;

public class ArrayParamSimple {

  public void m1(@java.lang.Tainted Integer[] arg) { }

  public void m2(Integer @java.lang.Tainted [] arg) { }

  public void m3(@java.lang.Nullable Integer[] arg) { }

  public void m4(Integer @java.lang.Nullable [] arg) { }

  public void m5(Integer[] arg) { }

  public void m6(Integer[] arg) { }

  public void m7(Integer[] arg) { }

  public void m8(Integer[] arg) { }

}
