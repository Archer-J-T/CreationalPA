package cpsc2150.factorypatterns.client;

import cpsc2150.factorypatterns.factorymethod.ItalianMealService;
import cpsc2150.factorypatterns.factorymethod.MealService;
import cpsc2150.factorypatterns.factorymethod.MexicanMealService;
import cpsc2150.factorypatterns.model.Meal;

/**
 * CLIENT CODE for the Factory Method and Abstract Factory example.
 *
 * <p>The client depends on the abstract MealService type. Selecting a concrete service selects the
 * cuisine family without exposing concrete food products.
 */
public final class FactoryPatternsClient {
  private FactoryPatternsClient() {}

  public static void main(String[] args) {
    MealService italianContext = new ItalianMealService();
    MealService mexicanContext = new MexicanMealService();

    Meal italianMeal = italianContext.prepareMeal();
    Meal mexicanMeal = mexicanContext.prepareMeal();

    System.out.println("ITALIAN FAMILY");
    System.out.println(italianMeal);
    System.out.println();

    System.out.println("MEXICAN FAMILY");
    System.out.println(mexicanMeal);
  }
}
