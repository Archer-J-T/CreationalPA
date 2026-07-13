package cpsc2150.factorypatterns.product.italian;

import cpsc2150.factorypatterns.product.MainDish;

/** Concrete Italian main-dish product. */
public final class Pasta implements MainDish {
  @Override
  public String name() {
    return "Pasta primavera";
  }
}
