import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
@interface Nullable {}
@Target(ElementType.TYPE_USE)
@interface NonNull {}

@skip-test
public class NewInAnnotatedVariable {
  Number b1 = new @NonNull Integer(0);
  @NonNull Object b2 = new @Nullable @NonNull Double(1);
  @NonNull Runnable b3 = new @NonNull Thread();
  @NonNull
  ThreadLocal @NonNull [] b4 = new @NonNull InheritableThreadLocal @NonNull [3];
}

