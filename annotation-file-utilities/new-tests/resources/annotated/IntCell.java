package annotator.tests;

public class IntCell {
  private int i;

  public IntCell(int in) {
    this.i = in;
  }

  public void set(@java.lang.UnderInitialization IntCell this, int in) {
    this.i = in;
  }

  public int get(@java.lang.Tainted IntCell this) {
    return i;
  }
}
