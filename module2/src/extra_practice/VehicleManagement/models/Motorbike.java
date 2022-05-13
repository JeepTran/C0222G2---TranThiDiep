package extra_practice.VehicleManagement.models;

public class Motorbike extends Vehicle {
    private double capicity; //(công suất)

    public Motorbike() {
    }

    public Motorbike(String signalPlate, String manufacturer, Integer manufacturingYear,
                     String owner, double capicity) {
        super(signalPlate, manufacturer, manufacturingYear, owner);
        this.capicity = capicity;
    }

    public double getCapicity() {
        return capicity;
    }

    public void setCapicity(double capicity) {
        this.capicity = capicity;
    }

    @Override
    public String toString() {
        return "Motorbike{" + super.toString() +
                ", capicity=" + capicity +
                '}';
    }
}
