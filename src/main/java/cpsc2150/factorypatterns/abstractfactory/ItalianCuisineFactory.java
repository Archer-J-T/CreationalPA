package cpsc2150.factorypatterns.abstractfactory;

import cpsc2150.factorypatterns.product.Drink;
import cpsc2150.factorypatterns.product.MainDish;
import cpsc2150.factorypatterns.product.SideDish;
import cpsc2150.factorypatterns.product.italian.GarlicBread;
import cpsc2150.factorypatterns.product.italian.Pasta;
import cpsc2150.factorypatterns.product.italian.SparklingWater;

/** Concrete Abstract Factory for the Italian product family. */
public final class ItalianCuisineFactory implements CuisineFactory {
  @Override
  public MainDish createMainDish() {
    return new Pasta();
  }

  @Override
  public SideDish createSideDish() {
    return new GarlicBread();
  }

  @Override
  public Drink createDrink() {
    return new SparklingWater();
  }
}
