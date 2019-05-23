package annotator.tests;

public class ConstructorReceivers {
    class C0 {
        public C0(@checkers.tainting.quals.Tainted ConstructorReceivers ConstructorReceivers.this) {}
        public   C0(@checkers.tainting.quals.Tainted ConstructorReceivers ConstructorReceivers.this, int i) {}
    }

    class C1 {
        public C1(@checkers.tainting.quals.Tainted ConstructorReceivers ConstructorReceivers.this) {}
        public   C1(@checkers.tainting.quals.Tainted ConstructorReceivers ConstructorReceivers.this, int i) {}
    }

    class C2 {
        public C2(@checkers.tainting.quals.Tainted @annotation.A @annotation.B @annotation.C ConstructorReceivers ConstructorReceivers.this) {}
    }

    class C3 {
        public C3(@checkers.tainting.quals.Tainted @annotation.A @annotation.B @annotation.C ConstructorReceivers ConstructorReceivers.this) {}
    }

    class P0<K, V> {
        class C4 {
            public C4(@checkers.tainting.quals.Tainted ConstructorReceivers.P0<K, V> ConstructorReceivers.P0.this) {}

            public C4(@checkers.tainting.quals.Tainted ConstructorReceivers.P0<K, V> ConstructorReceivers.P0.this, int i) {}
        }

        class C5 {
            public C5(@checkers.tainting.quals.Tainted ConstructorReceivers.P0<K, V> ConstructorReceivers.P0.this) {}

            public C5(@checkers.tainting.quals.Tainted ConstructorReceivers.P0<K, V> ConstructorReceivers.P0.this, int i) {}
        }

        class C6 {
            public C6(@checkers.tainting.quals.Tainted ConstructorReceivers.P0<K, V> ConstructorReceivers.P0.this) {}

            public C6(@checkers.tainting.quals.Tainted ConstructorReceivers.P0<@annotation.Inner(0) K, @annotation.Inner(1) V> ConstructorReceivers.P0.this, ConstructorReceivers.P0<K, V> other) {}
        }

        class C7 {
            public C7(@checkers.tainting.quals.Tainted ConstructorReceivers.P0<K, V> ConstructorReceivers.P0.this) {}

            public C7(@checkers.tainting.quals.Tainted ConstructorReceivers.P0<@annotation.Inner(0) K, @annotation.Inner(1) V> ConstructorReceivers.P0.this, ConstructorReceivers.P0<K, V> other) {}
        }
    }

    class P1<K extends Object, V> {
        class C8 {
            public C8(@checkers.tainting.quals.Tainted ConstructorReceivers.P1<@annotation.Inner(0) K, @annotation.Inner(1) V> ConstructorReceivers.P1.this) {}
        }

        class C9 {
            public C9(@checkers.tainting.quals.Tainted ConstructorReceivers.P1<@annotation.Inner(0) K, @annotation.Inner(1) V> ConstructorReceivers.P1.this) {}
        }
    }
}

