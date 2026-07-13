package cpsc2150.builderpattern.client;

import cpsc2150.builderpattern.context.ComputerAssemblyService;
import cpsc2150.builderpattern.product.Computer;

/** CLIENT CODE for the Builder pattern example. */
public final class BuilderPatternClient {
  private BuilderPatternClient() {}

  public static void main(String[] args) {
    ComputerAssemblyService context = new ComputerAssemblyService();

    Computer officeComputer = context.buildOfficeComputer();
    Computer gamingComputer = context.buildGamingComputer();

    // The client may also use the Builder directly for a custom product.
    Computer customComputer =
        new Computer.Builder("Apple M-series", 24)
            .storageGb(1000)
            .operatingSystem("macOS")
            .wifiEnabled(true)
            .build();

    System.out.println("OFFICE CONFIGURATION");
    System.out.println(officeComputer);
    System.out.println();

    System.out.println("GAMING CONFIGURATION");
    System.out.println(gamingComputer);
    System.out.println();

    System.out.println("CUSTOM CONFIGURATION");
    System.out.println(customComputer);
  }
}
