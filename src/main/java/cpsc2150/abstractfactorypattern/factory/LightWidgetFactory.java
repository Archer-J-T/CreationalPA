package cpsc2150.abstractfactorypattern.factory;

import cpsc2150.abstractfactorypattern.product.Button;
import cpsc2150.abstractfactorypattern.product.Checkbox;
import cpsc2150.abstractfactorypattern.product.TextField;
import cpsc2150.abstractfactorypattern.product.light.LightButton;
import cpsc2150.abstractfactorypattern.product.light.LightCheckbox;
import cpsc2150.abstractfactorypattern.product.light.LightTextField;

/** Concrete factory that creates a compatible light widget family. */
public final class LightWidgetFactory implements WidgetFactory {

  @Override
  public Button createButton() {
    return new LightButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new LightCheckbox();
  }

  @Override
  public TextField createTextField() {
    return new LightTextField();
  }
}
