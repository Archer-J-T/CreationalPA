package cpsc2150.factorymethodpattern.product;

/** Concrete product used for sea delivery. */
public final class Ship implements Transport {

  @Override
  public void deliver(String cargo) {
    System.out.println("Ship delivers \"" + cargo + "\" by sea.");
  }
}
