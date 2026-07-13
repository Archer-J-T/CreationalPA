package cpsc2150.factorypatterns.factorymethod;

import cpsc2150.factorypatterns.abstractfactory.CuisineFactory;
import cpsc2150.factorypatterns.abstractfactory.ItalianCuisineFactory;

/** Concrete Factory Method creator for Italian meals. */
public final class ItalianMealService extends MealService {
  @Override
  protected CuisineFactory createCuisineFactory() {
    return new ItalianCuisineFactory();
  }
}
