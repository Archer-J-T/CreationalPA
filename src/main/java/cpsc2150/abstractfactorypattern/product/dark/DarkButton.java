package cpsc2150.abstractfactorypattern.product.dark;

import cpsc2150.abstractfactorypattern.product.Button;

/** Concrete Button belonging to the dark widget family. */
public final class DarkButton implements Button {

  @Override
  public String render(String label) {
    return "[Dark Button: " + label + "]";
  }
}
