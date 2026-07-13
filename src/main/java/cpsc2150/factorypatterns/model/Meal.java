package cpsc2150.factorypatterns.model;

import cpsc2150.factorypatterns.product.Drink;
import cpsc2150.factorypatterns.product.MainDish;
import cpsc2150.factorypatterns.product.SideDish;

/**
 * The final object assembled by the Factory Method context. This project intentionally uses a
 * normal constructor rather than Builder.
 */
public final class Meal {
  private final MainDish mainDish;
  private final SideDish sideDish;
  private final Drink drink;

  public Meal(MainDish mainDish, SideDish sideDish, Drink drink) {
    if (mainDish == null || sideDish == null || drink == null) {
      throw new IllegalArgumentException("Every meal requires all three products.");
    }
    this.mainDish = mainDish;
    this.sideDish = sideDish;
    this.drink = drink;
  }

  public MainDish getMainDish() {
    return mainDish;
  }

  public SideDish getSideDish() {
    return sideDish;
  }

  public Drink getDrink() {
    return drink;
  }

  @Override
  public String toString() {
    return "Meal"
        + System.lineSeparator()
        + "  Main dish: "
        + mainDish.name()
        + System.lineSeparator()
        + "  Side dish: "
        + sideDish.name()
        + System.lineSeparator()
        + "  Drink: "
        + drink.name();
  }
}
