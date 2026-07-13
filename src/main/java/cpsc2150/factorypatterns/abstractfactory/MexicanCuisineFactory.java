package cpsc2150.factorypatterns.abstractfactory;

import cpsc2150.factorypatterns.product.Drink;
import cpsc2150.factorypatterns.product.MainDish;
import cpsc2150.factorypatterns.product.SideDish;
import cpsc2150.factorypatterns.product.mexican.Horchata;
import cpsc2150.factorypatterns.product.mexican.RiceAndBeans;
import cpsc2150.factorypatterns.product.mexican.Tacos;

/** Concrete Abstract Factory for the Mexican product family. */
public final class MexicanCuisineFactory implements CuisineFactory {
  @Override
  public MainDish createMainDish() {
    return new Tacos();
  }

  @Override
  public SideDish createSideDish() {
    return new RiceAndBeans();
  }

  @Override
  public Drink createDrink() {
    return new Horchata();
  }
}
