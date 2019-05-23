import java.lang.annotation.*;
import java.util.*;

@Target(ElementType.TYPE_USE)
@interface X {}
@Target(ElementType.TYPE_USE)
@interface Y {}

public class GenericCellDoubled {
  List<@X Object> f;
  @X List<@X Object> g;
  @X List<@X ArrayList<@X Object>> h;
  @X List<@X ArrayList<@X Object>> i;

  Map<List<Object>, ArrayList<@X Integer>> j1;
  @X Map<List<@X Object>, @X ArrayList<@X Integer>> j2;
  @X Map<@X List<@X Object>, @X @Y ArrayList<@X Integer>> j3;

  @X @Y List k;
}
