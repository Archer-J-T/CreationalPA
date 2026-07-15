package cpsc2150.factorymethodpattern.product;

/** Product abstraction created by the Factory Method. */
public interface Transport {

  /**
   * Delivers the supplied cargo.
   *
   * @param cargo description of the cargo being delivered
   */
  void deliver(String cargo);
}
