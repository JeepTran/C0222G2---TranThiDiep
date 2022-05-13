package extra_practice.VehicleManagement.models;

public class Truck extends Vehicle {
    private double loadingWeight;

    public Truck() {
    }

    public Truck(String signalPlate, String manufacturer, Integer manufacturingYear,
                 String owner, double loadingWeight) {
        super(signalPlate, manufacturer, manufacturingYear, owner);
        this.loadingWeight = loadingWeight;
    }

    public double getLoadingWeight() {
        return loadingWeight;
    }

    public void setLoadingWeight(double loadingWeight) {
        this.loadingWeight = loadingWeight;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                ", loadingWeight=" + loadingWeight +
                '}';
    }
}
