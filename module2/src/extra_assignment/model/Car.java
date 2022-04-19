package extra_assignment.model;

public class Car extends Vehicles{
    private int seatTotal;
    private String carType;

    public Car() {
    }

    public Car(String numberPlate, String company, int manufacturingYear, String owner, int seatTotal, String carType) {
        super(numberPlate, company, manufacturingYear, owner);
        this.seatTotal = seatTotal;
        this.carType = carType;
    }

    public int getSeatTotal() {
        return seatTotal;
    }

    public void setSeatTotal(int seatTotal) {
        this.seatTotal = seatTotal;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "seatTotal=" + seatTotal +
                ", carType='" + carType + '\'' +
                '}';
    }
}
