package cpsc2150.abstractfactorypattern.product.light;

import cpsc2150.abstractfactorypattern.product.Checkbox;

/** Concrete Checkbox belonging to the light widget family. */
public final class LightCheckbox implements Checkbox {

  @Override
  public String render(String label, boolean checked) {
    String marker = checked ? "x" : " ";
    return "[Light Checkbox " + marker + ": " + label + "]";
  }
}
