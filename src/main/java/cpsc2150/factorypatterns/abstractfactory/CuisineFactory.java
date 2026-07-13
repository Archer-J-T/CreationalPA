package cpsc2150.factorypatterns.abstractfactory;

import cpsc2150.factorypatterns.product.Drink;
import cpsc2150.factorypatterns.product.MainDish;
import cpsc2150.factorypatterns.product.SideDish;

/** ABSTRACT FACTORY. Creates a family of three related products without naming concrete classes. */
public interface CuisineFactory {
  MainDish createMainDish();

  SideDish createSideDish();

  Drink createDrink();
}
