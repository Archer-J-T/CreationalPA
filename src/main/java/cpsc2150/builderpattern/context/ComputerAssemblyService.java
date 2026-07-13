package cpsc2150.builderpattern.context;

import cpsc2150.builderpattern.product.Computer;

/**
 * BUILDER CONTEXT / DIRECTOR.
 *
 * <p>This class stores common construction recipes. It decides which Builder steps to call, but the
 * Builder creates the final Computer.
 */
public final class ComputerAssemblyService {

  public Computer buildOfficeComputer() {
    return new Computer.Builder("Intel Core i7", 16)
        .storageGb(512)
        .operatingSystem("Linux")
        .build();
  }

  public Computer buildGamingComputer() {
    return new Computer.Builder("AMD Ryzen 9", 32)
        .storageGb(2000)
        .graphicsCard("AMD 9070XT")
        .operatingSystem("Windows")
        .build();
  }
}
