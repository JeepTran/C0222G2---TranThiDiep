package extra_practice.VehicleManagement.models;

public class Car extends Vehicle {
    private Integer seatTotal;
    private String carType; //du lịch, xe khách

    public Car() {
    }

    public Car(String signalPlate, String manufacturer, Integer manufacturingYear,
               String owner, Integer seatTotal, String carType) {
        super(signalPlate, manufacturer, manufacturingYear, owner);
        this.seatTotal = seatTotal;
        this.carType = carType;
    }

    public Integer getSeatTotal() {
        return seatTotal;
    }

    public void setSeatTotal(Integer seatTotal) {
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
        return "Car{" + super.toString() +
                ", seatTotal=" + seatTotal +
                ", carType='" + carType + '\'' +
                '}';
    }

    public String getInfo(String delimiter) {
        return super.getInfo(delimiter) + delimiter +
                this.seatTotal + delimiter + this.carType;
    }
}
