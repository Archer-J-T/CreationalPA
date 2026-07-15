package cpsc2150.abstractfactorypattern.product.dark;

import cpsc2150.abstractfactorypattern.product.Checkbox;

/** Concrete Checkbox belonging to the dark widget family. */
public final class DarkCheckbox implements Checkbox {

  @Override
  public String render(String label, boolean checked) {
    String marker = checked ? "x" : " ";
    return "[Dark Checkbox " + marker + ": " + label + "]";
  }
}
