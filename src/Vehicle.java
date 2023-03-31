public class Vehicle {
  private String licensePlate;
  private double tollFee;
  private int passengers;
  public boolean lights;

  public Vehicle(String licensePlate, double tollFee, int passengers) {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public double getTollFee() {
    return tollFee;
  }

  public void setTollFee(double tollFee) {
    this.tollFee = tollFee;
  }

  public int getPassengers() {
    return passengers;
  }

  public void setPassengers(int passengers) {
    this.passengers = passengers;
  }

  public double calculateTollPrice() {
    return tollFee * passengers;
  }

  public void printInfo() {
    System.out.println("License plate: " + licensePlate);
    System.out.println("Toll fee: " + tollFee);
    System.out.println("Passengers: " + passengers);
  }

  public boolean lights(boolean onOffHL) {
    lights = onOffHL;
    return lights;
  }
}