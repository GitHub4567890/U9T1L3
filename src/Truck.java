public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck() {
    System.out.println("Truck license plate: " + super.getLicensePlate());
    System.out.println("Truck toll fee: " + super.getTollFee());
    System.out.println("Truck number of passengers: " + super.getPassengers());
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
}