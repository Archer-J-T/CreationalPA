package cpsc2150.factorymethodpattern.context;

import cpsc2150.factorymethodpattern.product.Transport;

/**
 * Abstract creator and context for the Factory Method pattern.
 *
 * <p>The context owns the stable delivery workflow. Subclasses implement {@link #createTransport()}
 * to decide which concrete product the workflow uses.
 */
public abstract class DeliveryService {

  /**
   * Factory Method. A concrete creator overrides this method to create the transport appropriate
   * for that delivery service.
   *
   * @return a transport used by the delivery workflow
   */
  protected abstract Transport createTransport();

  /**
   * Context operation that uses the product returned by the Factory Method.
   *
   * @param cargo description of the cargo being delivered
   */
  public final void scheduleDelivery(String cargo) {
    if (cargo == null || cargo.trim().isEmpty()) {
      throw new IllegalArgumentException("Cargo cannot be blank.");
    }

    Transport transport = createTransport();

    System.out.println("Preparing delivery for: " + cargo);
    transport.deliver(cargo);
  }
}
