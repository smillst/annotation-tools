package annotator.tests;

import java.util.List;

public class FieldGenericArray {
  @InsideArray List<@GenericType Integer> @OuterMostType [] field;
}
