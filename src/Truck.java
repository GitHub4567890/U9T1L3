public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Truck number of axles: " + axles);
    System.out.println("Trailer: " + hasTrailer);
  }

  public boolean validateLicensePlate() {
    if (getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX") && axles >= 4 && hasTrailer) {
      return true;
    } else if (getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX") && axles <= 4 && hasTrailer) {
      return true;
    } else if (!hasTrailer) {
      return true;
    }
    return false;
  }

  @Override
  public double calculateTollPrice() {
    if (hasTrailer) {
      return (getTollFee() * axles) * 2;
    } else {
      return getTollFee() * axles;
    }
  }
}