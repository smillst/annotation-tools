import java.util.List;
import java.util.Map;

@interface Bla {}

public class WildcardAnnoBound<X extends List<? extends @Bla Object>> {
  WildcardAnnoBound(@Bla WildcardAnnoBound<X> n, X p) {
  }
}

class NoBound<X extends @A Object> {}

class Bounds<@A X extends @B Object & @C Comparable<@D int @E []> & @F Map<@G ? extends @H Object, @I ?>, @J Y> {}
