package cpsc2150.factorypatterns.product.mexican;

import cpsc2150.factorypatterns.product.MainDish;

/** Concrete Mexican main-dish product. */
public final class Tacos implements MainDish {
  @Override
  public String name() {
    return "Tacos";
  }
}
