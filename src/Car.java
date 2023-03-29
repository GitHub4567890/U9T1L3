public class Car extends Vehicle {
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }

  public void setDiscountApplied(boolean discountApplied) {
    this.discountApplied = discountApplied;
  }

  public void printCar() {
    System.out.println("Car license plate: " + super.getLicensePlate());
    System.out.println("Car toll fee: " + super.getTollFee());
    System.out.println("Car number of passengers: " + super.getPassengers());
    System.out.println("Car electric: " + electric);
    System.out.println("Discount applied: " + discountApplied);
  }

  public boolean dropOffPassengers(int numOut) {
    if (numOut < super.getPassengers()) {
      super.setPassengers(super.getPassengers() - numOut);
      return true;
    } else {
      return false;
    }
  }

  public void applyDiscount() {
    if (!discountApplied && electric) {
      super.setTollFee(super.getTollFee() / 2);
      discountApplied = true;
    }
  }

}