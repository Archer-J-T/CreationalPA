package cpsc2150.abstractfactorypattern.context;

import cpsc2150.abstractfactorypattern.factory.WidgetFactory;
import cpsc2150.abstractfactorypattern.product.Button;
import cpsc2150.abstractfactorypattern.product.Checkbox;
import cpsc2150.abstractfactorypattern.product.TextField;

/**
 * Context that needs a compatible family of widgets.
 *
 * <p>The context depends only on the abstract factory and abstract product interfaces. It does not
 * know whether it received light or dark widgets.
 */
public final class SettingsScreen {

  private final Button saveButton;
  private final Checkbox notificationsCheckbox;
  private final TextField usernameField;

  public SettingsScreen(WidgetFactory factory) {
    if (factory == null) {
      throw new IllegalArgumentException("Widget factory cannot be null.");
    }

    saveButton = factory.createButton();
    notificationsCheckbox = factory.createCheckbox();
    usernameField = factory.createTextField();
  }

  /** Displays the three widgets created by one factory. */
  public void render() {
    System.out.println(usernameField.render("Username", "student"));
    System.out.println(notificationsCheckbox.render("Enable notifications", true));
    System.out.println(saveButton.render("Save"));
  }
}
