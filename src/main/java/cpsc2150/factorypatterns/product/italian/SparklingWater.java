package cpsc2150.factorypatterns.product.italian;

import cpsc2150.factorypatterns.product.Drink;

/** Concrete Italian drink product. */
public final class SparklingWater implements Drink {
  @Override
  public String name() {
    return "Sparkling water";
  }
}
