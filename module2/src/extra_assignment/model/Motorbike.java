package extra_assignment.model;

public class Motorbike extends Vehicles{
    private double capacity;

    public Motorbike() {
    }

    public Motorbike(String numberPlate, String company, int manufacturingYear, String owner, double capacity) {
        super(numberPlate, company, manufacturingYear, owner);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                super.toString() +
                "capacity=" + capacity +
                '}';
    }
}
