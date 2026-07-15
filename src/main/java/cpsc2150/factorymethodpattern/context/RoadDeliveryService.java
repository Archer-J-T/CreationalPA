package cpsc2150.factorymethodpattern.context;

import cpsc2150.factorymethodpattern.product.Transport;
import cpsc2150.factorymethodpattern.product.Truck;

/** Concrete creator that chooses a Truck. */
public final class RoadDeliveryService extends DeliveryService {

  @Override
  protected Transport createTransport() {
    return new Truck();
  }
}
