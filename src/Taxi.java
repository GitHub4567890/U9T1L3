public class Taxi extends Car {
    double fareCollected;
    boolean signLight;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Electric: " + super.isElectric());
        System.out.println("Discount applied: " + super.isDiscountApplied());
        System.out.println("Fare collected: " + fareCollected);
    }

    @Override
    public void applyDiscount() {
        if (!isDiscountApplied() && (getPassengers() >= 4 || isElectric())) {
            super.setTollFee(super.getTollFee() / 2);
            setDiscountApplied(true);
        }
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        applyDiscount();
    }

    public boolean chargeAndDropOffRiders (double farePerRider) {
        fareCollected += (getPassengers() - 1) * farePerRider;
        return dropOffPassengers(getPassengers() - 1);
    }

    @Override
    public boolean lights(boolean onOffHL) {
        super.lights(onOffHL);
        signLight = onOffHL;
        return signLight;
    }


}