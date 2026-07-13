package cpsc2150.factorypatterns.factorymethod;

import cpsc2150.factorypatterns.abstractfactory.CuisineFactory;
import cpsc2150.factorypatterns.abstractfactory.MexicanCuisineFactory;

/** Concrete Factory Method creator for Mexican meals. */
public final class MexicanMealService extends MealService {
  @Override
  protected CuisineFactory createCuisineFactory() {
    return new MexicanCuisineFactory();
  }
}
