package cpsc2150.abstractfactorypattern.product.light;

import cpsc2150.abstractfactorypattern.product.TextField;

/** Concrete TextField belonging to the light widget family. */
public final class LightTextField implements TextField {

  @Override
  public String render(String label, String value) {
    return "[Light Text Field: " + label + " = " + value + "]";
  }
}
