public class AnnotationEnumFieldInsertion {
    void test() {
        @fakeChecker.qual.Annotation(values={fakeChecker.qual.EnumClass.ENUM_CONSTANT})
        int i = 1;
    }
}
