package extra_assignment.model;

public class Truck extends Vehicles{
    private double loadingWeight;

    public Truck() {
    }

    public Truck(String numberPlate, String company, int manufacturingYear, String owner, double loadingWeight) {
        super(numberPlate, company, manufacturingYear, owner);
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
        return "Truck{" +
                super.toString() +
                "loadingWeight=" + loadingWeight +
                '}';
    }
}
