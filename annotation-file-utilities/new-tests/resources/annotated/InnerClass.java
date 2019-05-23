public class InnerClass {

    void m() {
        @A(1) Object o = new @A(2) Object();
        if (o instanceof @A(3) String) {
            @A(4) String s = (@A(5) String) o;
        }

        class Inner {

            void m() {
                @B(1) Object o = new @B(2) Object();
                if (o instanceof @B(3) String) {
                    @B(4) String s = (@B(5) String) o;
                }
            }
        }

        new InnerClass() {

            void m() {
                @C(1) Object o = new @C(2) Object();
                if (o instanceof @C(3) String) {
                    @C(4) String s = (@C(5) String) o;
                }
            }
        };

        o = new @D(2) Object();
        if (o instanceof @D(3) String) {
            @D(4) String s = (@D(5) String) o;
        }
    }
}
