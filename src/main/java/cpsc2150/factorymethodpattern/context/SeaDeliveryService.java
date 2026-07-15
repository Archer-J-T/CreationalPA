package cpsc2150.factorymethodpattern.context;

import cpsc2150.factorymethodpattern.product.Ship;
import cpsc2150.factorymethodpattern.product.Transport;

/** Concrete creator that chooses a Ship. */
public final class SeaDeliveryService extends DeliveryService {

  @Override
  protected Transport createTransport() {
    return new Ship();
  }
}
