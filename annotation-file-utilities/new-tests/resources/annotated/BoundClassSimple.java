package annotator.tests;

import java.util.Date;

public class BoundClassSimple<T extends @java.lang.Tainted Date> {
  T field = null;
  Date misleadingField = new Date();
}
