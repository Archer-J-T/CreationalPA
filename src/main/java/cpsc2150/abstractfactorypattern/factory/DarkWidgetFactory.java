package cpsc2150.abstractfactorypattern.factory;

import cpsc2150.abstractfactorypattern.product.Button;
import cpsc2150.abstractfactorypattern.product.Checkbox;
import cpsc2150.abstractfactorypattern.product.TextField;
import cpsc2150.abstractfactorypattern.product.dark.DarkButton;
import cpsc2150.abstractfactorypattern.product.dark.DarkCheckbox;
import cpsc2150.abstractfactorypattern.product.dark.DarkTextField;

/** Concrete factory that creates a compatible dark widget family. */
public final class DarkWidgetFactory implements WidgetFactory {

  @Override
  public Button createButton() {
    return new DarkButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new DarkCheckbox();
  }

  @Override
  public TextField createTextField() {
    return new DarkTextField();
  }
}
