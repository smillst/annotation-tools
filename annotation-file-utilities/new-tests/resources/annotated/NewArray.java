import java.util.ArrayList;
import java.util.List;

public class NewArray {
     private static final int MAX_HOOKS = 10;
     private static final Runnable[] hooks = new @Nullable Runnable[MAX_HOOKS];

     String[] names01 = new @X String[12];

     String[] names02 = new @X String[] { "Alice", "Bob"};

     String[] names03 = new @X String[] { "Alice", "Bob"};

     static final int[] table1 = new @A int @B [] {0, 1};
     static final int table2[] = new @A int @B [] {0, 1};

     String[][][][][] names0 = new String @Z [11][12][13][14][15];
     String[][][][][] names1 = new String[11] @A [12][13][14][15];
     String[][][][][] names2 = new String[11][12] @B [13][14][15];
     String[][][][][] names3 = new String[11][12][13] @C [14][15];
     String[][][][][] names4 = new String[11][12][13][14] @D [15];
     String[][][][][] names5 = new @E String[11][12][13][14][15];

     Object names10 = new String @Z [][][][][] { { { }}};
     Object names11 = new String[] @A [][][][] { { { }}};
     Object names12 = new String[][] @B [][][] { { { }}};
     Object names13 = new String[][][] @C [][] { { { }}};
     Object names14 = new String[][][][] @D [] { { { }}};
     Object names15 = new @E String[][][][][] { { { }}};

     @Z
     List<@A ?> @B [] lists = new @C ArrayList<@D ?> @E [2];
}
