package cpsc2150.factorypatterns.product.mexican;

import cpsc2150.factorypatterns.product.Drink;

/** Concrete Mexican drink product. */
public final class Horchata implements Drink {
  @Override
  public String name() {
    return "Horchata";
  }
}
