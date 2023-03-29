public class Taxi extends Car {
    double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printTaxi() {
        System.out.println("Taxi license plate: " + super.getLicensePlate());
        System.out.println("Taxi toll fee: " + super.getTollFee());
        System.out.println("Taxi number of passengers: " + super.getPassengers());
        System.out.println("Taxi electric: " + super.isElectric());
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
}