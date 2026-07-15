package cpsc2150.abstractfactorypattern.product;

/** Third abstract product in the widget family. */
public interface TextField {

  /**
   * Returns a simple text representation of the text field.
   *
   * @param label label for the field
   * @param value current field value
   * @return rendered text field
   */
  String render(String label, String value);
}
