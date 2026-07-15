package cpsc2150.factorymethodpattern.product;

/** Concrete product used for road delivery. */
public final class Truck implements Transport {

  @Override
  public void deliver(String cargo) {
    System.out.println("Truck delivers \"" + cargo + "\" by road.");
  }
}
