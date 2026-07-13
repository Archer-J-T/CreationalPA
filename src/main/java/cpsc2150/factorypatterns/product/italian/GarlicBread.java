package cpsc2150.factorypatterns.product.italian;

import cpsc2150.factorypatterns.product.SideDish;

/** Concrete Italian side-dish product. */
public final class GarlicBread implements SideDish {
  @Override
  public String name() {
    return "Garlic bread";
  }
}
