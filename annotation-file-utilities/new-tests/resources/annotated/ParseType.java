import java.util.Map;

public class ParseType<E> {
    void m(Object o) {
        Object o0 = ((@A String) (o));
        Object o1 = ((@A Map<String, Integer>) (o));
        Object o2 = ((String @A []) (o));
        Object o3 = ((String[] @A []) (o));
        Object o4 = ((@A Map<String[], Integer>) (o));
        Object o5 = ((@A Map<String[][], Integer>) (o));
        Object o6 = ((@A Map<?, ?>) (o));
        Object o7 = ((@A Map<? extends String, ? super List<Integer>>) (o));
        Object o8 = ((@A Map<List<String>, List<String>[]>) (o));
        Object o9 = ((@A Map.Entry<String, Integer>) (o));
        Object o10 = ((Map.Entry<String, Integer> @A []) (o));
        Object o11 = ((ParseType<String>.Inner<Integer> @A []) (o));
    }

    public class Inner<K> {}
}
