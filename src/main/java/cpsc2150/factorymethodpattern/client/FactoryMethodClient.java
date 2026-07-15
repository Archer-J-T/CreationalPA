package cpsc2150.factorymethodpattern.client;

import cpsc2150.factorymethodpattern.context.DeliveryService;
import cpsc2150.factorymethodpattern.context.RoadDeliveryService;
import cpsc2150.factorymethodpattern.context.SeaDeliveryService;

/**
 * Client code for the standalone Factory Method example.
 *
 * <p>The client selects a concrete creator. It then works through the DeliveryService abstraction
 * and does not directly construct a Truck or Ship.
 */
public final class FactoryMethodClient {

  private FactoryMethodClient() {
    // Utility class; do not instantiate.
  }

  public static void main(String[] args) {

    DeliveryService service = new RoadDeliveryService();
    runDelivery("LAND DELIVERY", service, "Computers");

    service = new SeaDeliveryService();
    runDelivery("SEA DELIVERY", service, "Computers");
  }

  private static void runDelivery(String heading, DeliveryService service, String cargo) {
    System.out.println(heading);
    service.scheduleDelivery(cargo);
    System.out.println();
  }
}
