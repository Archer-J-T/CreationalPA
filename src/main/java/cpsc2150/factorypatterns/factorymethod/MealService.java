package cpsc2150.factorypatterns.factorymethod;

import cpsc2150.factorypatterns.abstractfactory.CuisineFactory;
import cpsc2150.factorypatterns.model.Meal;

/**
 * FACTORY METHOD CONTEXT / ABSTRACT CREATOR.
 *
 * <p>This class is also the client of the Abstract Factory: it uses the CuisineFactory interface
 * without knowing any concrete cuisine products.
 *
 * <p>{@link #prepareMeal()} is the stable context operation. {@link #createCuisineFactory()} is the
 * Factory Method that subclasses override to choose a concrete Abstract Factory.
 */
public abstract class MealService {

  /** Factory Method. */
  protected abstract CuisineFactory createCuisineFactory();

  /** Context operation that uses the object returned by the Factory Method. */
  public final Meal prepareMeal() {
    CuisineFactory factory = createCuisineFactory();

    return new Meal(factory.createMainDish(), factory.createSideDish(), factory.createDrink());
  }
}
