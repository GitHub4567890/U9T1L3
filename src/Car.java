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

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Electric: " + electric);
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

  @Override
  public double calculateTollPrice() {
    if (getPassengers() <= 4) {
      return super.calculateTollPrice();
    } else {
      return getTollFee() * 4;
    }
  }

}