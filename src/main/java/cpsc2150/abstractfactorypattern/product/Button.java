package cpsc2150.abstractfactorypattern.product;

/** First abstract product in the widget family. */
public interface Button {

  /**
   * Returns a simple text representation of the button.
   *
   * @param label text shown by the button
   * @return rendered button
   */
  String render(String label);
}
