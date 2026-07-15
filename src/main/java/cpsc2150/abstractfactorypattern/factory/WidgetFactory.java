package cpsc2150.abstractfactorypattern.factory;

import cpsc2150.abstractfactorypattern.product.Button;
import cpsc2150.abstractfactorypattern.product.Checkbox;
import cpsc2150.abstractfactorypattern.product.TextField;

/** Abstract Factory for a family of three related widget products. */
public interface WidgetFactory {

  Button createButton();

  Checkbox createCheckbox();

  TextField createTextField();
}
