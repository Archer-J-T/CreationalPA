package cpsc2150.abstractfactorypattern.product;

/** Second abstract product in the widget family. */
public interface Checkbox {

  /**
   * Returns a simple text representation of the checkbox.
   *
   * @param label text shown beside the checkbox
   * @param checked whether the checkbox is selected
   * @return rendered checkbox
   */
  String render(String label, boolean checked);
}
