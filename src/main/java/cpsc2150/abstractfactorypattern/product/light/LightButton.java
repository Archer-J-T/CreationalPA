package cpsc2150.abstractfactorypattern.product.light;

import cpsc2150.abstractfactorypattern.product.Button;

/** Concrete Button belonging to the light widget family. */
public final class LightButton implements Button {

  @Override
  public String render(String label) {
    return "[Light Button: " + label + "]";
  }
}
