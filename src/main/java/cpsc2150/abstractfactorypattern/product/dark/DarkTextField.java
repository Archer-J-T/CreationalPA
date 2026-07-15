package cpsc2150.abstractfactorypattern.product.dark;

import cpsc2150.abstractfactorypattern.product.TextField;

/** Concrete TextField belonging to the dark widget family. */
public final class DarkTextField implements TextField {

  @Override
  public String render(String label, String value) {
    return "[Dark Text Field: " + label + " = " + value + "]";
  }
}
