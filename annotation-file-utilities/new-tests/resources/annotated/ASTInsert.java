import java.io.PrintStream;
import java.util.List;
import java.util.Map;

@interface Bla {}

public class ASTInsert {

    PrintStream out;
    private int c = ((@checkers.nullness.quals.Nullable int) (((@checkers.nullness.quals.Nullable int) (12)) + ((@checkers.nullness.quals.Nullable int) (13))));
    private String str = "this" + ((@checkers.nullness.quals.Nullable String) ("is")).concat(((@checkers.nullness.quals.Nullable String) ("string")));
    private @Bla String @Bla [] sa = new @Bla String @Bla [] {};

    void m() {
        int i;
    }

    int m(String y, String[] z, int i) {
        String x = ((@checkers.nullness.quals.Nullable String) (new String()));
        String s;
        s = ((@checkers.nullness.quals.Nullable String) (((@checkers.nullness.quals.Nullable String) (x)) + ((@checkers.nullness.quals.Nullable String) (x))));
        s = y;
        s = z[((@checkers.nullness.quals.Nullable int) (0))];
        s = x;
        int j = 0;
        switch (((@checkers.nullness.quals.Nullable int) (i + 2))) {
            case 1:
                j = i + ((@checkers.nullness.quals.Nullable int) (1));
                System.out.println(1);
                break;
            case 2:
                j = i + 2;
                System.out.println(((@checkers.nullness.quals.Nullable int) (2)));
                break;
            default:
                j = i + 3;
                System.out.println(-1);
        }
        j *= ((@checkers.nullness.quals.Nullable int) (i));
        j = s != x ? ((@checkers.nullness.quals.Nullable int) (j)) : i;
        do {
            int h = ((@checkers.nullness.quals.Nullable int) (i)) & j;
        } while (i < j);
        for (int i2 : new int[5]) {
            j = ((@checkers.nullness.quals.Nullable int) (i2));
        }
        for (int a = 0, b = ((@checkers.nullness.quals.Nullable int) (0)); a < ((@checkers.nullness.quals.Nullable int) (j)); a = ((@checkers.nullness.quals.Nullable int) (a + 1)), b++)
            a = ((@checkers.nullness.quals.Nullable int) (b));
        if (((@checkers.nullness.quals.Nullable int) (i)) < j)
            i = j;
        else
            j = ((@checkers.nullness.quals.Nullable int) (i));
        boolean b = ((@checkers.nullness.quals.Nullable String) (x)) instanceof String;
        label: b = ((@checkers.nullness.quals.Nullable boolean) (false));
        Object o = ((@checkers.nullness.quals.Nullable ASTInsert) (this)).out;
        m(y, z, ((@checkers.nullness.quals.Nullable int) (i)));
        int[][] test = new int[4][((@checkers.nullness.quals.Nullable int) (5))];
        int[][] test2 = {{1, 2}, {1, 2, ((@checkers.nullness.quals.Nullable int) (3))}};
        new String(((@checkers.nullness.quals.Nullable String) ("test")));
        if (i < 1)
            return ((@checkers.nullness.quals.Nullable int) (18));
        synchronized (o) {
            i = ((@checkers.nullness.quals.Nullable int) (i + i));
        }
        if (j < 1)
            throw ((@checkers.nullness.quals.Nullable IllegalStateException) (new IllegalStateException()));
        try {
            int t = ((@checkers.nullness.quals.Nullable int) (1));
        } catch (Error e) {
            i = j;
        } catch (RuntimeException e) {
            j = ((@checkers.nullness.quals.Nullable int) (i));
        } finally {
            j = i + ((@checkers.nullness.quals.Nullable int) (j));
        }
        j = (int) (i + ((@checkers.nullness.quals.Nullable int) (j)));
        j = - ((@checkers.nullness.quals.Nullable int) (j));
        while (i < ((@checkers.nullness.quals.Nullable int) (j)))
            i = ((@checkers.nullness.quals.Nullable int) (i)) + 1;
        ((@checkers.nullness.quals.Nullable ASTInsert) (this)).out.println();
        ((@checkers.nullness.quals.Nullable PrintStream) (System.out)).println();
        Object obj = ((@checkers.nullness.quals.Nullable @A @B @C Object) (null));
        return 0;
    }

    public <T> void invoc(T t1, T t2) {}
    public void context() {
        this.<@checkers.nullness.quals.NonNull String>invoc("a", null);
    }
}

class Wild<X extends List<? extends @Bla Object>> {
  Wild(@Bla Wild<X> n, X p) {
  }
}

class Unbound<X extends @A Object> {}

class Bound<@A X extends @B Object & @C Comparable<@D int @E []> & @F Map<@G ? extends @H Object, @I ?>, @J Y> {}
