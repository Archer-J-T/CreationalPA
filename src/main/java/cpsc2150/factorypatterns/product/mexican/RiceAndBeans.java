package cpsc2150.factorypatterns.product.mexican;

import cpsc2150.factorypatterns.product.SideDish;

/** Concrete Mexican side-dish product. */
public final class RiceAndBeans implements SideDish {
  @Override
  public String name() {
    return "Rice and beans";
  }
}
