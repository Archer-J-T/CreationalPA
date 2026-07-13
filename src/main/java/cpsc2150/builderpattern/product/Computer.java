package cpsc2150.builderpattern.product;

/**
 * The product created by the Builder pattern.
 *
 * <p>The object is immutable. Its private constructor can only be called by the nested {@link
 * Builder}.
 */
public final class Computer {
  private final String processor;
  private final int memoryGb;
  private final int storageGb;
  private final String graphicsCard;
  private final String operatingSystem;
  private final boolean wifiEnabled;

  private Computer(Builder builder) {
    processor = builder.processor;
    memoryGb = builder.memoryGb;
    storageGb = builder.storageGb;
    graphicsCard = builder.graphicsCard;
    operatingSystem = builder.operatingSystem;
    wifiEnabled = builder.wifiEnabled;
  }

  public String getProcessor() {
    return processor;
  }

  public int getMemoryGb() {
    return memoryGb;
  }

  public int getStorageGb() {
    return storageGb;
  }

  public String getGraphicsCard() {
    return graphicsCard;
  }

  public String getOperatingSystem() {
    return operatingSystem;
  }

  public boolean isWifiEnabled() {
    return wifiEnabled;
  }

  @Override
  public String toString() {
    return "Computer"
        + System.lineSeparator()
        + "  Processor: "
        + processor
        + System.lineSeparator()
        + "  Memory: "
        + memoryGb
        + " GB"
        + System.lineSeparator()
        + "  Storage: "
        + storageGb
        + " GB"
        + System.lineSeparator()
        + "  Graphics: "
        + graphicsCard
        + System.lineSeparator()
        + "  Operating system: "
        + operatingSystem
        + System.lineSeparator()
        + "  Wi-Fi: "
        + (wifiEnabled ? "enabled" : "disabled");
  }

  /**
   * BUILDER: constructs a Computer through readable, optional steps. Processor and memory are
   * required; the remaining values have defaults.
   */
  public static class Builder {
    private final String processor;
    private final int memoryGb;

    private int storageGb = 256;
    private String operatingSystem = "Linux";
    private boolean wifiEnabled = false;
    private boolean bluetoothEnabled = false;
    private String graphicsCard = "Integrated";
    private String caseColor = "Black";

    public Builder(String processor, int memoryGb) {
      this.processor = processor;
      this.memoryGb = memoryGb;
    }

    public Builder storageGb(int storageGb) {
      this.storageGb = storageGb;
      return this;
    }

    public Builder operatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
      return this;
    }

    public Builder wifiEnabled(boolean wifiEnabled) {
      this.wifiEnabled = wifiEnabled;
      return this;
    }

    public Builder bluetoothEnabled(boolean bluetoothEnabled) {
      this.bluetoothEnabled = bluetoothEnabled;
      return this;
    }

    public Builder graphicsCard(String graphicsCard) {
      this.graphicsCard = graphicsCard;
      return this;
    }

    public Builder caseColor(String caseColor) {
      this.caseColor = caseColor;
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }
  }
}
