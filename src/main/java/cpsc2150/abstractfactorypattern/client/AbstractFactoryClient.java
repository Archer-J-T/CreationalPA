package cpsc2150.abstractfactorypattern.client;

import cpsc2150.abstractfactorypattern.context.SettingsScreen;
import cpsc2150.abstractfactorypattern.factory.DarkWidgetFactory;
import cpsc2150.abstractfactorypattern.factory.LightWidgetFactory;
import cpsc2150.abstractfactorypattern.factory.WidgetFactory;

/**
 * Client code for the standalone Abstract Factory example.
 *
 * <p>The client selects one concrete factory and gives it to the context. The context then receives three matching products from that family.
 */
public final class AbstractFactoryClient {

  private AbstractFactoryClient() {
    // Utility class; do not instantiate.




  }

  public static void main(String[] args) {
    WidgetFactory lightFactory = new LightWidgetFactory();
    showSettingsScreen("LIGHT THEME", lightFactory);

    WidgetFactory darkFactory = new DarkWidgetFactory();
    showSettingsScreen("DARK THEME", darkFactory);
  }

  private static void showSettingsScreen(String heading, WidgetFactory factory) {
    System.out.println(heading);

    SettingsScreen screen = new SettingsScreen(factory);
    screen.render();

    System.out.println();
  }
}
