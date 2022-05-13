package extra_practice.VehicleManagement.models;

public abstract class Vehicle {
    private String signalPlate;
    private String manufacturer;
    private Integer manufacturingYear;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String signalPlate, String manufacturer, Integer manufacturingYear, String owner) {
        this.signalPlate = signalPlate;
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
        this.owner = owner;
    }

    public String getSignalPlate() {
        return signalPlate;
    }

    public void setSignalPlate(String signalPlate) {
        this.signalPlate = signalPlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(Integer manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "signalPlate='" + signalPlate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", owner='" + owner;
    }
    public String getInfo(String  delimiter){
        return this.signalPlate + delimiter + this.manufacturer + delimiter +
                this.manufacturingYear + delimiter + this.owner;
    }
}
